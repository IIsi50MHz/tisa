            
class AkceController extends AdminController {
    
    def index = { redirect(action:list,params:params) }

    // the delete, save and update actions only accept POST requests
    def allowedMethods = [delete:'POST', save:'POST', update:'POST']

    def where = "Akce"
    
    def list = {
        if(!params.max) params.max = 20
        [ akceList: Akce.list( params ) ]
    }

    def show = {
        def akce = Akce.get( params.id )

        if(!akce) {
            flash.message = message(code:"tisa.controllers.notfound", args:["${where}", "${params.id}"]) 
            redirect(action:list)
        }
        else { return [ akce : akce ] }
    }

    def delete = {
        def akce = Akce.get( params.id )
        if(akce) {
            akce.delete()
            flash.message = message(code:"tisa.controllers.deleted", args:["${where}", "${params.id}"]) 
            redirect(action:list)
        }
        else {
            flash.message = message(code:"tisa.controllers.notfound", args:["${where}", "${params.id}"]) 
            redirect(action:list)
        }
    }

    def edit = {
        def akce = Akce.get( params.id )

        if(!akce) {
            flash.message = message(code:"tisa.controllers.notfound", args:["${where}", "${params.id}"]) 
            redirect(action:list)
        }
        else {
            return [ akce : akce ]
        }
    }

    def update = {
        def akce = Akce.get( params.id )
        if(akce) {
            akce.properties = params
            if(!akce.hasErrors() && akce.save()) {
                flash.message = message(code:"tisa.controllers.updated", args:["${where}", "${params.id}"]) 
                redirect(action:show,id:akce.id)
            }
            else {
                render(view:'edit',model:[akce:akce])
            }
        }
        else {
            flash.message = message(code:"tisa.controllers.notfound", args:["${where}", "${params.id}"]) 
            redirect(action:edit,id:params.id)
        }
    }

    def create = {
        def akce = new Akce()
        akce.properties = params
        return ['akce':akce]
    }

    def save = {
        def akce = new Akce(params)
        if(!akce.hasErrors() && akce.save()) {
            flash.message = message(code:"tisa.controllers.created", args:["${where}", "${params.id}"]) 
            redirect(action:show,id:akce.id)
        }
        else {
            render(view:'create',model:[akce:akce])
        }
    }
}