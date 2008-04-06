class AdminController {
		
		//def defaultAction = "login"
		
		//def allowedMethods = [login:'POST']
		
		def index = {
				redirect(action:"login")
    }
		
    def login = {
				def s = new Spravce()
				if (params.email=='' || params.heslo=='') {
						flash.message = "vyplňte prosím email i heslo"
        }
				if (params.email!=null) {
						s = Spravce.findByEmail(params.email)
						if (!s) {
								flash.message = "Email nesouhlasí."
            } else {
								if (s.authenticate(params.heslo)) {
										session.user = s
										redirect(controller:"misto")
								} else {
										flash.message = "Email a heslo si nesouhlasí."
								}
						}
        }
				[spravce:s]
    }
		
}
