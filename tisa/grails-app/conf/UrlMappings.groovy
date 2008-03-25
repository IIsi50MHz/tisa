class UrlMappings {
    static mappings = {
			"/" (controller:"front_end", view:"index")
			"/akce/$action?/$id?" (controller:"front_akce")
			"/mista/$action?/$id?" (controller:"front_misto")
			"/rezervace/$action?/$id?" (controller:"front_rezervace")
				

			"/admin/" (controller:"akce")
			"/admin/akce/$action?/$id?" (controller:"akce")
			"/admin/misto/$action?/$id?" (controller:"misto")
			"/admin/rezervace/$action?/$id?" (controller:"rezervace")
			"/admin/rozmisteni/$action?/$id?" (controller:"rozmisteni")
			"/admin/vyprseni/$action?/$id?" (controller:"zpusob_vyprseni_rezervace")
			"/admin/spravce/$action?/$id?" (controller:"spravce")

      "500"(view:'/error')
        
      }
}
