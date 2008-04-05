class AdminController {
		
		def defaultAction = "login"
		
    def login = {
				def s =new Spravce()
				[spravce:s]
    }
		
}
