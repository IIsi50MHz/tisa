            
class MistoController extends AdminController {
    
    def index = { redirect(action:list,params:params) }

    // the delete, save and update actions only accept POST requests
    def allowedMethods = [delete:'POST', save:'POST', update:'POST']

    def where = "Misto"
    
    def list = {
        if(!params.max) params.max = 10
        [ mistoList: Misto.list( params ) ]
    }

    def show = {
        def misto = Misto.get( params.id )

        if(!misto) {
            flash.message = message(code:"tisa.controllers.notfound", args:["${where}", "${params.id}"]) 
            redirect(action:list)
        }
        else { return [ misto : misto ] }
    }

    def delete = {
        def misto = Misto.get( params.id )
        if(misto) {
            misto.delete()
            flash.message = message(code:"tisa.controllers.deleted", args:["${where}", "${params.id}"]) 
            redirect(action:list)
        }
        else {
            flash.message = message(code:"tisa.controllers.notfound", args:["${where}", "${params.id}"]) 
            redirect(action:list)
        }
    }

    def edit = {
        def misto = Misto.get( params.id )

        if(!misto) {
            flash.message = message(code:"tisa.controllers.notfound", args:["${where}", "${params.id}"]) 
            redirect(action:list)
        }
        else {
            return [ misto : misto ]
        }
    }

    def update = {
        def misto = Misto.get( params.id )
        if(misto) {
            misto.properties = params
            if(!misto.hasErrors() && misto.save()) {
                flash.message = message(code:"tisa.controllers.updated", args:["${where}", "${params.id}"]) 
                redirect(action:show,id:misto.id)
            }
            else {
                render(view:'edit',model:[misto:misto])
            }
        }
        else {
            flash.message = message(code:"tisa.controllers.notfound", args:["${where}", "${params.id}"]) 
            redirect(action:edit,id:params.id)
        }
    }

    def create = {
        def misto = new Misto()
        misto.properties = params
        return ['misto':misto]
    }

    def save = {
        def misto = new Misto(params)
        if(!misto.hasErrors() && misto.save()) {
            flash.message = message(code:"tisa.controllers.created", args:["${where}", "${params.id}"]) 
            redirect(action:show,id:misto.id)
        }
        else {
            render(view:'create',model:[misto:misto])
        }
    }
}