            
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

}