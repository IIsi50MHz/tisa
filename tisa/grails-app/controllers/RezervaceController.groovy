            
class RezervaceController extends AdminController {
    
		def layout = "admin"
		
    def index = { redirect(action:list,params:params) }

    // the delete, save and update actions only accept POST requests
    def allowedMethods = [delete:'POST', save:'POST', update:'POST']

    def where = "Rezervace"
    
    def list = {
        if(!params.max) params.max = 20
        [ rezervaceList: Rezervace.list( params ) ]
    }

    def show = {
        def rezervace = Rezervace.get( params.id )

        if(!rezervace) {
            flash.message = message(code:"tisa.controllers.notfound", args:["${where}", "${params.id}"]) 
            redirect(action:list)
        }
        else { return [ rezervace : rezervace ] }
    }

    def delete = {
        def rezervace = Rezervace.get( params.id )
        if(rezervace) {
            rezervace.delete()
            flash.message = message(code:"tisa.controllers.deleted", args:["${where}", "${params.id}"]) 
            redirect(action:list)
        }
        else {
            flash.message = message(code:"tisa.controllers.notfound", args:["${where}", "${params.id}"]) 
            redirect(action:list)
        }
    }

    def edit = {
        def rezervace = Rezervace.get( params.id )

        if(!rezervace) {
            flash.message = message(code:"tisa.controllers.notfound", args:["${where}", "${params.id}"]) 
            redirect(action:list)
        }
        else {
            return [ rezervace : rezervace ]
        }
    }

    def update = {
        def rezervace = Rezervace.get( params.id )
        if(rezervace) {
            rezervace.properties = params
            if(!rezervace.hasErrors() && rezervace.save()) {
                flash.message = message(code:"tisa.controllers.updated", args:["${where}", "${params.id}"]) 
                redirect(action:show,id:rezervace.id)
            }
            else {
                render(view:'edit',model:[rezervace:rezervace])
            }
        }
        else {
            flash.message = message(code:"tisa.controllers.notfound", args:["${where}", "${params.id}"]) 
            redirect(action:edit,id:params.id)
        }
    }

    def create = {
        def rezervace = new Rezervace()
        rezervace.properties = params
        return ['rezervace':rezervace]
    }

    def save = {
        def rezervace = new Rezervace(params)
        if(!rezervace.hasErrors() && rezervace.save()) {
            flash.message = message(code:"tisa.controllers.created", args:["${where}", "${params.id}"]) 
            redirect(action:show,id:rezervace.id)
        }
        else {
            render(view:'create',model:[rezervace:rezervace])
        }
    }
}