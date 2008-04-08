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
				//def cinestary = []
				def cinestar1 = new Misto(spravce: cinestarSpravce, nazev: "Cinestar", popis: "kino, filmové akce", mesto: Brno, kategorie:kino).save() 
				def cinestar2 = new Misto(spravce: cinestarSpravce,nazev: "Cinestar", popis: "kino, filmové akce", mesto: Ostrava, kategorie:kino).save() 
				def cinestar3 = new Misto(spravce: cinestarSpravce,nazev: "Cinestar", popis: "kino, filmové akce", mesto: Praha, kategorie:kino).save() 
				
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

				def pepa = new Uzivatel(cele_jmeno:"Pepa Novák", email:"pepa@tisa.cz", heslo:"pepa").save()
    				def honza = new Uzivatel(cele_jmeno:"Honza Hloupý", email:"honza@tisa.cz", heslo:"honza").save()
    				def karkulka = new Uzivatel(cele_jmeno:"Karkulka Červená", email:"karkulka@tisa.cz", heslo:"karkulka").save()
    				def cestmir = new Uzivatel(cele_jmeno:"Čestmír Létající", email:"cestmir@tisa.cz", heslo:"cestmir").save()
    				def gott = new Uzivatel(cele_jmeno:"Karel Gott", email:"karel@tisa.cz", heslo:"karel").save()
    				def vladimir = new Uzivatel(cele_jmeno:"Vladimír Čech", email:"vladimir@tisa.cz", heslo:"vladimir").save()
    				def ignac = new Uzivatel(cele_jmeno:"Ignác Neslaný", email:"ignac@tisa.cz", heslo:"ignac").save()
    				def ferdinand = new Uzivatel(cele_jmeno:"Ferdinand Nemastný", email:"ferdinand@tisa.cz", heslo:"ferdinand").save()
    				def iva = new Uzivatel(cele_jmeno:"Iva Fruelingova", email:"iva@tisa.cz", heslo:"iva").save()
    				def ryan = new Uzivatel(cele_jmeno:"Kate Ryan", email:"kate@tisa.cz", heslo:"kate").save()
    				def alice = new Uzivatel(cele_jmeno:"Alice Springs", email:"alice@tisa.cz", heslo:"alice").save()
    				def ted = new Uzivatel(cele_jmeno:"Ted Mosby", email:"ted@tisa.cz", heslo:"mosby").save()
    				def lily = new Uzivatel(cele_jmeno:"Lily Aldrin", email:"aldrin@tisa.cz", heslo:"aldrin").save()
    				def barney = new Uzivatel(cele_jmeno:"Barney Stinson", email:"barney@tisa.cz", heslo:"barney").save()
    				def robin = new Uzivatel(cele_jmeno:"Robin Sherbatsky", email:"robin@tisa.cz", heslo:"robin").save()
    				def marshall = new Uzivatel(cele_jmeno:"Marshall Eriksen", email:"marshall@tisa.cz", heslo:"marshall").save()			
            
            
                        //poradatele			
                        println "poradatele"
            
                                def karel = new Poradatel(cele_jmeno:"Karel Veliký", email:"karel@tisa.cz", telefon:"1234567", adresa:"tramtárie").save()
                                def caesar = new Poradatel(cele_jmeno:"Julius Caesar", email:"caesar@tisa.cz", telefon:"1234567", adresa:"tramtárie").save()
                                def john = new Poradatel(cele_jmeno:"John Locke", email:"john@tisa.cz", telefon:"1234567", adresa:"tramtárie").save()
                                def jack = new Poradatel(cele_jmeno:"Jack Shephard", email:"shephard@tisa.cz", telefon:"1234567", adresa:"tramtárie").save()
                                def james = new Poradatel(cele_jmeno:"James Sawyer Ford", email:"james@tisa.cz", telefon:"1234567", adresa:"tramtárie").save()
                                def kwon = new Poradatel(cele_jmeno:"Jin-Soo Kwon", email:"jinsoo@tisa.cz", telefon:"1234567", adresa:"tramtárie").save()
                                def kate = new Poradatel(cele_jmeno:"Kate Austen", email:"austen@tisa.cz", telefon:"1234567", adresa:"tramtárie").save()
                                def sayid =new Poradatel(cele_jmeno:"Sayid Jarrah", email:"sayid@tisa.cz", telefon:"1234567", adresa:"tramtárie").save()
            
            
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
            
                        //Rozmisteni 
                        println "Rozmisteni"
            
                                def pokusne = new Rozmisteni(nazev:"Pokusne A", misto:cezarena, plan_salu:"plan A").save()
                                def pokusne2 = new Rozmisteni(nazev:"Pokusne B", misto:cezarena, plan_salu:"plan B").save()
                                
                       
                        //akce            
			println "akce"
	
                                def spiderman = new Akce(nazev:"Spiderman 1", zacatek_akce: "2008-04-08 14:50:00", popis:"přepere spiderman batmana? vidět", vstupne_min:70, vstupne_max:150, odkaz:"www.spidy.cz", zpusobVyprseniRezervace:vyprseni5, rozmisteni:pokusne, kategorie:promitani, poradatel:karel, misto:cezarena).save()
                                def superman = new Akce(nazev:"Superman 2", zacatek_akce: "2008-04-08 15:54:00", popis:"přepere superman spidermana?", vstupne_min:170, vstupne_max:270, odkaz:"www.super.cz", zpusobVyprseniRezervace:vyprseni3, rozmisteni:pokusne2, kategorie:besidka, poradatel:caesar, misto:dkvitkovic).save()
                                def batman = new Akce(nazev:"Batman 3", zacatek_akce: "2008-04-08 16:55:00", popis:"přepere batman supermana?", vstupne_min:250, vstupne_max:350, odkaz:"www.bat.cz", zpusobVyprseniRezervace:vyprseni1, rozmisteni:pokusne, kategorie:divadelnihra, poradatel:john, misto:kinoluna).save()



                        //rezervace            
			println "rezervace"
            
                                new Rezervace(mista:"A15",akce:spiderman, rezervovano: "2008-04-08 16:55:00", prodano:true,uzivatel:ted).save()            
                                new Rezervace(mista:"B25",akce:spiderman, rezervovano: "2008-04-08 16:55:00", prodano:true,uzivatel:robin).save()            
                                new Rezervace(mista:"A16",akce:superman, rezervovano: "2008-04-08 18:55:00", prodano:false,uzivatel:barney).save()                                            
                                new Rezervace(mista:"A27",akce:superman, rezervovano: "2008-04-08 18:55:00", prodano:false,uzivatel:marshall).save()            
                                new Rezervace(mista:"C15",akce:spiderman, rezervovano: "2008-04-08 20:55:00", prodano:true,uzivatel:lily).save()            
                                new Rezervace(mista:"C88",akce:spiderman, rezervovano: "2008-04-08 20:55:00", prodano:false,uzivatel:robin).save()            
                                new Rezervace(mista:"A51",akce:spiderman, rezervovano: "2008-04-08 21:55:00", prodano:true,uzivatel:pepa).save()                                            
                                new Rezervace(mista:"A52",akce:batman, rezervovano: "2008-04-08 22:55:00", prodano:false,uzivatel:gott).save()            
            
            
				 def pondeli = [0..4]
				// def saly = []

				// for (cinestar in cinestary) {
					//	def vyprseni = new ZpusobVyprseniRezervace(cas:1800, druh:"before_action_begin")
					//	vyprseni.misto = cinestar
					//	vyprseni.save()
						def sal1 = new Rozmisteni(nazev:"Sál A", misto:cinestar1, plan_salu:"plan A").save()
						def sal2 = new Rozmisteni(nazev:"Sál B", misto:cinestar2, plan_salu:"plan A").save()
						def sal3 = new Rozmisteni(nazev:"Sál C", misto:cinestar3, plan_salu:"plan A").save()
						def sal4 = new Rozmisteni(nazev:"Sál D", misto:cinestar1, plan_salu:"plan A").save()
						def sal5 = new Rozmisteni(nazev:"Sál E", misto:cinestar2, plan_salu:"plan A").save()
						def sal6 = new Rozmisteni(nazev:"Sál F", misto:cinestar3, plan_salu:"plan A").save()

						//for (sal in saly) {
							 def i = 0

							// for ( i=0; i<1; i++) {
									def j = 0
									for (p in pondeli) {
										 p = Calendar.getInstance()
										 p.set(2008, 4, 7+i, 10+i, 0, 0)
										 p = p.getTime()
                                                                                 pondeli[j]=p 
                                                                             //    println p 
										 j++
									}
									new Akce(nazev:"Matrix 4", zacatek_akce:"2008-04-08 14:50:00", popis:"musíte vidět", vstupne_min:150, vstupne_max:150, odkaz:"wewewe.tečka", zpusobVyprseniRezervace:vyprseni1, rozmisteni:sal1, kategorie:promitani, poradatel:karel, misto:cinestar1).save()
									new Akce(nazev:"Alenka za zrcadlem", zacatek_akce:"2008-04-08 14:50:00", popis:"musíte vidět", vstupne_min:50, vstupne_max:150, odkaz:"", zpusobVyprseniRezervace:vyprseni2, rozmisteni:sal2, kategorie:promitani, poradatel:sayid, misto:cinestar1).save()
									new Akce(nazev:"Shrek 8", zacatek_akce:"2008-04-08 14:50:00", popis:"musíte vidět", vstupne_min:150, vstupne_max:150, odkaz:"", zpusobVyprseniRezervace:vyprseni3, rozmisteni:sal3, kategorie:promitani, poradatel:john, misto:cinestar2).save()
									new Akce(nazev:"Life of Brian", zacatek_akce:"2008-04-08 14:50:00", popis:"musíte vidět", vstupne_min:70, vstupne_max:70, odkaz:"", zpusobVyprseniRezervace:vyprseni4, rozmisteni:sal4, kategorie:promitani, poradatel:caesar, misto:cinestar3).save()
									new Akce(nazev:"Rocky 9", zacatek_akce:"2008-04-08 14:50:00", popis:"musíte vidět", vstupne_min:70, vstupne_max:70, odkaz:"", zpusobVyprseniRezervace:vyprseni5, rozmisteni:sal5, kategorie:promitani, poradatel:karel, misto:cinestar2).save()
							// }

						//}
				// }
        } catch (Exception e) {
						print "aaa, probleeem: " + e.toString()
        }
        println "boot - hotovka"

     }
     
     def destroy = {
     }
} 
