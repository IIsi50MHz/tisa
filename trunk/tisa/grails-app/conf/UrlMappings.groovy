class UrlMappings {
    static mappings = {
			"/" (controller:"front_end", view:"index")
			"/akce/$action?/$id?" (controller:"frontAkce")
			"/mista/$action?/$id?" (controller:"frontMisto")
			"/rezervace/$action?/$id?" (controller:"frontRezervace")
			"/spravce/$action?/$id?" (controller:"frontSpravce")
				

			"/admin/" (controller:"admin")
			"/admin/akce/$action?/$id?" (controller:"akce")
			"/admin/misto/$action?/$id?" (controller:"misto")
      "/admin/mesto/$action?/$id?" (controller:"mesto")
			"/admin/rezervace/$action?/$id?" (controller:"rezervace")
			"/admin/rozmisteni/$action?/$id?" (controller:"rozmisteni")
			"/admin/vyprseni/$action?/$id?" (controller:"zpusobVyprseniRezervace")
			"/admin/spravce/$action?/$id?" (controller:"spravce")

      "500"(view:'/error')
        
      }
}
