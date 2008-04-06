            
class Kategorie_akciController {
    
    def index = { redirect(action:list,params:params) }

    // the delete, save and update actions only accept POST requests
    def allowedMethods = [delete:'POST', save:'POST', update:'POST']

    def where = "Kategorie_akci"
      
    def list = {
        if(!params.max) params.max = 10
        [ kategorie_akciList: Kategorie_akci.list( params ) ]
    }

    def show = {
        def kategorie_akci = Kategorie_akci.get( params.id )

        if(!kategorie_akci) {
            flash.message = message(code:"tisa.controllers.notfound", args:["${where}", "${params.id}"]) 
            redirect(action:list)
        }
        else { return [ kategorie_akci : kategorie_akci ] }
    }

    def delete = {
        def kategorie_akci = Kategorie_akci.get( params.id )
        if(kategorie_akci) {
            kategorie_akci.delete()
            flash.message = message(code:"tisa.controllers.deleted", args:["${where}", "${params.id}"]) 
            redirect(action:list)
        }
        else {
            flash.message = message(code:"tisa.controllers.notfound", args:["${where}", "${params.id}"]) 
            redirect(action:list)
        }
    }

    def edit = {
        def kategorie_akci = Kategorie_akci.get( params.id )

        if(!kategorie_akci) {
            flash.message = message(code:"tisa.controllers.notfound", args:["${where}", "${params.id}"]) 
            redirect(action:list)
        }
        else {
            return [ kategorie_akci : kategorie_akci ]
        }
    }

    def update = {
        def kategorie_akci = Kategorie_akci.get( params.id )
        if(kategorie_akci) {
            kategorie_akci.properties = params
            if(!kategorie_akci.hasErrors() && kategorie_akci.save()) {
                flash.message = message(code:"tisa.controllers.updated", args:["${where}", "${params.id}"]) 
                redirect(action:show,id:kategorie_akci.id)
            }
            else {
                render(view:'edit',model:[kategorie_akci:kategorie_akci])
            }
        }
        else {
            flash.message = message(code:"tisa.controllers.notfound", args:["${where}", "${params.id}"]) 
            redirect(action:edit,id:params.id)
        }
    }

    def create = {
        def kategorie_akci = new Kategorie_akci()
        kategorie_akci.properties = params
        return ['kategorie_akci':kategorie_akci]
    }

    def save = {
        def kategorie_akci = new Kategorie_akci(params)
        if(!kategorie_akci.hasErrors() && kategorie_akci.save()) {
            flash.message = message(code:"tisa.controllers.created", args:["${where}", "${params.id}"]) 
            redirect(action:show,id:kategorie_akci.id)
        }
        else {
            render(view:'create',model:[kategorie_akci:kategorie_akci])
        }
    }
}