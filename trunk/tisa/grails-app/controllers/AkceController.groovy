            
class AkceController {
    
    def index = { redirect(action:list,params:params) }

    // the delete, save and update actions only accept POST requests
    def allowedMethods = [delete:'POST', save:'POST', update:'POST']

    def list = {
        def list
        if(params.id) {
            def misto = Misto.get(params.id);
            if (misto) {
                list = misto.akce;
            } else {
                flash.message = "Takové místo neexistuje. (id ${params.id})"
                redirect(action:this.list)
            }
        } else {
            list = Akce.list( params )
        }
        params.max ?: 10
        [ akceList: list ]
    }

    def show = {
        def akce = Akce.get( params.id )

        if(!akce) {
            flash.message = "Akce not found with id ${params.id}"
            redirect(action:list)
        }
        else { return [ akce : akce ] }
    }

    def delete = {
        def akce = Akce.get( params.id )
        if(akce) {
            akce.delete()
            flash.message = "Akce ${params.id} deleted"
            redirect(action:list)
        }
        else {
            flash.message = "Akce not found with id ${params.id}"
            redirect(action:list)
        }
    }

    def edit = {
        def akce = Akce.get( params.id )

        if(!akce) {
            flash.message = "Akce not found with id ${params.id}"
            redirect(action:list)
        }
        else {
            return [ akce : akce ]
        }
    }

    def update = {
        def akce = Akce.get( params.id )
        if(akce) {
            akce.properties = params
            if(!akce.hasErrors() && akce.save()) {
                flash.message = "Akce ${params.id} updated"
                redirect(action:show,id:akce.id)
            }
            else {
                render(view:'edit',model:[akce:akce])
            }
        }
        else {
            flash.message = "Akce not found with id ${params.id}"
            redirect(action:edit,id:params.id)
        }
    }

    def create = {
        def akce = new Akce()
        akce.properties = params
        return ['akce':akce]
    }

    def save = {
        def akce = new Akce(params)
        if(!akce.hasErrors() && akce.save()) {
            flash.message = "Akce ${akce.id} created"
            redirect(action:show,id:akce.id)
        }
        else {
            render(view:'create',model:[akce:akce])
        }
    }
}