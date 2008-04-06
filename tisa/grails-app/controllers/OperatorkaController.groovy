            
class OperatorkaController {
    
    def index = { redirect(action:list,params:params) }

    // the delete, save and update actions only accept POST requests
    def allowedMethods = [delete:'POST', save:'POST', update:'POST']

    def list = {
        if(!params.max) params.max = 10
        [ operatorkaList: Operatorka.list( params ) ]
    }

    def show = {
        def operatorka = Operatorka.get( params.id )

        if(!operatorka) {
            flash.message = "Operatorka not found with id ${params.id}"
            redirect(action:list)
        }
        else { return [ operatorka : operatorka ] }
    }

    def delete = {
        def operatorka = Operatorka.get( params.id )
        if(operatorka) {
            operatorka.delete()
            flash.message = "Operatorka ${params.id} deleted"
            redirect(action:list)
        }
        else {
            flash.message = "Operatorka not found with id ${params.id}"
            redirect(action:list)
        }
    }

    def edit = {
        def operatorka = Operatorka.get( params.id )

        if(!operatorka) {
            flash.message = "Operatorka not found with id ${params.id}"
            redirect(action:list)
        }
        else {
            return [ operatorka : operatorka ]
        }
    }

    def update = {
        def operatorka = Operatorka.get( params.id )
        if(operatorka) {
            operatorka.properties = params
            if(!operatorka.hasErrors() && operatorka.save()) {
                flash.message = "Operatorka ${params.id} updated"
                redirect(action:show,id:operatorka.id)
            }
            else {
                render(view:'edit',model:[operatorka:operatorka])
            }
        }
        else {
            flash.message = "Operatorka not found with id ${params.id}"
            redirect(action:edit,id:params.id)
        }
    }

    def create = {
        def operatorka = new Operatorka()
        operatorka.properties = params
        return ['operatorka':operatorka]
    }

    def save = {
        def operatorka = new Operatorka(params)
        if(!operatorka.hasErrors() && operatorka.save()) {
            flash.message = "Operatorka ${operatorka.id} created"
            redirect(action:show,id:operatorka.id)
        }
        else {
            render(view:'create',model:[operatorka:operatorka])
        }
    }
}