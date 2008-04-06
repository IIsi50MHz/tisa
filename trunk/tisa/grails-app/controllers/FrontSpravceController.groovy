class FrontSpravceController {

    def register = {
		}

    def login = {
		}
		
		def save ={
				params.vsechna_prava = 0
		    def spravce = new Spravce(params)
        if(!spravce.hasErrors() && spravce.save()) {
            flash.message = message(code:"tisa.controllers.created", args:["Spravce", "${params.id}"]) 
            redirect(action:login)
        }
        else {
            render(view:'register',model:[spravce:spravce])
        }
    }

}
