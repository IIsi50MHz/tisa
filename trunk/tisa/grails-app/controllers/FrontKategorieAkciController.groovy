            
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

}