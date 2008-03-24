class MistoController extends AdminController {
    
		def layout = "admin"
		
		def Scaffold = Misto

    def index = { redirect(action:list,params:params) }
		
}
