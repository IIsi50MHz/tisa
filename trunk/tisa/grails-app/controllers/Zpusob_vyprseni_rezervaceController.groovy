            
class Zpusob_vyprseni_rezervaceController extends AdminController {
    
    def index = { redirect(action:list,params:params) }

    // the delete, save and update actions only accept POST requests
    def allowedMethods = [delete:'POST', save:'POST', update:'POST']

    def list = {
        if(!params.max) params.max = 10
        [ zpusob_vyprseni_rezervaceList: Zpusob_vyprseni_rezervace.list( params ) ]
    }

    def show = {
        def zpusob_vyprseni_rezervace = Zpusob_vyprseni_rezervace.get( params.id )

        if(!zpusob_vyprseni_rezervace) {
            flash.message = "Zpusob_vyprseni_rezervace not found with id ${params.id}"
            redirect(action:list)
        }
        else { return [ zpusob_vyprseni_rezervace : zpusob_vyprseni_rezervace ] }
    }

    def delete = {
        def zpusob_vyprseni_rezervace = Zpusob_vyprseni_rezervace.get( params.id )
        if(zpusob_vyprseni_rezervace) {
            zpusob_vyprseni_rezervace.delete()
            flash.message = "Zpusob_vyprseni_rezervace ${params.id} deleted"
            redirect(action:list)
        }
        else {
            flash.message = "Zpusob_vyprseni_rezervace not found with id ${params.id}"
            redirect(action:list)
        }
    }

    def edit = {
        def zpusob_vyprseni_rezervace = Zpusob_vyprseni_rezervace.get( params.id )

        if(!zpusob_vyprseni_rezervace) {
            flash.message = "Zpusob_vyprseni_rezervace not found with id ${params.id}"
            redirect(action:list)
        }
        else {
            return [ zpusob_vyprseni_rezervace : zpusob_vyprseni_rezervace ]
        }
    }

    def update = {
        def zpusob_vyprseni_rezervace = Zpusob_vyprseni_rezervace.get( params.id )
        if(zpusob_vyprseni_rezervace) {
            zpusob_vyprseni_rezervace.properties = params
            if(!zpusob_vyprseni_rezervace.hasErrors() && zpusob_vyprseni_rezervace.save()) {
                flash.message = "Zpusob_vyprseni_rezervace ${params.id} updated"
                redirect(action:show,id:zpusob_vyprseni_rezervace.id)
            }
            else {
                render(view:'edit',model:[zpusob_vyprseni_rezervace:zpusob_vyprseni_rezervace])
            }
        }
        else {
            flash.message = "Zpusob_vyprseni_rezervace not found with id ${params.id}"
            redirect(action:edit,id:params.id)
        }
    }

    def create = {
        def zpusob_vyprseni_rezervace = new Zpusob_vyprseni_rezervace()
        zpusob_vyprseni_rezervace.properties = params
        return ['zpusob_vyprseni_rezervace':zpusob_vyprseni_rezervace]
    }

    def save = {
        def zpusob_vyprseni_rezervace = new Zpusob_vyprseni_rezervace(params)
        if(!zpusob_vyprseni_rezervace.hasErrors() && zpusob_vyprseni_rezervace.save()) {
            flash.message = "Zpusob_vyprseni_rezervace ${zpusob_vyprseni_rezervace.id} created"
            redirect(action:show,id:zpusob_vyprseni_rezervace.id)
        }
        else {
            render(view:'create',model:[zpusob_vyprseni_rezervace:zpusob_vyprseni_rezervace])
        }
    }
}