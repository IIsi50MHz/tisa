class FrontMistoController {

    
    def index = { redirect(action:list,params:params) }

    // the delete, save and update actions only accept POST requests
    def allowedMethods = [delete:'POST', save:'POST', update:'POST']

    def where = "Misto"
    
    def list = {
        if(!params.max) params.max = 20
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
    
}
