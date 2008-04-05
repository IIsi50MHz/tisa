class AdminController {
		
		//def defaultAction = "login"
		
		//def allowedMethods = [login:'POST']
		
		def index = {
				redirect(action:"login")
    }
		
    def login = {
				def s = new Spravce()
				if (params.email!=null && params.password!=null) {
						logged = s.authenticate(params.email, params.password)
						if (logged) {
								session.logged = logged
								redirect(controller:"SpravcePerspective")
            } else {
								flash.message = "bad username or password"
            }
        }
				[spravce:s]
    }
		
}
