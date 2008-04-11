            
class FrontUzivatelController {
    
    def index = { redirect(action:list,params:params) }
    
    def logout = {
        session.user = null
				redirect(controller:"frontUzivatel", action:login)
		}
    
    
    def login = {
				def u = new Uzivatel()
				_login(u)
				[uzivatel:u]
    }
		
    def _login(UserStub u) {
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
										if (session.after_login_redirect) {
												def direction = session.after_login_redirect
												session.after_login_redirect = null
												redirect(direction)
												return
                    }
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
    
    def create = {
        def uzivatel = new Uzivatel()
        uzivatel.properties = params
        return ['uzivatel':uzivatel]
    }
    
    def save = {
        def uzivatel = new Uzivatel(params)
        if(!uzivatel.hasErrors() && uzivatel.save()) {
            flash.message = message(code:"tisa.user.success_registration") 
            redirect(action:list)
        }
        else {
            render(view:'create',model:[uzivatel:uzivatel])
        }
    }

 }