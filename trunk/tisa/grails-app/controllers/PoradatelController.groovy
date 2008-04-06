            
class PoradatelController {
    
    def index = { redirect(action:list,params:params) }

    // the delete, save and update actions only accept POST requests
    def allowedMethods = [delete:'POST', save:'POST', update:'POST']

    def where = "Poradatel"
    
    def list = {
        if(!params.max) params.max = 10
        [ poradatelList: Poradatel.list( params ) ]
    }

    def show = {
        def poradatel = Poradatel.get( params.id )

        if(!poradatel) {
            flash.message = message(code:"tisa.controllers.notfound", args:["${where}", "${params.id}"]) 
            redirect(action:list)
        }
        else { return [ poradatel : poradatel ] }
    }

    def delete = {
        def poradatel = Poradatel.get( params.id )
        if(poradatel) {
            poradatel.delete()
            flash.message = message(code:"tisa.controllers.deleted", args:["${where}", "${params.id}"]) 
            redirect(action:list)
        }
        else {
            flash.message = message(code:"tisa.controllers.notfound", args:["${where}", "${params.id}"]) 
            redirect(action:list)
        }
    }

    def edit = {
        def poradatel = Poradatel.get( params.id )

        if(!poradatel) {
            flash.message = message(code:"tisa.controllers.notfound", args:["${where}", "${params.id}"]) 
            redirect(action:list)
        }
        else {
            return [ poradatel : poradatel ]
        }
    }

    def update = {
        def poradatel = Poradatel.get( params.id )
        if(poradatel) {
            poradatel.properties = params
            if(!poradatel.hasErrors() && poradatel.save()) {
                flash.message = message(code:"tisa.controllers.updated", args:["${where}", "${params.id}"]) 
                redirect(action:show,id:poradatel.id)
            }
            else {
                render(view:'edit',model:[poradatel:poradatel])
            }
        }
        else {
            flash.message = message(code:"tisa.controllers.notfound", args:["${where}", "${params.id}"]) 
            redirect(action:edit,id:params.id)
        }
    }

    def create = {
        def poradatel = new Poradatel()
        poradatel.properties = params
        return ['poradatel':poradatel]
    }

    def save = {
        def poradatel = new Poradatel(params)
        if(!poradatel.hasErrors() && poradatel.save()) {
            flash.message = message(code:"tisa.controllers.created", args:["${where}", "${params.id}"]) 
            redirect(action:show,id:poradatel.id)
        }
        else {
            render(view:'create',model:[poradatel:poradatel])
        }
    }
}