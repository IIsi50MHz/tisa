class AdminController {
		
		//def defaultAction = "login"
		
		//def allowedMethods = [login:'POST']
		
		def index = {
				redirect(action:"spravce_login")
    }
		
    def spravce_login = {
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
		
		// TODO to same, prepsat spravce na operatorku az bude existovat
		def operatorka_login = {
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
				[operatorka:s]
    }
		
}
