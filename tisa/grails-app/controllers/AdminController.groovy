class AdminController {
		
		
		def beforeInterceptor = [action:this.&authenticate, except:['spravce_login', 'operatorka_login']]
		
		def authenticate = {
				session.controllers =[]
        if(session.user == null || session.user.class != Spravce && session.user.class != Operatorka) {
						redirect(controller:"admin", action:spravce_login)
            return false
        } else {
						session.controllers = ['akce', 'poradatel', 'rezervace']
						if (session.user.class.getName() == 'Spravce') {
								session.controllers += ['misto', 'mesto', 'operatorka', 'rozmisteni', 'zpusobVyprseniRezervace']
								if (session.user.vsechna_prava) {
										session.controllers += ['spravce', 'uzivatel', 'kategorieAkci', 'kategorieMist' ]
								}
            }
        }
		}		
		
		def logout = {
        session.user = null
				redirect(controller:"admin", action:spravce_login)
		}		
		
		//def allowedMethods = [login:'POST']
		
		def index = {				
				redirect(controller:"akce")
    }
		
    def spravce_login = {
				def s = new Spravce()
				login(s)
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
						u = u.class.findByEmail(params.email)
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
