class RozmisteniController extends AdminController {
    def Scaffold = Rozmisteni
    def index = { redirect(action:list,params:params) }
}
