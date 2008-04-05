            
class ZpusobVyprseniRezervaceController extends AdminController {

		def layout = "admin"
    
    def defaultAction = "list"

    // the delete, save and update actions only accept POST requests
    def allowedMethods = [delete:'POST', save:'POST', update:'POST']

    def list = {
        if(!params.max) params.max = 10
        [ ZpusobVyprseniRezervaceList: ZpusobVyprseniRezervace.list( params ) ]
    }

    def show = {
        def ZpusobVyprseniRezervace = ZpusobVyprseniRezervace.get( params.id )

        if(!ZpusobVyprseniRezervace) {
            flash.message = "ZpusobVyprseniRezervace not found with id ${params.id}"
            redirect(action:list)
        }
        else { return [ ZpusobVyprseniRezervace : ZpusobVyprseniRezervace ] }
    }

    def delete = {
        def ZpusobVyprseniRezervace = ZpusobVyprseniRezervace.get( params.id )
        if(ZpusobVyprseniRezervace) {
            ZpusobVyprseniRezervace.delete()
            flash.message = "ZpusobVyprseniRezervace ${params.id} deleted"
            redirect(action:list)
        }
        else {
            flash.message = "ZpusobVyprseniRezervace not found with id ${params.id}"
            redirect(action:list)
        }
    }

    def edit = {
        def ZpusobVyprseniRezervace = ZpusobVyprseniRezervace.get( params.id )

        if(!ZpusobVyprseniRezervace) {
            flash.message = "ZpusobVyprseniRezervace not found with id ${params.id}"
            redirect(action:list)
        }
        else {
            return [ ZpusobVyprseniRezervace : ZpusobVyprseniRezervace ]
        }
    }

    def update = {
        def ZpusobVyprseniRezervace = ZpusobVyprseniRezervace.get( params.id )
        if(ZpusobVyprseniRezervace) {
            ZpusobVyprseniRezervace.properties = params
            if(!ZpusobVyprseniRezervace.hasErrors() && ZpusobVyprseniRezervace.save()) {
                flash.message = "ZpusobVyprseniRezervace ${params.id} updated"
                redirect(action:show,id:ZpusobVyprseniRezervace.id)
            }
            else {
                render(view:'edit',model:[ZpusobVyprseniRezervace:ZpusobVyprseniRezervace])
            }
        }
        else {
            flash.message = "ZpusobVyprseniRezervace not found with id ${params.id}"
            redirect(action:edit,id:params.id)
        }
    }

    def create = {
        def ZpusobVyprseniRezervace = new ZpusobVyprseniRezervace()
        ZpusobVyprseniRezervace.properties = params
        return ['ZpusobVyprseniRezervace':ZpusobVyprseniRezervace]
    }

    def save = {
        def ZpusobVyprseniRezervace = new ZpusobVyprseniRezervace(params)
        if(!ZpusobVyprseniRezervace.hasErrors() && ZpusobVyprseniRezervace.save()) {
            flash.message = "ZpusobVyprseniRezervace ${ZpusobVyprseniRezervace.id} created"
            redirect(action:show,id:ZpusobVyprseniRezervace.id)
        }
        else {
            render(view:'create',model:[ZpusobVyprseniRezervace:ZpusobVyprseniRezervace])
        }
    }
}