            
class RozmisteniController {
    
    def index = { redirect(action:list,params:params) }

    // the delete, save and update actions only accept POST requests
    def allowedMethods = [delete:'POST', save:'POST', update:'POST']

    def list = {
        if(!params.max) params.max = 20
        [ rozmisteniList: session.user.listRozmisteni() ]
    }

    def show = {
        def rozmisteni = Rozmisteni.get( params.id )

        if(!rozmisteni) {
            flash.message = "Rozmisteni not found with id ${params.id}"
            redirect(action:list)
        }
        else { return [ rozmisteni : rozmisteni ] }
    }

    def delete = {
        def rozmisteni = Rozmisteni.get( params.id )
        if(rozmisteni) {
            rozmisteni.delete()
            flash.message = "Rozmisteni ${params.id} deleted"
            redirect(action:list)
        }
        else {
            flash.message = "Rozmisteni not found with id ${params.id}"
            redirect(action:list)
        }
    }

    def edit = {
        def rozmisteni = Rozmisteni.get( params.id )

        if(!rozmisteni) {
            flash.message = "Rozmisteni not found with id ${params.id}"
            redirect(action:list)
        }
        else {
            return [ rozmisteni : rozmisteni ]
        }
    }

    def update = {
        def rozmisteni = Rozmisteni.get( params.id )
        if(rozmisteni) {
            rozmisteni.properties = params
            if(!rozmisteni.hasErrors() && rozmisteni.save()) {
                flash.message = "Rozmisteni ${params.id} updated"
                redirect(action:show,id:rozmisteni.id)
            }
            else {
                render(view:'edit',model:[rozmisteni:rozmisteni])
            }
        }
        else {
            flash.message = "Rozmisteni not found with id ${params.id}"
            redirect(action:edit,id:params.id)
        }
    }

    def create = {
        def rozmisteni = new Rozmisteni()
        rozmisteni.properties = params
        return ['rozmisteni':rozmisteni]
    }

    def save = {
        def rozmisteni = new Rozmisteni(params)
        if(!rozmisteni.hasErrors() && rozmisteni.save()) {
            flash.message = "Rozmisteni ${rozmisteni.id} created"
            redirect(action:list,id:rozmisteni.id)
        }
        else {
            render(view:'create',model:[rozmisteni:rozmisteni])
        }
    }
}