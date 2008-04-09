            
class FrontKategorieAkciController {
    
    def index = { redirect(action:list,params:params) }

    // the delete, save and update actions only accept POST requests
    def allowedMethods = [delete:'POST', save:'POST', update:'POST']

    def where = "KategorieAkci"
      
    def list = {
        if(!params.max) params.max = 10
        [ kategorieAkciList: KategorieAkci.list( params ) ]
    }

    def show = {
        def kategorieAkci = KategorieAkci.get( params.id )

        if(!kategorieAkci) {
            flash.message = message(code:"tisa.controllers.notfound", args:["${where}", "${params.id}"]) 
            redirect(action:list)
        }
        else { return [ kategorieAkci : kategorieAkci ] }
    }

    def delete = {
        def kategorieAkci = KategorieAkci.get( params.id )
        if(kategorieAkci) {
            kategorieAkci.delete()
            flash.message = message(code:"tisa.controllers.deleted", args:["${where}", "${params.id}"]) 
            redirect(action:list)
        }
        else {
            flash.message = message(code:"tisa.controllers.notfound", args:["${where}", "${params.id}"]) 
            redirect(action:list)
        }
    }

    def edit = {
        def kategorieAkci = KategorieAkci.get( params.id )

        if(!kategorieAkci) {
            flash.message = message(code:"tisa.controllers.notfound", args:["${where}", "${params.id}"]) 
            redirect(action:list)
        }
        else {
            return [ kategorieAkci : kategorieAkci ]
        }
    }

    def update = {
        def kategorieAkci = KategorieAkci.get( params.id )
        if(kategorieAkci) {
            kategorieAkci.properties = params
            if(!kategorieAkci.hasErrors() && kategorieAkci.save()) {
                flash.message = message(code:"tisa.controllers.updated", args:["${where}", "${params.id}"]) 
                redirect(action:show,id:kategorieAkci.id)
            }
            else {
                render(view:'edit',model:[kategorieAkci:kategorieAkci])
            }
        }
        else {
            flash.message = message(code:"tisa.controllers.notfound", args:["${where}", "${params.id}"]) 
            redirect(action:edit,id:params.id)
        }
    }

    def create = {
        def kategorieAkci = new KategorieAkci()
        kategorieAkci.properties = params
        return ['kategorieAkci':kategorieAkci]
    }

    def save = {
        def kategorieAkci = new KategorieAkci(params)
        if(!kategorieAkci.hasErrors() && kategorieAkci.save()) {
            flash.message = message(code:"tisa.controllers.created", args:["${where}", "${params.id}"]) 
            redirect(action:show,id:kategorieAkci.id)
        }
        else {
            render(view:'create',model:[kategorieAkci:kategorieAkci])
        }
    }
}