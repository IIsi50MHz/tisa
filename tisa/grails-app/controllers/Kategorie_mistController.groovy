            
class Kategorie_mistController {
    
    def index = { redirect(action:list,params:params) }

    // the delete, save and update actions only accept POST requests
    def allowedMethods = [delete:'POST', save:'POST', update:'POST']

    def where = "Kategorie_mist"
    
    def list = {

        if(!params.max) params.max = 10
        [ kategorie_mistList: Kategorie_mist.list( params ) ]
    }

    def show = {
        def kategorie_mist = Kategorie_mist.get( params.id )

        if(!kategorie_mist) {
            flash.message = message(code:"tisa.controllers.notfound", args:["${where}", "${params.id}"]) 
            
            redirect(action:list)
        }
        else { return [ kategorie_mist : kategorie_mist ] }
    }

    def delete = {
        def kategorie_mist = Kategorie_mist.get( params.id )
        if(kategorie_mist) {
            kategorie_mist.delete()
            flash.message = message(code:"tisa.controllers.deleted", args:["${where}", "${params.id}"]) 
            redirect(action:list)
        }
        else {
            flash.message = message(code:"tisa.controllers.notfound", args:["${where}", "${params.id}"]) 
            redirect(action:list)
        }
    }

    def edit = {
        def kategorie_mist = Kategorie_mist.get( params.id )

        if(!kategorie_mist) {
            flash.message = message(code:"tisa.controllers.notfound", args:["${where}", "${params.id}"]) 
            redirect(action:list)
        }
        else {
            return [ kategorie_mist : kategorie_mist ]
        }
    }

    def update = {
        def kategorie_mist = Kategorie_mist.get( params.id )
        if(kategorie_mist) {
            kategorie_mist.properties = params
            if(!kategorie_mist.hasErrors() && kategorie_mist.save()) {
                flash.message = message(code:"tisa.controllers.updated", args:["${where}", "${params.id}"]) 
                redirect(action:show,id:kategorie_mist.id)
            }
            else {
                render(view:'edit',model:[kategorie_mist:kategorie_mist])
            }
        }
        else {
            flash.message = message(code:"tisa.controllers.notfound", args:["${where}", "${params.id}"]) 
            redirect(action:edit,id:params.id)
        }
    }

    def create = {
        def kategorie_mist = new Kategorie_mist()
        kategorie_mist.properties = params
        return ['kategorie_mist':kategorie_mist]
    }

    def save = {
        def kategorie_mist = new Kategorie_mist(params)
        if(!kategorie_mist.hasErrors() && kategorie_mist.save()) {
            flash.message = message(code:"tisa.controllers.created", args:["${where}", "${params.id}"]) 
            redirect(action:show,id:kategorie_mist.id)
        }
        else {
            render(view:'create',model:[kategorie_mist:kategorie_mist])
        }
    }
}