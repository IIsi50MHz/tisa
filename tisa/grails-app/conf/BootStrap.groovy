class BootStrap {

  def init = { servletContext ->
				try {
			//mesta
                        println "mesta"
						
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

            
                        //správci
                        println "spravci"
                        
				def cinestarSpravce = new Spravce(cele_jmeno:"Franta Cinestar", email:"cinestar@cinestar.cz", heslo:"cinestar").save()
				def ostravaSpravce = new Spravce(cele_jmeno:"Franta Ostrava", email:"ostrava@ostrava.cz", heslo:"cinestar").save()
				def tisaSpravce = new Spravce(cele_jmeno:"Franta Admin", email:"admin@tisa.cz", heslo:"admin", vsechna_prava:true).save()
				def prahaSpravce = new Spravce(cele_jmeno:"Franta Praha", email:"praha@praha.cz", heslo:"praha").save()


                	//kategorie míst
                        println "kategorie mist"
				def kult_dum = new KategorieMist(nazev: "kulturní dům").save()
				def kino = new KategorieMist(nazev: "kino").save()
				def sportovni_zarizeni = new KategorieMist(nazev: "sportovní zařízení").save()
				def arena = new KategorieMist(nazev: "aréna").save()				
				def divadlo = new KategorieMist(nazev: "divadlo").save()				
                                def skolniprostory =new KategorieMist(nazev: "školní prostory").save()
                                def nocniklub =new KategorieMist(nazev: "noční klub").save()
		
			//místa				
      println "mista"
				def cezarena = new Misto(spravce: ostravaSpravce, nazev: "ČEZ arena", popis: "sportovní akce", mesto: Ostrava, kategorie:arena).save()			
				def dkvitkovic = new Misto(spravce: ostravaSpravce, nazev: "DK Vitkovic", popis: "společenské akce, výstavy", mesto: Ostrava, kategorie:kult_dum).save() 
				def kinoluna = new Misto(spravce: ostravaSpravce, nazev: "Kino Luna", popis: "kino u Běláku", mesto: Ostrava, kategorie:kino).save()
				def sazkaarena = new Misto(spravce: ostravaSpravce, nazev: "Sazka Aréna", popis: "multifunkční hala", mesto: Ostrava, kategorie:arena).save()
				def stadionskslezka = new Misto(spravce: ostravaSpravce, nazev: "Stadión SK Slezská", popis: "sportovní stadión", mesto: Ostrava, kategorie:sportovni_zarizeni).save()
				
			println "cinestary"
				def cinestary = []
				cinestary[0] = new Misto(spravce: cinestarSpravce, nazev: "Cinestar", popis: "kino, filmové akce", mesto: Brno, kategorie:kino).save() 
				cinestary[1] = new Misto(spravce: cinestarSpravce,nazev: "Cinestar", popis: "kino, filmové akce", mesto: Ostrava, kategorie:kino).save() 
				cinestary[2] = new Misto(spravce: cinestarSpravce,nazev: "Cinestar", popis: "kino, filmové akce", mesto: Praha, kategorie:kino).save() 
				
			println "dalsi mista"
				new Misto(spravce: prahaSpravce, nazev: "Divadlo Járy Cimrmana", popis: "divadlo", mesto: Praha, kategorie:divadlo).save()
				new Misto(spravce: prahaSpravce, nazev: "Cinemax", popis: "multiplex", mesto: Praha, kategorie:kino).save()

				new Misto(spravce: tisaSpravce, nazev: "Kino Hvězda", popis: "kino z Vratimova", mesto: Vratimov, kategorie:kino).save()
				new Misto(spravce: tisaSpravce, nazev: "Krasenka", popis: "Hasičské plesy, hospoda", mesto: As, kategorie:kult_dum).save()
				new Misto(spravce: tisaSpravce, nazev: "Divadlo Opona", popis: "nezávislá scéna", mesto: Bilovec, kategorie:divadlo).save()
				new Misto(spravce: tisaSpravce, nazev: "DK Chlebovice", popis: "dům kultury", mesto: Chlebovice, kategorie:kult_dum).save()
				new Misto(spravce: tisaSpravce, nazev: "Divadlo Na Oprátce", popis: "divadelní scéna", mesto: Jablunkov, kategorie:divadlo).save()
				new Misto(spravce: tisaSpravce, nazev: "Sál Amadeus", popis: "koncertní sál", mesto: Zlin, kategorie:kult_dum).save()
				new Misto(spravce: tisaSpravce, nazev: "Zámek Shorazboř", popis: "divadelní scéna, výstavy", mesto: Opava, kategorie:divadlo).save()
				new Misto(spravce: tisaSpravce, nazev: "Výstaviště Prokop a.s.", popis: "výstaviště", mesto: Brno, kategorie:kult_dum).save()
				new Misto(spravce: tisaSpravce, nazev: "Hospoda Na Mýtince", popis: "taneční sál", mesto: Liptakov, kategorie:kult_dum).save()


			//operátorky
                        println "operatorky"
				new Operatorka(vsechny_mista:true, cele_jmeno:"Magda Magdonovna", email:"magda@tisa.cz", heslo:"magda", misto: cezarena).save()
				new Operatorka(vsechny_mista:false, cele_jmeno:"Eliška Záhorovská", email:"eliska@tisa.cz", heslo:"eliska", misto: dkvitkovic).save()
				new Operatorka(vsechny_mista:false, cele_jmeno:"Žofie Šumáková", email:"zofie@tisa.cz", heslo:"zofie", misto: dkvitkovic).save()
				new Operatorka(vsechny_mista:true, cele_jmeno:"Alice Mocná", email:"alice@tisa.cz", heslo:"alice", misto: kinoluna).save()
				new Operatorka(vsechny_mista:false, cele_jmeno:"Adéla Nevečeřela", email:"adela@tisa.cz", heslo:"adela", misto: sazkaarena).save()
				new Operatorka(vsechny_mista:true, cele_jmeno:"Karolína Světlá", email:"karolina@tisa.cz", heslo:"karolina", misto: sazkaarena).save()
				new Operatorka(vsechny_mista:false, cele_jmeno:"Božena Němcová", email:"bozena@tisa.cz", heslo:"bozena", misto: stadionskslezka).save()

						
			//uzivatele			
                        println "uzivatele"

				new Uzivatel(cele_jmeno:"Pepa Novák", email:"pepa@tisa.cz", heslo:"pepa").save()
    				new Uzivatel(cele_jmeno:"Honza Hloupý", email:"honza@tisa.cz", heslo:"honza").save()
    				new Uzivatel(cele_jmeno:"Karkulka Červená", email:"karkulka@tisa.cz", heslo:"karkulka").save()
    				new Uzivatel(cele_jmeno:"Čestmír Létající", email:"cestmir@tisa.cz", heslo:"cestmir").save()
    				new Uzivatel(cele_jmeno:"Karel Gott", email:"karel@tisa.cz", heslo:"karel").save()
    				new Uzivatel(cele_jmeno:"Vladimír Čech", email:"vladimir@tisa.cz", heslo:"vladimir").save()
    				new Uzivatel(cele_jmeno:"Ignác Neslaný", email:"ignac@tisa.cz", heslo:"ignac").save()
    				new Uzivatel(cele_jmeno:"Ferdinand Nemastný", email:"ferdinand@tisa.cz", heslo:"ferdinand").save()
    				new Uzivatel(cele_jmeno:"Iva Fruelingova", email:"iva@tisa.cz", heslo:"iva").save()
    				new Uzivatel(cele_jmeno:"Kate Ryan", email:"kate@tisa.cz", heslo:"kate").save()
    				new Uzivatel(cele_jmeno:"Alice Springs", email:"alice@tisa.cz", heslo:"alice").save()
    				new Uzivatel(cele_jmeno:"Ted Mosby", email:"ted@tisa.cz", heslo:"mosby").save()
    				new Uzivatel(cele_jmeno:"Lily Aldrin", email:"aldrin@tisa.cz", heslo:"aldrin").save()
    				new Uzivatel(cele_jmeno:"Barney Stinson", email:"barney@tisa.cz", heslo:"barney").save()
    				new Uzivatel(cele_jmeno:"Robin Sherbatsky", email:"robin@tisa.cz", heslo:"robin").save()
    				new Uzivatel(cele_jmeno:"Marshall Eriksen", email:"marshall@tisa.cz", heslo:"marshall").save()			
            
            
            
           //poradatele			
           println "poradatele"
            
            def karel = new Poradatel(cele_jmeno:"Karel Veliký", email:"karel@tisa.cz").save()
						def caesar = new Poradatel(cele_jmeno:"Julius Caesar", email:"caesar@tisa.cz").save()
						def john = new Poradatel(cele_jmeno:"John Locke", email:"john@tisa.cz").save()
						def jack = new Poradatel(cele_jmeno:"Jack Shephard", email:"shephard@tisa.cz").save()
						def james = new Poradatel(cele_jmeno:"James Sawyer Ford", email:"james@tisa.cz").save()
						def kwon = new Poradatel(cele_jmeno:"Jin-Soo Kwon", email:"jinsoo@tisa.cz").save()
						def kate = new Poradatel(cele_jmeno:"Kate Austen", email:"austen@tisa.cz").save()
						def sayid =new Poradatel(cele_jmeno:"Sayid Jarrah", email:"sayid@tisa.cz").save()
            
            
			//kategorie akcí 
			println "kategorie akci"
			
				def ples = new KategorieAkci(nazev: "ples").save()
				def promitani = new KategorieAkci(nazev: "promítání").save()
				def besidka =new KategorieAkci(nazev: "školní besídka").save()
    		def divadelnihra =new KategorieAkci(nazev: "divadelní hra").save()
    		def koncert =new KategorieAkci(nazev: "koncert").save()
    		def festival =new KategorieAkci(nazev: "filmový festival").save()
    		def maskarnibal =new KategorieAkci(nazev: "maškarní bál").save()
    
      //ZpusobVyprseniRezervace 
			println "ZpusobVyprseniRezervace"
                        
        def vyprseni1 = new ZpusobVyprseniRezervace(cas:1800, druh:"before_action_begin", misto: cezarena).save()
				def vyprseni2 = new ZpusobVyprseniRezervace(cas:14400, druh:"before_action_begin", misto: dkvitkovic).save()
        def vyprseni3 = new ZpusobVyprseniRezervace(cas:2105600, druh:"before_action_begin", misto: kinoluna).save()
        def vyprseni4 = new ZpusobVyprseniRezervace(cas:37600, druh:"after_reservation_taken", misto: stadionskslezka).save()
				def vyprseni5 = new ZpusobVyprseniRezervace(cas:1800, druh:"after_reservation_taken", misto: sazkaarena).save()
            
                        //akce            
			println "akce"
	
				 def pondeli = [0..4]
				 def saly = []

				 for (cinestar in cinestary) {
					//	def vyprseni = new ZpusobVyprseniRezervace(cas:1800, druh:"before_action_begin")
					//	vyprseni.misto = cinestar
					//	vyprseni.save()
					new ZpusobVyprseniRezervace(cas:1800, druh:"before_action_begin", misto:cinestar).save()
					

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
                     pondeli[j]=p 
                     pondeli[j] 
										 j++
									}
									new Akce(nazev:"Matrix 4", zacatek_akce:pondeli[0], popis:"musíte vidět", vstupne_min:150, vstupne_max:150, odkaz:"", ZpusobVyprseniRezervace:vyprseni1, rozmisteni:sal, kategorie:promitani, poradatel:karel).save()
									new Akce(nazev:"Alenka za zrcadlem", zacatek_akce:pondeli[1], popis:"musíte vidět", vstupne_min:50, vstupne_max:150, odkaz:"", ZpusobVyprseniRezervace:vyprseni2, rozmisteni:sal, kategorie:promitani, poradatel:sayid).save()
									new Akce(nazev:"Shrek 8", zacatek_akce:pondeli[2], popis:"musíte vidět", vstupne_min:150, vstupne_max:150, odkaz:"", ZpusobVyprseniRezervace:vyprseni3, rozmisteni:sal, kategorie:promitani, poradatel:john).save()
									new Akce(nazev:"Life of Brian", zacatek_akce:pondeli[3], popis:"musíte vidět", vstupne_min:70, vstupne_max:70, odkaz:"", ZpusobVyprseniRezervace:vyprseni4, rozmisteni:sal, kategorie:promitani, poradatel:caesar).save()
									new Akce(nazev:"Rocky 9", zacatek_akce:pondeli[4], popis:"musíte vidět", vstupne_min:70, vstupne_max:70, odkaz:"", ZpusobVyprseniRezervace:vyprseni5, rozmisteni:sal, kategorie:promitani, poradatel:karel).save()
							 }

						}
				 }
        } catch (Exception e) {
						print "aaa, probleeem: " + e.toString()
        }
        println "boot - hotovka"

     }
     
     def destroy = {
     }
} 