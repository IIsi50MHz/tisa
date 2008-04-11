import org.codehaus.groovy.grails.web.json.JSONObject

class FrontAkceController {

		def defaultAction = "list"
		//def index = { redirect(action:list,params:params) }


    // the delete, save and update actions only accept POST requests
    def allowedMethods = [delete:'POST', save:'POST', update:'POST']

    def where = "Akce"
    
    def list = {
        def list
        if(params.id) {
            def misto = Misto.get(params.id);
            if (misto) {
                list = misto.akce;
            } else {
                flash.message = message(code:"tisa.controllers.notfound", args:["Misto", "${params.id}"]) 
                redirect(action:this.list)
            }
        } else {
            list = Akce.list( params )
        }
        //params.max ?: 10
        //[ akceList: list ]
				
        if(!params.max) params.max = 20
        [ akceList: Akce.list( params ) ]
    }
    
    def ukaz_kategorii = {
        def list
        def kategorie
        if(params.id) {
            kategorie = KategorieAkci.get(params.id);
            if (kategorie) {
                list = kategorie.akce;
            } else {
                flash.message = message(code:"tisa.controllers.notfound", args:["Kategorie", "${params.id}"]) 
                redirect(action:this.list)
            }
        } else {
            list = Akce.list( params )
        }
                
        if(!params.max) params.max = 10
        [ kategorie:kategorie, akceList: list ]
    }
    
    def ukaz_mesto = {
				def mesto 
        if(params.id) {
            mesto = Mesto.get(params.id);
				}
				if (!mesto) {
						flash.message = message(code:"tisa.controllers.notfound", args:["Misto", "${params.id}"]) 
						redirect(action:this.list)
        }
        def i = 0
        def list = []
        for(misto in mesto.misto){
						for(rozmisteni in misto.rozmisteni){
								for(akce in rozmisteni.akce) {
										list[i++] = akce;
								}
            }
        }
        if(!params.max) params.max = 10
        [ mesto:mesto, akceList: list ]
    }
    
    def ukaz_misto = {
        def list = []
        def misto
        if(params.id) {
            misto = Misto.get(params.id);
            def i = 0
            
		for(rozmisteni in misto.rozmisteni){
                  for(akce in rozmisteni.akce) {
                    list[i++] = akce;
                  }
            }
        }
        if(!params.max) params.max = 10
        [ misto:misto, akceList: list ]
            
    }			
    

    def show = {
        def akce = Akce.get( params.id )

        if(!akce) {
            flash.message = message(code:"tisa.controllers.notfound", args:["${where}", "${params.id}"]) 
            redirect(action:list)
        }
        else { return [ akce : akce ] }
    }

    def rezervovat = {
        def akce = Akce.get( params.id )
        if(!akce) {
            flash.message = message(code:"tisa.controllers.notfound", args:["${where}", "${params.id}"]) 
            redirect(action:list)
						return
        }
				def user = session.user
				if (user && user.class.getName() == "Uzivatel") {
				    def rezervace = new Rezervace(akce: akce, uzivatel: user)
						def map = [[]]
						def r = 0
						def row = []
						def json = new JSONObject(akce.rozmisteni.plan_salu)
						println "plan: "+akce.rozmisteni.plan_salu
						println "json: "+ json
						map = jsonToArray(json)
		        return [ plan:map, rezervace: rezervace ]
        } else {
						flash.message = "Prosím, přihlašte se než vytvoříte rezrvaci."
						session.after_login_redirect = [controller:"frontAkce", action:"rezervovat", id:params.id]
            redirect(controller:"frontUzivatel", action:"login")
        }
    }
		
		def jsonToArray(json) {
			def array = []
			println json
			for (key in json.keys()) {
				//println key
				//value 
				array[Integer.parseInt(key)] = json.get(key)//jsonToArray()
			}
			array
    }

}
