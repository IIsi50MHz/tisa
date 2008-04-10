            
class UzivatelController extends AdminController {
    
    def index = { redirect(action:list,params:params) }

    // the delete, save and update actions only accept POST requests
    def allowedMethods = [delete:'POST', save:'POST', update:'POST']

    def where = "Uzivatel"
    
    def list = {
        if(!params.max) params.max = 20
        [ uzivatelList: Uzivatel.list( params ) ]
    }

    def show = {
        def uzivatel = Uzivatel.get( params.id )

        if(!uzivatel) {
            flash.message = message(code:"tisa.controllers.notfound", args:["${where}", "${params.id}"]) 
            redirect(action:list)
        }
        else { return [ uzivatel : uzivatel ] }
    }

    def delete = {
        def uzivatel = Uzivatel.get( params.id )
        if(uzivatel) {
            uzivatel.delete()
            flash.message = message(code:"tisa.controllers.deleted", args:["${where}", "${params.id}"]) 
            redirect(action:list)
        }
        else {
            flash.message = message(code:"tisa.controllers.notfound", args:["${where}", "${params.id}"]) 
            redirect(action:list)
        }
    }

    def edit = {
        def uzivatel = Uzivatel.get( params.id )

        if(!uzivatel) {
            flash.message = message(code:"tisa.controllers.notfound", args:["${where}", "${params.id}"]) 
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
                flash.message = message(code:"tisa.controllers.updated", args:["${where}", "${params.id}"]) 
                redirect(action:show,id:uzivatel.id)
            }
            else {
                render(view:'edit',model:[uzivatel:uzivatel])
            }
        }
        else {
            flash.message = message(code:"tisa.controllers.notfound", args:["${where}", "${params.id}"]) 
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
            flash.message = message(code:"tisa.controllers.created", args:["${where}", "${params.id}"]) 
            redirect(action:show,id:uzivatel.id)
        }
        else {
            render(view:'create',model:[uzivatel:uzivatel])
        }
    }
}