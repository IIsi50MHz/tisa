            
class ZpusobVyprseniRezervaceController extends AdminController {

    def layout = "admin"
    
    def defaultAction = "list"

    // the delete, save and update actions only accept POST requests
    def allowedMethods = [delete:'POST', save:'POST', update:'POST']
    
    def where = "ZpusobVyprseniRezervace"

    def list = {
        if(!params.max) params.max = 20
        [ zpusobVyprseniRezervaceList: ZpusobVyprseniRezervace.list( params ) ]
    }

    def show = {
        def vyprseni = ZpusobVyprseniRezervace.get( params.id )

        if(!vyprseni) {
            flash.message = message(code:"tisa.controllers.notfound", args:["${where}", "${params.id}"]) 
            redirect(action:list)
        }
        else { return [ zpusobVyprseniRezervace : vyprseni ] }
    }

    def delete = {
        def vyprseni = ZpusobVyprseniRezervace.get( params.id )
        if(vyprseni) {
            vyprseni.delete()
            flash.message = message(code:"tisa.controllers.deleted", args:["${where}", "${params.id}"]) 
            redirect(action:list)
        }
        else {
            flash.message = message(code:"tisa.controllers.notfound", args:["${where}", "${params.id}"]) 
            redirect(action:list)
        }
    }

    def edit = {
        def vyprseni = ZpusobVyprseniRezervace.get( params.id )

        if(!vyprseni) {
            flash.message = message(code:"tisa.controllers.notfound", args:["${where}", "${params.id}"]) 
            redirect(action:list)
        }
        else {
            return [ zpusobVyprseniRezervace : vyprseni ]
        }
    }

    def update = {
        def vyprseni = ZpusobVyprseniRezervace.get( params.id )
        if(vyprseni) {
            vyprseni.properties = params
            if(!vyprseni.hasErrors() && vyprseni.save()) {
                flash.message = message(code:"tisa.controllers.updated", args:["${where}", "${params.id}"]) 
                redirect(action:show,id:vyprseni.id)
            }
            else {
                render(view:'edit',model:[ZpusobVyprseniRezervace:vyprseni])
            }
        }
        else {
            flash.message = message(code:"tisa.controllers.notfound", args:["${where}", "${params.id}"]) 
            redirect(action:edit,id:params.id)
        }
    }

    def create = {
        def vyprseni = new ZpusobVyprseniRezervace()
        vyprseni.properties = params
        return ['zpusobVyprseniRezervace':vyprseni]
    }

    def save = {
        def vyprseni
				if (params.id) {
						vyprseni = ZpusobVyprseniRezervace.get( params.id )
        }
				if (vyprseni) {
						vyprseni.properties = params
				} else {
						vyprseni = new ZpusobVyprseniRezervace(params)		
        }
        if(!vyprseni.hasErrors() && vyprseni.save()) {
            flash.message = message(code:"tisa.controllers.updated", args:["${where}", "${params.id}"]) 
            redirect(action:list)
        } else {
            render(view:'edit',model:[ZpusobVyprseniRezervace:vyprseni])
        }
   }
}