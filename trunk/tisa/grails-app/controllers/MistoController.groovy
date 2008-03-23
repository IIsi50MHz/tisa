class MistoController extends AdminController {
    def Scaffold = Misto

    def index = { redirect(action:list,params:params) }
		
}
