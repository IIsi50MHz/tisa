            
class SpravceController {
    
    def defaultAction = "list"

    // the delete, save and update actions only accept POST requests
    def allowedMethods = [delete:'POST', save:'POST', update:'POST']

    def list = {
        if(!params.max) params.max = 10
        [ spravceList: Spravce.list( params ) ]
    }

    def show = {
        def spravce = Spravce.get( params.id )

        if(!spravce) {
            flash.message = "Spravce not found with id ${params.id}"
            redirect(action:list)
        }
        else { return [ spravce : spravce ] }
    }

    def delete = {
        def spravce = Spravce.get( params.id )
        if(spravce) {
            spravce.delete()
            flash.message = "Spravce ${params.id} deleted"
            redirect(action:list)
        }
        else {
            flash.message = "Spravce not found with id ${params.id}"
            redirect(action:list)
        }
    }

    def edit = {
        def spravce = Spravce.get( params.id )

        if(!spravce) {
            flash.message = "Spravce not found with id ${params.id}"
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
        if(!spravce.hasErrors() && spravce.save()) {
            flash.message = "Spravce ${spravce.id} saved"
            redirect(action:show,id:spravce.id)
        } else {
            render(view:'edit',model:[spravce:spravce])
        }
    }
}