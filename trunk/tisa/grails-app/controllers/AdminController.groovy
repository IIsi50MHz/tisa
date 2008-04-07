class AdminController {
		
		
		def beforeFilter = [ execute:this.&authenticate, except:[spravce_login, operatorka_login] ]
		
		def authenticate = {
        if(!session.user ) {
						redirect(controller:"admin", action:spravce_login)
            return false
        }
		}		
		
		def logout = {
        session.user = null
				redirect(controller:"admin", action:spravce_login)
		}		
		
		//def allowedMethods = [login:'POST']
		
		def index = {				
				//redirect(action:"spravce_login")
    }
		
    def spravce_login = {
				def s = new Spravce()
				login(s)
				/*
				if (params.email=='' || params.heslo=='') {
						flash.message = message(code:"tisa.controllers.insert_email_and_pass")
        }
				if (params.email!=null) {
						s = Spravce.findByEmail(params.email)
						if (!s) {
								flash.message = message(code:"tisa.controllers.incorrect_email")
            } else {
								if (s.authenticate(params.heslo)) {
										session.user = s
										redirect(controller:"misto", action:"index")
								} else {
										flash.message = message(code:"tisa.controllers.incorrect_email_and_pass")
								}
						}
        }*/
				[spravce:s]
    }
		
		// TODO to same, prepsat spravce na operatorku az bude existovat
		def operatorka_login = {
				def o = new Operatorka()
				login(o)
				[operatorka:o]
    }
		
		def login(UserStub u) {
				if (params.email=='' || params.heslo=='') {
						flash.message = message(code:"tisa.controllers.insert_email_and_pass")
        }
				if (params.email!=null) {
						//u = u.invokeMethod(u, "findByEmail", [params.email]) //.metaClass.methods.find{it.name.startsWith("findByEmail")}.invoke(params.email)
						u.findByEmail(params.email)
						if (!u) {
								flash.message = message(code:"tisa.controllers.incorrect_email")
            } else {
								if (u.authenticate(params.heslo)) {
										session.user = u
										redirect(controller:"akce", action:"index")
								} else {
										flash.message = message(code:"tisa.controllers.incorrect_email_and_pass")
								}
						}
        }
    }
		
}
