class BootStrap {

		def init = { servletContext ->
        def Ostrava = new Mesto(jmeno: "Ostrava").save()
        def Opava = new Mesto(jmeno: "Opava").save()
        def Praha = new Mesto(jmeno: "Praha").save()
        def Vratimov = new Mesto(jmeno: "Vratimov").save()
        def Chlebovice = new Mesto(jmeno: "Chlebovice").save()
        def Brno = new Mesto(jmeno: "Brno").save()
        def As = new Mesto(jmeno: "Aš").save()
        def Jablunkov = new Mesto(jmeno: "Jablunkov").save()
        def Zlin = new Mesto(jmeno: "Zlín").save()
        def Liptakov = new Mesto(jmeno: "Liptákov").save()
        def Bilovec= new Mesto(jmeno: "Bílovec").save()
         
				def cinestarSpravce = new Spravce(cele_jmeno:"Franta Cinestar", email:"cinestar@cinestar.cz", heslo:"cinestar").save()
				def ostravaSpravce = new Spravce(cele_jmeno:"Franta Ostrava", email:"ostrava@ostrava.cz", heslo:"cinestar").save()
				def tisaSpravce = new Spravce(cele_jmeno:"Franta Admin", email:"admin@tisa.cz", heslo:"admin", vsechna_prava:true).save()
				def prahaSpravce = new Spravce(cele_jmeno:"Franta Praha", email:"praha@praha.cz", heslo:"praha").save()

        def cinestary = []
						cinestary[0] = new Misto(spravce: cinestarSpravce, nazev: "Cinestar", popis: "kino, filmové akce", mesto: Brno).save() 
						cinestary[1] = new Misto(spravce: cinestarSpravce,nazev: "Cinestar", popis: "kino, filmové akce", mesto: Ostrava).save() 
						cinestary[2] = new Misto(spravce: cinestarSpravce,nazev: "Cinestar", popis: "kino, filmové akce", mesto: Praha).save() 

				new Misto(spravce: ostravaSpravce, nazev: "ČEZ arena", popis: "sportovní akce", mesto: Ostrava).save()			
				new Misto(spravce: ostravaSpravce, nazev: "DK Vitkovic", popis: "společenské akce, výstavy", mesto: Ostrava).save() 
				new Misto(spravce: ostravaSpravce, nazev: "Kino Luna", popis: "kino u Běláku", mesto: Ostrava).save()
				new Misto(spravce: ostravaSpravce, nazev: "Sazka Aréna", popis: "multifunkční hala", mesto: Ostrava).save()
				new Misto(spravce: ostravaSpravce, nazev: "Stadión SK Slezská", popis: "sportovní stadión", mesto: Ostrava).save()

				new Misto(spravce: prahaSpravce, nazev: "Divadlo Járy Cimrmana", popis: "divadlo", mesto: Praha).save()
				new Misto(spravce: prahaSpravce, nazev: "Cinemax", popis: "multiplex", mesto: Praha).save()

				new Misto(spravce: tisaSpravce, nazev: "Kino Hvězda", popis: "kino z Vratimova", mesto: Vratimov).save()
				new Misto(spravce: tisaSpravce, nazev: "Krasenka", popis: "Hasičské plesy, hospoda", mesto: As).save()
				new Misto(spravce: tisaSpravce, nazev: "Divadlo Opona", popis: "nezávislá scéna", mesto: Bilovec).save()
				new Misto(spravce: tisaSpravce, nazev: "DK Chlebovice", popis: "dům kultury", mesto: Chlebovice).save()
				new Misto(spravce: tisaSpravce, nazev: "Divadlo Na Oprátce", popis: "divadelní scéna", mesto: Jablunkov).save()
				new Misto(spravce: tisaSpravce, nazev: "Sál Amadeus", popis: "koncertní sál", mesto: Zlin).save()
				new Misto(spravce: tisaSpravce, nazev: "Zámek Shorazboř", popis: "divadelní scéna, výstavy", mesto: Opava).save()
				new Misto(spravce: tisaSpravce, nazev: "Výstaviště Prokop a.s.", popis: "výstaviště", mesto: Brno).save()
				new Misto(spravce: tisaSpravce, nazev: "Hospoda Na Mýtince", popis: "taneční sál", mesto: Liptakov).save()
        
        def pondeli = [0..4]
        def saly = []
      
        for (cinestar in cinestary) {
            def vyprseni = new ZpusobVyprseniRezervace(cas:1800, druh:"before_action_begin")
            vyprseni.misto = cinestar
            vyprseni.save()
            saly[0] = new Rozmisteni(nazev:"Sál A", misto:cinestar).save()
            saly[1] = new Rozmisteni(nazev:"Sál B", misto:cinestar).save()
            saly[2] = new Rozmisteni(nazev:"Sál C", misto:cinestar).save()
            saly[3] = new Rozmisteni(nazev:"Sál D", misto:cinestar).save()
            saly[4] = new Rozmisteni(nazev:"Sál E", misto:cinestar).save()
            saly[5] = new Rozmisteni(nazev:"Sál F", misto:cinestar).save()
            
            for (sal in saly) {
                def i = 0
                
                for ( i=0; i<7; i++) {
                  def j = 0
                  for (p in pondeli) {
                    p = Calendar.getInstance()
                    p.set(2008, 4, 7+i, 10+j*3, 0, 0)
                    p = p.getTime()
                    j++
                  }
                  new Akce(nazev:"Matrix 4", zacatek_akce:pondeli[0], popis:"musíte vidět",
                    vstupne_min:150, vstupne_max:150, odkaz:"", ZpusobVyprseniRezervace:vyprseni, rozmisteni:sal).save()
                  new Akce(nazev:"Alenka za zrcadlem", zacatek_akce:pondeli[1], popis:"musíte vidět",
                    vstupne_min:50, vstupne_max:150, odkaz:"", ZpusobVyprseniRezervace:vyprseni, rozmisteni:sal).save()
                  new Akce(nazev:"Shrek 8", zacatek_akce:pondeli[2], popis:"musíte vidět",
                    vstupne_min:150, vstupne_max:150, odkaz:"", ZpusobVyprseniRezervace:vyprseni, rozmisteni:sal).save()
                  new Akce(nazev:"Life of Brian", zacatek_akce:pondeli[3], popis:"musíte vidět",
                    vstupne_min:70, vstupne_max:70, odkaz:"", ZpusobVyprseniRezervace:vyprseni, rozmisteni:sal).save()
                  new Akce(nazev:"Rocky 9", zacatek_akce:pondeli[4], popis:"musíte vidět",
                    vstupne_min:70, vstupne_max:70, odkaz:"", ZpusobVyprseniRezervace:vyprseni, rozmisteni:sal).save()
                }
                
            }
        }
        
        
        new Kategorie_akci(nazev: "ples").save()
        new Kategorie_mist(nazev: "kulturní dům").save()
                 
     }
     def destroy = {
     }
} 