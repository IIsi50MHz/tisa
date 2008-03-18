            
class RezervaceController {
    
    def index = { redirect(action:list,params:params) }

    // the delete, save and update actions only accept POST requests
    def allowedMethods = [delete:'POST', save:'POST', update:'POST']

    def list = {
        if(!params.max) params.max = 10
        [ rezervaceList: Rezervace.list( params ) ]
    }

    def show = {
        def rezervace = Rezervace.get( params.id )

        if(!rezervace) {
            flash.message = "Rezervace not found with id ${params.id}"
            redirect(action:list)
        }
        else { return [ rezervace : rezervace ] }
    }

    def delete = {
        def rezervace = Rezervace.get( params.id )
        if(rezervace) {
            rezervace.delete()
            flash.message = "Rezervace ${params.id} deleted"
            redirect(action:list)
        }
        else {
            flash.message = "Rezervace not found with id ${params.id}"
            redirect(action:list)
        }
    }

    def edit = {
        def rezervace = Rezervace.get( params.id )

        if(!rezervace) {
            flash.message = "Rezervace not found with id ${params.id}"
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
                flash.message = "Rezervace ${params.id} updated"
                redirect(action:show,id:rezervace.id)
            }
            else {
                render(view:'edit',model:[rezervace:rezervace])
            }
        }
        else {
            flash.message = "Rezervace not found with id ${params.id}"
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
            flash.message = "Rezervace ${rezervace.id} created"
            redirect(action:show,id:rezervace.id)
        }
        else {
            render(view:'create',model:[rezervace:rezervace])
        }
    }
}