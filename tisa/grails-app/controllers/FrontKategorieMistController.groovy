            
class FrontKategorieMistController {
    
    def index = { redirect(action:list,params:params) }

    // the delete, save and update actions only accept POST requests
    def allowedMethods = [delete:'POST', save:'POST', update:'POST']

    def where = "KategorieMist"
    
    def list = {

        if(!params.max) params.max = 10
        [ kategorieMistList: KategorieMist.list( params ) ]
    }

    def show = {
        def kategorieMist = KategorieMist.get( params.id )

        if(!kategorieMist) {
            flash.message = message(code:"tisa.controllers.notfound", args:["${where}", "${params.id}"]) 
            
            redirect(action:list)
        }
        else { return [ kategorieMist : kategorieMist ] }
    }

    def delete = {
        def kategorieMist = KategorieMist.get( params.id )
        if(kategorieMist) {
            kategorieMist.delete()
            flash.message = message(code:"tisa.controllers.deleted", args:["${where}", "${params.id}"]) 
            redirect(action:list)
        }
        else {
            flash.message = message(code:"tisa.controllers.notfound", args:["${where}", "${params.id}"]) 
            redirect(action:list)
        }
    }

    def edit = {
        def kategorieMist = KategorieMist.get( params.id )

        if(!kategorieMist) {
            flash.message = message(code:"tisa.controllers.notfound", args:["${where}", "${params.id}"]) 
            redirect(action:list)
        }
        else {
            return [ kategorieMist : kategorieMist ]
        }
    }

    def update = {
        def kategorieMist = KategorieMist.get( params.id )
        if(kategorieMist) {
            kategorieMist.properties = params
            if(!kategorieMist.hasErrors() && kategorieMist.save()) {
                flash.message = message(code:"tisa.controllers.updated", args:["${where}", "${params.id}"]) 
                redirect(action:show,id:kategorieMist.id)
            }
            else {
                render(view:'edit',model:[kategorieMist:kategorieMist])
            }
        }
        else {
            flash.message = message(code:"tisa.controllers.notfound", args:["${where}", "${params.id}"]) 
            redirect(action:edit,id:params.id)
        }
    }

    def create = {
        def kategorieMist = new KategorieMist()
        kategorieMist.properties = params
        return ['kategorieMist':kategorieMist]
    }

    def save = {
        def kategorieMist = new KategorieMist(params)
        if(!kategorieMist.hasErrors() && kategorieMist.save()) {
            flash.message = message(code:"tisa.controllers.created", args:["${where}", "${params.id}"]) 
            redirect(action:show,id:kategorieMist.id)
        }
        else {
            render(view:'create',model:[kategorieMist:kategorieMist])
        }
    }
}