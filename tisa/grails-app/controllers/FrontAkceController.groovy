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
                
        if(!params.max) params.max = 10
        [ akceList: list ]
    }
    
    def ukaz_mesto = {
        def list
        def akcemista
        def poleakci = []
        int i = 0
        if(params.id) {
            def mesto = Mesto.get(params.id);
            def mista = mesto.misto;
            if (mista) {
                printf("kuku - mame mista\n")
                for(m in mista){
                    akcemista = m.akce
                    printf("kuku - for vnejsi a ve akcemista je %d polozek\n",akcemista.count())
                  for(a in akcemista){
                    poleakci[i]=a;
                    i++
                    printf("kuku - for vnitrni a i je %d\n",i)
                  }//for vnitrni  
                }//for vnejsi
              list = poleakci  
            } else {
                flash.message = message(code:"tisa.controllers.notfound", args:["Misto", "${params.id}"]) 
                redirect(action:this.list)
            }
        } else {
            list = Akce.list( params )
        }
                
        if(!params.max) params.max = 10
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

}
