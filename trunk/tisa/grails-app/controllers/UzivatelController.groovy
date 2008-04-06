            
class UzivatelController {
    
    def index = { redirect(action:list,params:params) }

    // the delete, save and update actions only accept POST requests
    def allowedMethods = [delete:'POST', save:'POST', update:'POST']

    def list = {
        if(!params.max) params.max = 10
        [ uzivatelList: Uzivatel.list( params ) ]
    }

    def show = {
        def uzivatel = Uzivatel.get( params.id )

        if(!uzivatel) {
            flash.message = "Uzivatel not found with id ${params.id}"
            redirect(action:list)
        }
        else { return [ uzivatel : uzivatel ] }
    }

    def delete = {
        def uzivatel = Uzivatel.get( params.id )
        if(uzivatel) {
            uzivatel.delete()
            flash.message = "Uzivatel ${params.id} deleted"
            redirect(action:list)
        }
        else {
            flash.message = "Uzivatel not found with id ${params.id}"
            redirect(action:list)
        }
    }

    def edit = {
        def uzivatel = Uzivatel.get( params.id )

        if(!uzivatel) {
            flash.message = "Uzivatel not found with id ${params.id}"
            redirect(action:list)
        }
        else {
            return [ uzivatel : uzivatel ]
        }
    }

    def update = {
        def uzivatel = Uzivatel.get( params.id )
        if(uzivatel) {
            uzivatel.properties = params
            if(!uzivatel.hasErrors() && uzivatel.save()) {
                flash.message = "Uzivatel ${params.id} updated"
                redirect(action:show,id:uzivatel.id)
            }
            else {
                render(view:'edit',model:[uzivatel:uzivatel])
            }
        }
        else {
            flash.message = "Uzivatel not found with id ${params.id}"
            redirect(action:edit,id:params.id)
        }
    }

    def create = {
        def uzivatel = new Uzivatel()
        uzivatel.properties = params
        return ['uzivatel':uzivatel]
    }

    def save = {
        def uzivatel = new Uzivatel(params)
        if(!uzivatel.hasErrors() && uzivatel.save()) {
            flash.message = "Uzivatel ${uzivatel.id} created"
            redirect(action:show,id:uzivatel.id)
        }
        else {
            render(view:'create',model:[uzivatel:uzivatel])
        }
    }
}