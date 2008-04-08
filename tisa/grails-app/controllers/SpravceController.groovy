            
class SpravceController extends AdminController {
    
    def defaultAction = "list"

    // the delete, save and update actions only accept POST requests
    def allowedMethods = [delete:'POST', save:'POST', update:'POST']

    def where = "Spravce"
    
    def list = {
        if(!params.max) params.max = 10
        [ spravceList: Spravce.list( params ) ]
    }

    def show = {
        def spravce = Spravce.get( params.id )
        if(!spravce) {
            flash.message = message(code:"tisa.controllers.notfound", args:["${where}", "${params.id}"]) 
            redirect(action:list)
        }
        else { return [ spravce : spravce ] }
    }

    def delete = {
        def spravce = Spravce.get( params.id )
        if(spravce) {
            spravce.delete()
            flash.message = message(code:"tisa.controllers.deleted", args:["${where}", "${params.id}"]) 
            redirect(action:list)
        }
        else {
            flash.message = message(code:"tisa.controllers.notfound", args:["${where}", "${params.id}"]) 
            redirect(action:list)
        }
    }

    def edit = {
        def spravce = Spravce.get( params.id )

        if(!spravce) {
            flash.message = message(code:"tisa.controllers.notfound", args:["${where}", "${params.id}"]) 
            redirect(action:list)
        }
        else {
            return [ spravce : spravce ]
        }
    }

    def create = {
        def spravce = new Spravce()
        spravce.properties = params
        render(view:'edit',model:[spravce:spravce])
    }

    def save = {
        def spravce
				if (params.id) {
						spravce = Spravce.get( params.id )
						spravce.properties = params
        }
        if(!spravce) {
						spravce = new Spravce(params)
				}
				if (params.heslo != params.heslo_znova) {
						flash.message = message(code:"tisa.controllers.pass_must_equal")
        } else {
						if(!spravce.hasErrors() && spravce.save()) {
								flash.message = message(code:"tisa.controllers.created", args:["${where}", "${params.id}"]) 
								redirect(action:show,id:spravce.id)
						} 
        }
				render(view:'edit',model:[spravce:spravce])
    }
}