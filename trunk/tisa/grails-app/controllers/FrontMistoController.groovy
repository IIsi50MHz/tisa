class FrontMistoController {

    
    def index = { redirect(action:list,params:params) }

    // the delete, save and update actions only accept POST requests
    def allowedMethods = [delete:'POST', save:'POST', update:'POST']

    def list = {
        if(!params.max) params.max = 10
        [ mistoList: Misto.list( params ) ]
    }

    def show = {
        def misto = Misto.get( params.id )

        if(!misto) {
            flash.message = "Misto not found with id ${params.id}"
            redirect(action:list)
        }
        else { return [ misto : misto ] }
    }

    def delete = {
        def misto = Misto.get( params.id )
        if(misto) {
            misto.delete()
            flash.message = "Misto ${params.id} deleted"
            redirect(action:list)
        }
        else {
            flash.message = "Misto not found with id ${params.id}"
            redirect(action:list)
        }
    }

    def edit = {
        def misto = Misto.get( params.id )

        if(!misto) {
            flash.message = "Misto not found with id ${params.id}"
            redirect(action:list)
        }
        else {
            return [ misto : misto ]
        }
    }

    def update = {
        def misto = Misto.get( params.id )
        if(misto) {
            misto.properties = params
            if(!misto.hasErrors() && misto.save()) {
                flash.message = "Misto ${params.id} updated"
                redirect(action:show,id:misto.id)
            }
            else {
                render(view:'edit',model:[misto:misto])
            }
        }
        else {
            flash.message = "Misto not found with id ${params.id}"
            redirect(action:edit,id:params.id)
        }
    }

    def create = {
        def misto = new Misto()
        misto.properties = params
        return ['misto':misto]
    }

    def save = {
        def misto = new Misto(params)
        if(!misto.hasErrors() && misto.save()) {
            flash.message = "Misto ${misto.id} created"
            redirect(action:show,id:misto.id)
        }
        else {
            render(view:'create',model:[misto:misto])
        }
    }

}
