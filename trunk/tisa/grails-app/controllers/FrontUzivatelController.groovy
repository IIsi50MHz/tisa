            
class FrontUzivatelController {
    
    def index = { redirect(action:list,params:params) }
    
    def logout = {
        session.user = null
	redirect(controller:"frontUzivatel", action:uzivatel_login)
		}
    
    
    def uzivatel_login = {
				def u = new Uzivatel()
				login(u)
				[uzivatel:u]
    }
		
    def login(UserStub u) {
				if (params.email=='' || params.heslo=='') {
						flash.message = message(code:"tisa.controllers.insert_email_and_pass")
        }
				if (params.email!=null) {
						//u = u.invokeMethod(u, "findByEmail", [params.email]) //.metaClass.methods.find{it.name.startsWith("findByEmail")}.invoke(params.email)
						u = u.class.findByEmail(params.email)
						if (!u) {
								flash.message = message(code:"tisa.controllers.incorrect_email")
            } else {
								if (u.authenticate(params.heslo)) {
										session.user = u
										redirect(controller:"frontAkce", action:"list")
								} else {
										flash.message = message(code:"tisa.controllers.incorrect_email_and_pass")
								}
						}
        }
    }

    // the delete, save and update actions only accept POST requests
    def allowedMethods = [delete:'POST', save:'POST', update:'POST']

    def where = "Uzivatel"
    
    def list = {
        if(!params.max) params.max = 10
        [ uzivatelList: Uzivatel.list( params ) ]
    }

    def show = {
        def uzivatel = Uzivatel.get( params.id )

        if(!uzivatel) {
            flash.message = message(code:"tisa.controllers.notfound", args:["${where}", "${params.id}"]) 
            redirect(action:list)
        }
        else { return [ uzivatel : uzivatel ] }
    }

    def delete = {
        def uzivatel = Uzivatel.get( params.id )
        if(uzivatel) {
            uzivatel.delete()
            flash.message = message(code:"tisa.controllers.deleted", args:["${where}", "${params.id}"]) 
            redirect(action:list)
        }
        else {
            flash.message = message(code:"tisa.controllers.notfound", args:["${where}", "${params.id}"]) 
            redirect(action:list)
        }
    }

    def edit = {
        def uzivatel = Uzivatel.get( params.id )

        if(!uzivatel) {
            flash.message = message(code:"tisa.controllers.notfound", args:["${where}", "${params.id}"]) 
            redirect(action:list)
        }
        else {
            return [ uzivatel : uzivatel ]
        }
    }

    def update = {
        def uzivatel = Uzivatel.get( params.id )
        if(uzivatel) {
            uzivatel.properties = params
            if(!uzivatel.hasErrors() && uzivatel.save()) {
                flash.message = message(code:"tisa.controllers.updated", args:["${where}", "${params.id}"]) 
                redirect(action:show,id:uzivatel.id)
            }
            else {
                render(view:'edit',model:[uzivatel:uzivatel])
            }
        }
        else {
            flash.message = message(code:"tisa.controllers.notfound", args:["${where}", "${params.id}"]) 
            redirect(action:edit,id:params.id)
        }
    }

    def create = {
        def uzivatel = new Uzivatel()
        uzivatel.properties = params
        return ['uzivatel':uzivatel]
    }

    def save = {
        def uzivatel = new Uzivatel(params)
        if(!uzivatel.hasErrors() && uzivatel.save()) {
            flash.message = message(code:"tisa.controllers.created", args:["${where}", "${params.id}"]) 
            redirect(action:list)
         }
        else {
            render(view:'create',model:[uzivatel:uzivatel])
        }
    }
}