class RozmisteniController extends AdminController {
    def Scaffold = Rozmisteni

		def layout = "admin"

    def index = { redirect(action:list,params:params) }
}
