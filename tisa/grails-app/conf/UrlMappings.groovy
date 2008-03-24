class UrlMappings {
    static mappings = {
			"/" (controller:"front_end", view:"index")
			"/admin/" (controller:"akce")
			"/admin/akce/$action?/$id?" (controller:"akce")
			"/admin/misto/$action?/$id?" (controller:"misto")
			"/admin/rezervace/$action?/$id?" (controller:"rezervace")
			"/admin/rozmisteni/$action?/$id?" (controller:"rozmisteni")
			"/admin/vyprseni/$action?/$id?" (controller:"zpusob_vyprseni_rezervace")
				
      "/$controller/$action?/$id?"{
	      constraints {
		  }
	  }
      "500"(view:'/error')
        
      }
}
