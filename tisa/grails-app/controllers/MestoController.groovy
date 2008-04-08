            
class MestoController extends AdminController {
    
    def index = { redirect(action:list,params:params) }

    // the delete, save and update actions only accept POST requests
    def allowedMethods = [delete:'POST', save:'POST', update:'POST']

    def where = "Mesto"
    
    def list = {
        if(!params.max) params.max = 10
        [ mestoList: Mesto.list( params ) ]
    }

    def show = {
        def mesto = Mesto.get( params.id )

        if(!mesto) {
            flash.message = message(code:"tisa.controllers.notfound", args:["${where}", "${params.id}"]) 
            redirect(action:list)
        }
        else { return [ mesto : mesto ] }
    }

    def delete = {
        def mesto = Mesto.get( params.id )
        if(mesto) {
            mesto.delete()
            flash.message = message(code:"tisa.controllers.deleted", args:["${where}", "${params.id}"]) 
            redirect(action:list)
        }
        else {
            flash.message = message(code:"tisa.controllers.notfound", args:["${where}", "${params.id}"]) 
            redirect(action:list)
        }
    }

    def edit = {
        def mesto = Mesto.get( params.id )

        if(!mesto) {
            flash.message = message(code:"tisa.controllers.notfound", args:["${where}", "${params.id}"]) 
            redirect(action:list)
        }
        else {
            return [ mesto : mesto ]
        }
    }

    def update = {
        def mesto = Mesto.get( params.id )
        if(mesto) {
            mesto.properties = params
            if(!mesto.hasErrors() && mesto.save()) {
                flash.message = message(code:"tisa.controllers.updated", args:["${where}", "${params.id}"]) 
                redirect(action:show,id:mesto.id)
            }
            else {
                render(view:'edit',model:[mesto:mesto])
            }
        }
        else {
            flash.message = message(code:"tisa.controllers.notfound", args:["${where}", "${params.id}"]) 
            redirect(action:edit,id:params.id)
        }
    }

    def create = {
        def mesto = new Mesto()
        mesto.properties = params
        return ['mesto':mesto]
    }

    def save = {
        def mesto = new Mesto(params)
        if(!mesto.hasErrors() && mesto.save()) {
            flash.message = message(code:"tisa.controllers.created", args:["${where}", "${params.id}"]) 
            redirect(action:show,id:mesto.id)
        }
        else {
            render(view:'create',model:[mesto:mesto])
        }
    }
}