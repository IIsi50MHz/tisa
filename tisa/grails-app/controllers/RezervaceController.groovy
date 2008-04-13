            
class RezervaceController extends AdminController {
    
		def layout = "admin"
		
    def index = { redirect(action:list,params:params) }

    // the delete, save and update actions only accept POST requests
    def allowedMethods = [delete:'POST', save:'POST', update:'POST']

    def where = "Rezervace"
    
    def list = {
        if(!params.max) params.max = 20
      //  [ rezervaceList: Rezervace.list( params ) ]
          [ rezervaceList: session.user.listRezervace( ) ]
    }

    def show = {
        def rezervace = Rezervace.get( params.id )

        if(!rezervace) {
            flash.message = message(code:"tisa.controllers.notfound", args:["${where}", "${params.id}"]) 
            redirect(action:list)
        }
        else { return [ rezervace : rezervace ] }
    }

    def delete = {
        def rezervace = Rezervace.get( params.id )
        if(rezervace) {
            rezervace.delete()
            flash.message = message(code:"tisa.controllers.deleted", args:["${where}", "${params.id}"]) 
            redirect(action:list)
        }
        else {
            flash.message = message(code:"tisa.controllers.notfound", args:["${where}", "${params.id}"]) 
            redirect(action:list)
        }
    }


    def create = {
        edit()
    }


		def edit = {
				def rezervace 
				if (params.id) {
						rezervace = Rezervace.get(params.id)
						rezervace.properties = params
        }
				if (!rezervace) {
						rezervace = new Rezervace(params)
				}
				
				def map =[]
				def post = false
				if (rezervace.akce) {
						def seat_class = ""
						map = rezervace.akce.rozmisteni.plan_array()						
						//println params
						map.eachWithIndex() { row, r ->
								row.eachWithIndex() { col, c ->
										if (params['seat['+r+'_'+c+']']) {
												if (post == false) {
														rezervace.mista = ""
														rezervace.mista_count = 0
												}
												post = true;
												rezervace.addMisto([r, c])
										}
								}
						}

						map = markMap(rezervace.akce.rezervace, map, "taken")
						map = markMap([rezervace], map, "checked")
				}
				if (post) {
						if (rezervace.save()) {
								flash.message = message(code:"tisa.rezervace.thank_you")
						} else {
								flash.message = message(code:"tisa.rezervace.problem")
            }
        }
        return [ plan:map, rezervace: rezervace ]
    }

		private markMap(rezervace, map, class_name) {
				for (r in rezervace) {
						for (seat in r.mista.split(' ')) {
								def pos = seat.split('_')
								//println pos
								if (pos.length == 2) {
										map[Integer.parseInt(pos[0])][Integer.parseInt(pos[1])] = class_name
								}
						}
        }
				map
    }
}