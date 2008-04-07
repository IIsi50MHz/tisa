class UrlMappings {
    static mappings = {
			"/" (controller:"front_end", view:"index")
			"/akce/$action?/$id?" (controller:"frontAkce")
			"/mista/$action?/$id?" (controller:"frontMisto")
			"/rezervace/$action?/$id?" (controller:"frontRezervace")
			"/spravce/$action?/$id?" (controller:"frontSpravce")
				

			"/admin/a/$action?/$id?" (controller:"admin")
			"/admin/akce/$action?/$id?" (controller:"akce")
			"/admin/misto/$action?/$id?" (controller:"misto")
                        "/admin/mesto/$action?/$id?" (controller:"mesto")
			"/admin/rezervace/$action?/$id?" (controller:"rezervace")
			"/admin/rozmisteni/$action?/$id?" (controller:"rozmisteni")
			"/admin/vyprseni/$action?/$id?" (controller:"zpusobVyprseniRezervace")
			"/admin/spravce/$action?/$id?" (controller:"spravce")
                        "/admin/poradatel/$action?/$id?" (controller:"poradatel")
                        "/admin/uzivatel/$action?/$id?" (controller:"uzivatel")
                        "/admin/operatorka/$action?/$id?" (controller:"operatorka")
                        "/admin/kategorie_mist/$action?/$id?" (controller:"kategorieMist")
                        "/admin/kategorie_akci/$action?/$id?" (controller:"kategorieAkci")

      "500"(view:'/error')
        
      }
}
