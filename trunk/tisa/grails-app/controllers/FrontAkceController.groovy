class FrontAkceController {

		//def defaultAction = "list"
		def index = { redirect(action:list,params:params) }


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
        
        if(!params.max) params.max = 10
        [ akceList: Akce.list( params ) ]
    }
    
    def ukaz_kategorii = {
        def list
        if(params.id) {
            def kategorie = KategorieAkci.get(params.id);
            if (kategorie) {
                list = kategorie.akce;
            } else {
                flash.message = message(code:"tisa.controllers.notfound", args:["Kategorie", "${params.id}"]) 
                redirect(action:this.list)
            }
        } else {
            list = Akce.list( params )
        }
        //params.max ?: 10
        //[ akceList: list ]
        
        if(!params.max) params.max = 10
        //[ akceList: list.list( params ) ]
        [ akceList: list ]
    }

    def show = {
        def akce = Akce.get( params.id )

        if(!akce) {
            flash.message = message(code:"tisa.controllers.notfound", args:["${where}", "${params.id}"]) 
            redirect(action:list)
        }
        else { return [ akce : akce ] }
    }

    def delete = {
        def akce = Akce.get( params.id )
        if(akce) {
            akce.delete()
            flash.message = message(code:"tisa.controllers.deleted", args:["${where}", "${params.id}"]) 
            redirect(action:list)
        }
        else {
            flash.message = message(code:"tisa.controllers.notfound", args:["${where}", "${params.id}"]) 
            redirect(action:list)
        }
    }

    def edit = {
        def akce = Akce.get( params.id )

        if(!akce) {
            flash.message = message(code:"tisa.controllers.notfound", args:["${where}", "${params.id}"]) 
            redirect(action:list)
        }
        else {
            return [ akce : akce ]
        }
    }

    def update = {
        def akce = Akce.get( params.id )
        if(akce) {
            akce.properties = params
            if(!akce.hasErrors() && akce.save()) {
                flash.message = message(code:"tisa.controllers.updated", args:["${where}", "${params.id}"]) 
                redirect(action:show,id:akce.id)
            }
            else {
                render(view:'edit',model:[akce:akce])
            }
        }
        else {
            flash.message = message(code:"tisa.controllers.notfound", args:["${where}", "${params.id}"]) 
            redirect(action:edit,id:params.id)
        }
    }

    def create = {
        def akce = new Akce()
        akce.properties = params
        return ['akce':akce]
    }

    def save = {
        def akce = new Akce(params)
        if(!akce.hasErrors() && akce.save()) {
            flash.message = message(code:"tisa.controllers.created", args:["${where}", "${params.id}"]) 
            redirect(action:show,id:akce.id)
        }
        else {
            render(view:'create',model:[akce:akce])
        }
    }
    
    
}
