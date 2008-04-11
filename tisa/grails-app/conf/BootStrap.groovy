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
                                def kinohvezda = new Misto(spravce: tisaSpravce, nazev: "Kino Hvězda", popis: "kino z Vratimova", mesto: Vratimov, kategorie:kino).save()
				def krasenka = new Misto(spravce: tisaSpravce, nazev: "Krasenka", popis: "Hasičské plesy, hospoda", mesto: As, kategorie:kult_dum).save()
				def divadloopona = new Misto(spravce: tisaSpravce, nazev: "Divadlo Opona", popis: "nezávislá scéna", mesto: Bilovec, kategorie:divadlo).save()
				def dkchlebovice = new Misto(spravce: tisaSpravce, nazev: "DK Chlebovice", popis: "dům kultury", mesto: Chlebovice, kategorie:kult_dum).save()
				def divadlonaopratce = new Misto(spravce: tisaSpravce, nazev: "Divadlo Na Oprátce", popis: "divadelní scéna", mesto: Jablunkov, kategorie:divadlo).save()
				def salamadeus = new Misto(spravce: tisaSpravce, nazev: "Sál Amadeus", popis: "koncertní sál", mesto: Zlin, kategorie:kult_dum).save()
				def zamek = new Misto(spravce: tisaSpravce, nazev: "Zámek Shorazboř", popis: "divadelní scéna, výstavy", mesto: Opava, kategorie:divadlo).save()
				def prokop = new Misto(spravce: tisaSpravce, nazev: "Výstaviště Prokop a.s.", popis: "výstaviště", mesto: Brno, kategorie:kult_dum).save()
				def hnmytince = new Misto(spravce: tisaSpravce, nazev: "Hospoda Na Mýtince", popis: "taneční sál", mesto: Liptakov, kategorie:kult_dum).save()
                                def cimrman = new Misto(spravce: prahaSpravce, nazev: "Divadlo Járy Cimrmana", popis: "divadlo", mesto: Praha, kategorie:divadlo).save()
				def cinemax =new Misto(spravce: prahaSpravce, nazev: "Cinemax", popis: "multiplex", mesto: Praha, kategorie:kino).save()
            
            
			println "cinestary"
				def cinestary = []
				cinestary[0] = new Misto(spravce: cinestarSpravce, nazev: "Cinestar - Brno", popis: "kino, filmové akce", mesto: Brno, kategorie:kino).save() 
				cinestary[1] = new Misto(spravce: cinestarSpravce,nazev: "Cinestar - Ostrava", popis: "kino, filmové akce", mesto: Ostrava, kategorie:kino).save() 
				cinestary[2] = new Misto(spravce: cinestarSpravce,nazev: "Cinestar - Praha", popis: "kino, filmové akce", mesto: Praha, kategorie:kino).save() 
				
                                
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
                                def vystava =new KategorieAkci(nazev: "výstava").save()
                                def sport =new KategorieAkci(nazev: "sportovní akce").save()
    
            
                      //ZpusobVyprseniRezervace 
                      println "ZpusobVyprseniRezervace"
                                def vyprseni0 = new ZpusobVyprseniRezervace(cas: "půl hodiny", druh:"před začátkem akce", misto: cezarena).save()
                                def vyprseni1 = new ZpusobVyprseniRezervace(cas:"24 hodin", druh:"před začátkem akce", misto: cezarena).save()
				def vyprseni2 = new ZpusobVyprseniRezervace(cas:"týden", druh:"před začátkem akce", misto: dkvitkovic).save()
                                def vyprseni3 = new ZpusobVyprseniRezervace(cas:"4 týdny", druh:"před začátkem akce", misto: kinoluna).save()
                                def vyprseni4 = new ZpusobVyprseniRezervace(cas:"48 hodin", druh:"po rezervaci", misto: stadionskslezka).save()
				def vyprseni5 = new ZpusobVyprseniRezervace(cas:"4 týdny", druh:"po rezervaci", misto: sazkaarena).save()
            
            
                    //rozmisteni
                    def saly = []
									//	def plan  = "{\"0\":{\"1\":\"stage\",\"2\":\"stage\",\"3\":\"stage\",\"4\":\"stage\",\"5\":\"stage\",\"6\":\"stage\",\"7\":\"stage\",\"8\":\"stage\",\"9\":\"stage\",\"10\":\"stage\",\"11\":\"stage\",\"12\":\"stage\",\"13\":\"stage\",\"14\":\"stage\",\"15\":\"stage\",\"16\":\"stage\",\"17\":\"stage\",\"18\":\"stage\"},\"1\":{},\"2\":{},\"3\":{\"4\":\"seat\",\"5\":\"seat\",\"6\":\"seat\",\"7\":\"seat\",\"8\":\"seat\",\"9\":\"seat\",\"10\":\"seat\",\"11\":\"seat\",\"12\":\"seat\",\"13\":\"seat\",\"14\":\"seat\",\"15\":\"seat\"},\"4\":{\"4\":\"seat\",\"5\":\"seat\",\"6\":\"seat\",\"7\":\"seat\",\"8\":\"seat\",\"9\":\"seat\",\"10\":\"seat\",\"11\":\"seat\",\"12\":\"seat\",\"13\":\"seat\",\"14\":\"seat\",\"15\":\"seat\"},\"5\":{\"4\":\"seat\",\"5\":\"seat\",\"6\":\"seat\",\"7\":\"seat\",\"8\":\"seat\",\"9\":\"seat\",\"10\":\"seat\",\"11\":\"seat\",\"12\":\"seat\",\"13\":\"seat\",\"14\":\"seat\",\"15\":\"seat\"},\"6\":{\"4\":\"seat\",\"5\":\"seat\",\"6\":\"seat\",\"7\":\"seat\",\"8\":\"seat\",\"9\":\"seat\",\"10\":\"seat\",\"11\":\"seat\",\"12\":\"seat\",\"13\":\"seat\",\"14\":\"seat\",\"15\":\"seat\"},\"7\":{\"4\":\"seat\",\"5\":\"seat\",\"6\":\"seat\",\"7\":\"seat\",\"8\":\"seat\",\"9\":\"seat\",\"10\":\"seat\",\"11\":\"seat\",\"12\":\"seat\",\"13\":\"seat\",\"14\":\"seat\",\"15\":\"seat\"},\"8\":{},\"9\":{\"1\":\"door\",\"4\":\"seat\",\"5\":\"seat\",\"6\":\"seat\",\"7\":\"seat\",\"8\":\"seat\",\"9\":\"seat\",\"10\":\"seat\",\"11\":\"seat\",\"12\":\"seat\",\"13\":\"seat\",\"14\":\"seat\",\"15\":\"seat\",\"18\":\"door\",\"19\":\"door\"},\"10\":{\"4\":\"seat\",\"5\":\"seat\",\"6\":\"seat\",\"7\":\"seat\",\"8\":\"seat\",\"9\":\"seat\",\"10\":\"seat\",\"11\":\"seat\",\"12\":\"seat\",\"13\":\"seat\",\"14\":\"seat\",\"15\":\"seat\"},\"11\":{\"1\":\"seat\",\"2\":\"seat\",\"4\":\"seat\",\"5\":\"seat\",\"6\":\"seat\",\"7\":\"seat\",\"8\":\"seat\",\"9\":\"seat\",\"10\":\"seat\",\"11\":\"seat\",\"12\":\"seat\",\"13\":\"seat\",\"14\":\"seat\",\"15\":\"seat\",\"17\":\"seat\",\"18\":\"seat\",\"19\":\"seat\"},\"12\":{\"1\":\"seat\",\"2\":\"seat\",\"4\":\"seat\",\"5\":\"seat\",\"6\":\"seat\",\"7\":\"seat\",\"8\":\"seat\",\"9\":\"seat\",\"10\":\"seat\",\"11\":\"seat\",\"12\":\"seat\",\"13\":\"seat\",\"14\":\"seat\",\"15\":\"seat\",\"17\":\"seat\",\"18\":\"seat\",\"19\":\"seat\"},\"13\":{},\"14\":{\"1\":\"seat\",\"2\":\"seat\",\"4\":\"seat\",\"5\":\"seat\",\"6\":\"seat\",\"7\":\"seat\",\"8\":\"seat\",\"9\":\"seat\",\"10\":\"seat\",\"11\":\"seat\",\"12\":\"seat\",\"13\":\"seat\",\"14\":\"seat\",\"15\":\"seat\",\"17\":\"seat\",\"18\":\"seat\",\"19\":\"seat\"},\"15\":{\"1\":\"seat\",\"2\":\"seat\",\"4\":\"seat\",\"5\":\"seat\",\"6\":\"seat\",\"7\":\"seat\",\"8\":\"seat\",\"9\":\"seat\",\"10\":\"seat\",\"11\":\"seat\",\"12\":\"seat\",\"13\":\"seat\",\"14\":\"seat\",\"15\":\"seat\",\"17\":\"seat\",\"18\":\"seat\",\"19\":\"seat\"},\"16\":{\"1\":\"seat\",\"2\":\"seat\",\"4\":\"seat\",\"5\":\"seat\",\"6\":\"seat\",\"7\":\"seat\",\"8\":\"seat\",\"9\":\"seat\",\"10\":\"seat\",\"11\":\"seat\",\"12\":\"seat\",\"13\":\"seat\",\"14\":\"seat\",\"15\":\"seat\",\"17\":\"seat\",\"18\":\"seat\",\"19\":\"seat\"},\"17\":{\"1\":\"seat\",\"2\":\"seat\",\"4\":\"seat\",\"5\":\"seat\",\"6\":\"seat\",\"7\":\"seat\",\"8\":\"seat\",\"9\":\"seat\",\"10\":\"seat\",\"11\":\"seat\",\"12\":\"seat\",\"13\":\"seat\",\"14\":\"seat\",\"15\":\"seat\",\"17\":\"seat\",\"18\":\"seat\",\"19\":\"seat\"},\"18\":{},\"19\":{\"4\":\"seat\",\"5\":\"seat\",\"6\":\"seat\",\"7\":\"seat\",\"8\":\"seat\",\"9\":\"seat\",\"10\":\"seat\",\"11\":\"seat\",\"12\":\"seat\",\"13\":\"seat\",\"14\":\"seat\",\"15\":\"seat\",\"16\":\"seat\"}}"
                                                                        
                                def plan2 = "{\"0\":{\"2\":\"stage\",\"3\":\"stage\",\"4\":\"stage\",\"5\":\"stage\",\"6\":\"stage\",\"7\":\"stage\",\"8\":\"stage\",\"9\":\"stage\",\"10\":\"stage\",\"11\":\"stage\",\"12\":\"stage\",\"13\":\"stage\",\"14\":\"stage\",\"15\":\"stage\",\"16\":\"stage\",\"17\":\"stage\"},\"1\":{\"2\":\"stage\",\"3\":\"stage\",\"4\":\"stage\",\"5\":\"stage\",\"6\":\"stage\",\"7\":\"stage\",\"8\":\"stage\",\"9\":\"stage\",\"10\":\"stage\",\"11\":\"stage\",\"12\":\"stage\",\"13\":\"stage\",\"14\":\"stage\",\"15\":\"stage\",\"16\":\"stage\",\"17\":\"stage\"},\"2\":{\"2\":\"stage\",\"3\":\"stage\",\"4\":\"stage\",\"5\":\"stage\",\"6\":\"stage\",\"7\":\"stage\",\"8\":\"stage\",\"9\":\"stage\",\"10\":\"stage\",\"11\":\"stage\",\"12\":\"stage\",\"13\":\"stage\",\"14\":\"stage\",\"15\":\"stage\",\"16\":\"stage\",\"17\":\"stage\"},\"3\":{\"2\":\"stage\",\"3\":\"stage\",\"4\":\"stage\",\"5\":\"stage\",\"6\":\"stage\",\"7\":\"stage\",\"8\":\"stage\",\"9\":\"stage\",\"10\":\"stage\",\"11\":\"stage\",\"12\":\"stage\",\"13\":\"stage\",\"14\":\"stage\",\"15\":\"stage\",\"16\":\"stage\",\"17\":\"stage\"},\"4\":{},\"5\":{},\"6\":{\"2\":\"seat\",\"3\":\"seat\",\"4\":\"seat\",\"5\":\"seat\",\"6\":\"seat\",\"7\":\"seat\",\"8\":\"seat\",\"11\":\"seat\",\"12\":\"seat\",\"13\":\"seat\",\"14\":\"seat\",\"15\":\"seat\",\"16\":\"seat\",\"17\":\"seat\"},\"7\":{\"2\":\"seat\",\"3\":\"seat\",\"4\":\"seat\",\"5\":\"seat\",\"6\":\"seat\",\"7\":\"seat\",\"8\":\"seat\",\"11\":\"seat\",\"12\":\"seat\",\"13\":\"seat\",\"14\":\"seat\",\"15\":\"seat\",\"16\":\"seat\",\"17\":\"seat\"},\"8\":{\"2\":\"seat\",\"3\":\"seat\",\"4\":\"seat\",\"5\":\"seat\",\"6\":\"seat\",\"7\":\"seat\",\"8\":\"seat\",\"11\":\"seat\",\"12\":\"seat\",\"13\":\"seat\",\"14\":\"seat\",\"15\":\"seat\",\"16\":\"seat\",\"17\":\"seat\"},\"9\":{\"19\":\"door\"},\"10\":{\"2\":\"seat\",\"3\":\"seat\",\"4\":\"seat\",\"5\":\"seat\",\"6\":\"seat\",\"7\":\"seat\",\"8\":\"seat\",\"11\":\"seat\",\"12\":\"seat\",\"13\":\"seat\",\"14\":\"seat\",\"15\":\"seat\",\"16\":\"seat\",\"17\":\"seat\"},\"11\":{\"2\":\"seat\",\"3\":\"seat\",\"4\":\"seat\",\"5\":\"seat\",\"6\":\"seat\",\"7\":\"seat\",\"8\":\"seat\",\"11\":\"seat\",\"12\":\"seat\",\"13\":\"seat\",\"14\":\"seat\",\"15\":\"seat\",\"16\":\"seat\",\"17\":\"seat\"},\"12\":{\"2\":\"seat\",\"3\":\"seat\",\"4\":\"seat\",\"5\":\"seat\",\"6\":\"seat\",\"7\":\"seat\",\"8\":\"seat\",\"11\":\"seat\",\"12\":\"seat\",\"13\":\"seat\",\"14\":\"seat\",\"15\":\"seat\",\"16\":\"seat\",\"17\":\"seat\"},\"13\":{\"2\":\"seat\",\"3\":\"seat\",\"4\":\"seat\",\"5\":\"seat\",\"6\":\"seat\",\"7\":\"seat\",\"8\":\"seat\",\"11\":\"seat\",\"12\":\"seat\",\"13\":\"seat\",\"14\":\"seat\",\"15\":\"seat\",\"16\":\"seat\",\"17\":\"seat\"},\"14\":{\"2\":\"seat\",\"3\":\"seat\",\"4\":\"seat\",\"5\":\"seat\",\"6\":\"seat\",\"7\":\"seat\",\"8\":\"seat\",\"11\":\"seat\",\"12\":\"seat\",\"13\":\"seat\",\"14\":\"seat\",\"15\":\"seat\",\"16\":\"seat\",\"17\":\"seat\"},\"15\":{\"19\":\"door\"},\"16\":{\"2\":\"seat\",\"3\":\"seat\",\"4\":\"seat\",\"5\":\"seat\",\"6\":\"seat\",\"7\":\"seat\",\"8\":\"seat\",\"11\":\"seat\",\"12\":\"seat\",\"13\":\"seat\",\"14\":\"seat\",\"15\":\"seat\",\"16\":\"seat\",\"17\":\"seat\"},\"17\":{\"2\":\"seat\",\"3\":\"seat\",\"4\":\"seat\",\"5\":\"seat\",\"6\":\"seat\",\"7\":\"seat\",\"8\":\"seat\",\"11\":\"seat\",\"12\":\"seat\",\"13\":\"seat\",\"14\":\"seat\",\"15\":\"seat\",\"16\":\"seat\",\"17\":\"seat\"},\"18\":{\"2\":\"seat\",\"3\":\"seat\",\"4\":\"seat\",\"5\":\"seat\",\"6\":\"seat\",\"7\":\"seat\",\"8\":\"seat\",\"11\":\"seat\",\"12\":\"seat\",\"13\":\"seat\",\"14\":\"seat\",\"15\":\"seat\",\"16\":\"seat\",\"17\":\"seat\"},\"19\":{\"9\":\"door\",\"10\":\"door\"}}"
                                def plan3 = "{\"0\":{\"1\":\"seat\",\"2\":\"seat\",\"3\":\"seat\",\"4\":\"seat\",\"5\":\"seat\",\"6\":\"seat\",\"7\":\"door\",\"8\":\"seat\",\"9\":\"seat\",\"10\":\"seat\",\"11\":\"seat\",\"12\":\"seat\",\"13\":\"seat\",\"14\":\"seat\"},\"1\":{\"1\":\"seat\",\"2\":\"seat\",\"3\":\"seat\",\"4\":\"seat\",\"5\":\"seat\",\"6\":\"seat\",\"8\":\"seat\",\"9\":\"seat\",\"10\":\"seat\",\"11\":\"seat\",\"12\":\"seat\",\"13\":\"seat\",\"14\":\"seat\"},\"2\":{\"1\":\"seat\",\"2\":\"seat\",\"3\":\"seat\",\"4\":\"seat\",\"5\":\"seat\",\"6\":\"seat\",\"8\":\"seat\",\"9\":\"seat\",\"10\":\"seat\",\"11\":\"seat\",\"12\":\"seat\",\"13\":\"seat\",\"14\":\"seat\"},\"3\":{\"1\":\"seat\",\"2\":\"seat\",\"12\":\"seat\",\"13\":\"seat\",\"14\":\"seat\"},\"4\":{\"1\":\"seat\",\"2\":\"seat\",\"4\":\"stage\",\"5\":\"stage\",\"6\":\"stage\",\"7\":\"stage\",\"8\":\"stage\",\"9\":\"stage\",\"10\":\"stage\",\"12\":\"seat\",\"13\":\"seat\",\"14\":\"seat\"},\"5\":{\"1\":\"seat\",\"2\":\"seat\",\"4\":\"stage\",\"5\":\"stage\",\"6\":\"stage\",\"7\":\"stage\",\"8\":\"stage\",\"9\":\"stage\",\"10\":\"stage\",\"12\":\"seat\",\"13\":\"seat\",\"14\":\"seat\"},\"6\":{\"1\":\"seat\",\"2\":\"seat\",\"4\":\"stage\",\"5\":\"stage\",\"6\":\"stage\",\"7\":\"stage\",\"8\":\"stage\",\"9\":\"stage\",\"10\":\"stage\",\"12\":\"seat\",\"13\":\"seat\",\"14\":\"seat\"},\"7\":{\"4\":\"stage\",\"5\":\"stage\",\"6\":\"stage\",\"7\":\"stage\",\"8\":\"stage\",\"9\":\"stage\",\"10\":\"stage\",\"14\":\"door\"},\"8\":{\"1\":\"seat\",\"2\":\"seat\",\"4\":\"stage\",\"5\":\"stage\",\"6\":\"stage\",\"7\":\"stage\",\"8\":\"stage\",\"9\":\"stage\",\"10\":\"stage\",\"12\":\"seat\",\"13\":\"seat\",\"14\":\"seat\"},\"9\":{\"1\":\"seat\",\"2\":\"seat\",\"4\":\"stage\",\"5\":\"stage\",\"6\":\"stage\",\"7\":\"stage\",\"8\":\"stage\",\"9\":\"stage\",\"10\":\"stage\",\"12\":\"seat\",\"13\":\"seat\",\"14\":\"seat\"},\"10\":{\"1\":\"seat\",\"2\":\"seat\",\"4\":\"stage\",\"5\":\"stage\",\"6\":\"stage\",\"7\":\"stage\",\"8\":\"stage\",\"9\":\"stage\",\"10\":\"stage\",\"12\":\"seat\",\"13\":\"seat\",\"14\":\"seat\"},\"11\":{\"1\":\"seat\",\"2\":\"seat\",\"12\":\"seat\",\"13\":\"seat\",\"14\":\"seat\"},\"12\":{\"1\":\"seat\",\"2\":\"seat\",\"3\":\"seat\",\"4\":\"seat\",\"5\":\"seat\",\"6\":\"seat\",\"8\":\"seat\",\"9\":\"seat\",\"10\":\"seat\",\"11\":\"seat\",\"12\":\"seat\",\"13\":\"seat\",\"14\":\"seat\"},\"13\":{\"1\":\"seat\",\"2\":\"seat\",\"3\":\"seat\",\"4\":\"seat\",\"5\":\"seat\",\"6\":\"seat\",\"8\":\"seat\",\"9\":\"seat\",\"10\":\"seat\",\"11\":\"seat\",\"12\":\"seat\",\"13\":\"seat\",\"14\":\"seat\"},\"14\":{\"1\":\"seat\",\"2\":\"seat\",\"3\":\"seat\",\"4\":\"seat\",\"5\":\"seat\",\"6\":\"seat\",\"7\":\"door\",\"8\":\"seat\",\"9\":\"seat\",\"10\":\"seat\",\"11\":\"seat\",\"12\":\"seat\",\"13\":\"seat\",\"14\":\"seat\"}}"
                                def plan4 = "{\"0\":{\"1\":\"seat\",\"2\":\"seat\",\"3\":\"seat\",\"4\":\"seat\",\"5\":\"seat\",\"6\":\"seat\",\"7\":\"seat\",\"8\":\"seat\",\"9\":\"seat\",\"10\":\"seat\",\"11\":\"seat\",\"13\":\"seat\",\"14\":\"seat\",\"15\":\"seat\",\"16\":\"seat\",\"17\":\"seat\",\"18\":\"seat\",\"19\":\"seat\",\"20\":\"seat\",\"21\":\"seat\",\"22\":\"seat\",\"23\":\"seat\",\"24\":\"seat\"},\"1\":{\"1\":\"seat\",\"2\":\"seat\",\"3\":\"seat\",\"4\":\"seat\",\"5\":\"seat\",\"6\":\"seat\",\"7\":\"seat\",\"8\":\"seat\",\"9\":\"seat\",\"10\":\"seat\",\"11\":\"seat\",\"13\":\"seat\",\"14\":\"seat\",\"15\":\"seat\",\"16\":\"seat\",\"17\":\"seat\",\"18\":\"seat\",\"19\":\"seat\",\"20\":\"seat\",\"21\":\"seat\",\"22\":\"seat\",\"23\":\"seat\",\"24\":\"seat\"},\"2\":{\"1\":\"seat\",\"2\":\"seat\",\"3\":\"seat\",\"21\":\"seat\",\"22\":\"seat\",\"23\":\"seat\",\"24\":\"seat\"},\"3\":{\"1\":\"seat\",\"2\":\"seat\",\"5\":\"stage\",\"6\":\"stage\",\"7\":\"stage\",\"8\":\"stage\",\"9\":\"stage\",\"10\":\"stage\",\"11\":\"stage\",\"12\":\"stage\",\"13\":\"stage\",\"14\":\"stage\",\"15\":\"stage\",\"16\":\"stage\",\"17\":\"stage\",\"18\":\"stage\",\"19\":\"stage\",\"22\":\"seat\",\"23\":\"seat\",\"24\":\"seat\"},\"4\":{\"1\":\"seat\",\"2\":\"seat\",\"4\":\"stage\",\"5\":\"stage\",\"6\":\"stage\",\"7\":\"stage\",\"8\":\"stage\",\"9\":\"stage\",\"10\":\"stage\",\"11\":\"stage\",\"12\":\"stage\",\"13\":\"stage\",\"14\":\"stage\",\"15\":\"stage\",\"16\":\"stage\",\"17\":\"stage\",\"18\":\"stage\",\"19\":\"stage\",\"20\":\"stage\",\"22\":\"seat\",\"23\":\"seat\",\"24\":\"seat\"},\"5\":{\"1\":\"seat\",\"2\":\"seat\",\"4\":\"stage\",\"5\":\"stage\",\"6\":\"stage\",\"7\":\"stage\",\"8\":\"stage\",\"9\":\"stage\",\"10\":\"stage\",\"11\":\"stage\",\"12\":\"stage\",\"13\":\"stage\",\"14\":\"stage\",\"15\":\"stage\",\"16\":\"stage\",\"17\":\"stage\",\"18\":\"stage\",\"19\":\"stage\",\"20\":\"stage\",\"22\":\"seat\",\"23\":\"seat\",\"24\":\"seat\"},\"6\":{\"1\":\"seat\",\"2\":\"seat\",\"4\":\"stage\",\"5\":\"stage\",\"6\":\"stage\",\"7\":\"stage\",\"8\":\"stage\",\"9\":\"stage\",\"10\":\"stage\",\"11\":\"stage\",\"12\":\"stage\",\"13\":\"stage\",\"14\":\"stage\",\"15\":\"stage\",\"16\":\"stage\",\"17\":\"stage\",\"18\":\"stage\",\"19\":\"stage\",\"20\":\"stage\",\"22\":\"seat\",\"23\":\"seat\",\"24\":\"seat\"},\"7\":{\"1\":\"seat\",\"2\":\"seat\",\"4\":\"stage\",\"5\":\"stage\",\"6\":\"stage\",\"7\":\"stage\",\"8\":\"stage\",\"9\":\"stage\",\"10\":\"stage\",\"11\":\"stage\",\"12\":\"stage\",\"13\":\"stage\",\"14\":\"stage\",\"15\":\"stage\",\"16\":\"stage\",\"17\":\"stage\",\"18\":\"stage\",\"19\":\"stage\",\"20\":\"stage\",\"22\":\"seat\",\"23\":\"seat\",\"24\":\"seat\"},\"8\":{\"1\":\"seat\",\"2\":\"seat\",\"4\":\"stage\",\"5\":\"stage\",\"6\":\"stage\",\"7\":\"stage\",\"8\":\"stage\",\"9\":\"stage\",\"10\":\"stage\",\"11\":\"stage\",\"12\":\"stage\",\"13\":\"stage\",\"14\":\"stage\",\"15\":\"stage\",\"16\":\"stage\",\"17\":\"stage\",\"18\":\"stage\",\"19\":\"stage\",\"20\":\"stage\",\"22\":\"seat\",\"23\":\"seat\",\"24\":\"seat\"},\"9\":{\"1\":\"seat\",\"2\":\"seat\",\"4\":\"stage\",\"5\":\"stage\",\"6\":\"stage\",\"7\":\"stage\",\"8\":\"stage\",\"9\":\"stage\",\"10\":\"stage\",\"11\":\"stage\",\"12\":\"stage\",\"13\":\"stage\",\"14\":\"stage\",\"15\":\"stage\",\"16\":\"stage\",\"17\":\"stage\",\"18\":\"stage\",\"19\":\"stage\",\"20\":\"stage\",\"22\":\"seat\",\"23\":\"seat\",\"24\":\"seat\"},\"10\":{\"1\":\"seat\",\"2\":\"seat\",\"4\":\"stage\",\"5\":\"stage\",\"6\":\"stage\",\"7\":\"stage\",\"8\":\"stage\",\"9\":\"stage\",\"10\":\"stage\",\"11\":\"stage\",\"12\":\"stage\",\"13\":\"stage\",\"14\":\"stage\",\"15\":\"stage\",\"16\":\"stage\",\"17\":\"stage\",\"18\":\"stage\",\"19\":\"stage\",\"20\":\"stage\",\"22\":\"seat\",\"23\":\"seat\",\"24\":\"seat\"},\"11\":{\"1\":\"seat\",\"2\":\"seat\",\"5\":\"stage\",\"6\":\"stage\",\"7\":\"stage\",\"8\":\"stage\",\"9\":\"stage\",\"10\":\"stage\",\"11\":\"stage\",\"12\":\"stage\",\"13\":\"stage\",\"14\":\"stage\",\"15\":\"stage\",\"16\":\"stage\",\"17\":\"stage\",\"18\":\"stage\",\"19\":\"stage\",\"22\":\"seat\",\"23\":\"seat\",\"24\":\"seat\"},\"12\":{\"1\":\"seat\",\"2\":\"seat\",\"3\":\"seat\",\"4\":\"seat\",\"20\":\"seat\",\"21\":\"seat\",\"22\":\"seat\",\"23\":\"seat\",\"24\":\"seat\"},\"13\":{\"1\":\"seat\",\"2\":\"seat\",\"3\":\"seat\",\"4\":\"seat\",\"5\":\"seat\",\"6\":\"seat\",\"7\":\"seat\",\"8\":\"seat\",\"9\":\"seat\",\"10\":\"seat\",\"11\":\"seat\",\"13\":\"seat\",\"14\":\"seat\",\"15\":\"seat\",\"16\":\"seat\",\"17\":\"seat\",\"18\":\"seat\",\"19\":\"seat\",\"20\":\"seat\",\"21\":\"seat\",\"22\":\"seat\",\"23\":\"seat\",\"24\":\"seat\"},\"14\":{\"1\":\"seat\",\"2\":\"seat\",\"3\":\"seat\",\"4\":\"seat\",\"5\":\"seat\",\"6\":\"seat\",\"7\":\"seat\",\"8\":\"seat\",\"9\":\"seat\",\"10\":\"seat\",\"11\":\"seat\",\"13\":\"seat\",\"14\":\"seat\",\"15\":\"seat\",\"16\":\"seat\",\"17\":\"seat\",\"18\":\"seat\",\"19\":\"seat\",\"20\":\"seat\",\"21\":\"seat\",\"22\":\"seat\",\"23\":\"seat\",\"24\":\"seat\"}}"
                                
                                                                                def plan = "{\"0\":{\"1\":\"stage\",\"2\":\"stage\",\"3\":\"stage\",\"4\":\"stage\",\"5\":\"stage\",\"6\":\"stage\",\"7\":\"stage\",\"8\":\"stage\",\"9\":\"stage\",\"10\":\"stage\",\"11\":\"stage\",\"12\":\"stage\",\"13\":\"stage\",\"14\":\"stage\",\"15\":\"stage\",\"16\":\"stage\",\"17\":\"stage\",\"18\":\"stage\"},\"1\":{},\"2\":{},\"3\":{\"4\":\"seat\",\"5\":\"seat\",\"6\":\"seat\",\"7\":\"seat\",\"8\":\"seat\",\"9\":\"seat\",\"10\":\"seat\",\"11\":\"seat\",\"12\":\"seat\",\"13\":\"seat\",\"14\":\"seat\",\"15\":\"seat\"},\"4\":{\"4\":\"seat\",\"5\":\"seat\",\"6\":\"seat\",\"7\":\"seat\",\"8\":\"seat\",\"9\":\"seat\",\"10\":\"seat\",\"11\":\"seat\",\"12\":\"seat\",\"13\":\"seat\",\"14\":\"seat\",\"15\":\"seat\"},\"5\":{\"4\":\"seat\",\"5\":\"seat\",\"6\":\"seat\",\"7\":\"seat\",\"8\":\"seat\",\"9\":\"seat\",\"10\":\"seat\",\"11\":\"seat\",\"12\":\"seat\",\"13\":\"seat\",\"14\":\"seat\",\"15\":\"seat\"},\"6\":{\"4\":\"seat\",\"5\":\"seat\",\"6\":\"seat\",\"7\":\"seat\",\"8\":\"seat\",\"9\":\"seat\",\"10\":\"seat\",\"11\":\"seat\",\"12\":\"seat\",\"13\":\"seat\",\"14\":\"seat\",\"15\":\"seat\"},\"7\":{\"4\":\"seat\",\"5\":\"seat\",\"6\":\"seat\",\"7\":\"seat\",\"8\":\"seat\",\"9\":\"seat\",\"10\":\"seat\",\"11\":\"seat\",\"12\":\"seat\",\"13\":\"seat\",\"14\":\"seat\",\"15\":\"seat\"},\"8\":{},\"9\":{\"1\":\"door\",\"4\":\"seat\",\"5\":\"seat\",\"6\":\"seat\",\"7\":\"seat\",\"8\":\"seat\",\"9\":\"seat\",\"10\":\"seat\",\"11\":\"seat\",\"12\":\"seat\",\"13\":\"seat\",\"14\":\"seat\",\"15\":\"seat\",\"18\":\"door\",\"19\":\"door\"},\"10\":{\"4\":\"seat\",\"5\":\"seat\",\"6\":\"seat\",\"7\":\"seat\",\"8\":\"seat\",\"9\":\"seat\",\"10\":\"seat\",\"11\":\"seat\",\"12\":\"seat\",\"13\":\"seat\",\"14\":\"seat\",\"15\":\"seat\"},\"11\":{\"1\":\"seat\",\"2\":\"seat\",\"4\":\"seat\",\"5\":\"seat\",\"6\":\"seat\",\"7\":\"seat\",\"8\":\"seat\",\"9\":\"seat\",\"10\":\"seat\",\"11\":\"seat\",\"12\":\"seat\",\"13\":\"seat\",\"14\":\"seat\",\"15\":\"seat\",\"17\":\"seat\",\"18\":\"seat\",\"19\":\"seat\"},\"12\":{\"1\":\"seat\",\"2\":\"seat\",\"4\":\"seat\",\"5\":\"seat\",\"6\":\"seat\",\"7\":\"seat\",\"8\":\"seat\",\"9\":\"seat\",\"10\":\"seat\",\"11\":\"seat\",\"12\":\"seat\",\"13\":\"seat\",\"14\":\"seat\",\"15\":\"seat\",\"17\":\"seat\",\"18\":\"seat\",\"19\":\"seat\"},\"13\":{},\"14\":{\"1\":\"seat\",\"2\":\"seat\",\"4\":\"seat\",\"5\":\"seat\",\"6\":\"seat\",\"7\":\"seat\",\"8\":\"seat\",\"9\":\"seat\",\"10\":\"seat\",\"11\":\"seat\",\"12\":\"seat\",\"13\":\"seat\",\"14\":\"seat\",\"15\":\"seat\",\"17\":\"seat\",\"18\":\"seat\",\"19\":\"seat\"},\"15\":{\"1\":\"seat\",\"2\":\"seat\",\"4\":\"seat\",\"5\":\"seat\",\"6\":\"seat\",\"7\":\"seat\",\"8\":\"seat\",\"9\":\"seat\",\"10\":\"seat\",\"11\":\"seat\",\"12\":\"seat\",\"13\":\"seat\",\"14\":\"seat\",\"15\":\"seat\",\"17\":\"seat\",\"18\":\"seat\",\"19\":\"seat\"},\"16\":{\"1\":\"seat\",\"2\":\"seat\",\"4\":\"seat\",\"5\":\"seat\",\"6\":\"seat\",\"7\":\"seat\",\"8\":\"seat\",\"9\":\"seat\",\"10\":\"seat\",\"11\":\"seat\",\"12\":\"seat\",\"13\":\"seat\",\"14\":\"seat\",\"15\":\"seat\",\"17\":\"seat\",\"18\":\"seat\",\"19\":\"seat\"},\"17\":{\"1\":\"seat\",\"2\":\"seat\",\"4\":\"seat\",\"5\":\"seat\",\"6\":\"seat\",\"7\":\"seat\",\"8\":\"seat\",\"9\":\"seat\",\"10\":\"seat\",\"11\":\"seat\",\"12\":\"seat\",\"13\":\"seat\",\"14\":\"seat\",\"15\":\"seat\",\"17\":\"seat\",\"18\":\"seat\",\"19\":\"seat\"},\"18\":{},\"19\":{\"4\":\"seat\",\"5\":\"seat\",\"6\":\"seat\",\"7\":\"seat\",\"8\":\"seat\",\"9\":\"seat\",\"10\":\"seat\",\"11\":\"seat\",\"12\":\"seat\",\"13\":\"seat\",\"14\":\"seat\",\"15\":\"seat\",\"16\":\"seat\"}}"
                                
                    saly[0] = new Rozmisteni(nazev:"Sál A", plan_salu: plan, misto:cinestary[0]).save()
                    saly[1] = new Rozmisteni(nazev:"Sál B", plan_salu: plan, misto:cinestary[1]).save()
                    saly[2] = new Rozmisteni(nazev:"Sál C", plan_salu: plan, misto:cinestary[2]).save()
                    saly[3] = new Rozmisteni(nazev:"Sál D", plan_salu: plan, misto:cinestary[0]).save()
                    saly[4] = new Rozmisteni(nazev:"Sál E", plan_salu: plan, misto:cinestary[1]).save()
                    saly[5] = new Rozmisteni(nazev:"Sál F", plan_salu: plan, misto:cinestary[2]).save()
                                                                                
                    saly[6] = new Rozmisteni(nazev:"Koncert", plan_salu: plan2, misto:cezarena).save()
                    saly[7] = new Rozmisteni(nazev:"Vystava", plan_salu: plan4, misto:dkvitkovic).save()
                    saly[8] = new Rozmisteni(nazev:"Gladiatorské zápasy", plan_salu: plan3, misto:sazkaarena).save()
                    saly[9] = new Rozmisteni(nazev:"Fotbal", plan_salu: plan4, misto:stadionskslezka).save()
                    saly[10] = new Rozmisteni(nazev:"Ples - Krasenka", plan_salu: plan3, misto:krasenka).save()
                    saly[11] = new Rozmisteni(nazev:"Ples - DK Chlebovice", plan_salu: plan3, misto:dkchlebovice).save()
                    saly[12] = new Rozmisteni(nazev:"Divadlo Opona - Cimrman ", plan_salu: plan2, misto:divadloopona).save()
                    saly[13] = new Rozmisteni(nazev:"Divadlo na Oprátce - Cimrman", plan_salu: plan2, misto:divadlonaopratce).save()
                    saly[14] = new Rozmisteni(nazev:"Zozmisteni Cimrmana", plan_salu: plan2, misto:cimrman).save()
                    saly[15] = new Rozmisteni(nazev:"Maškarní bál", plan_salu: plan3, misto:hnmytince).save()
                  
            
                      //casy+akce cinestar
                      def den = [10]
                      def d = 0
                      for ( def i=0; i<5; i++) {
                            for ( def j=0; j<2; j++) {                                           
					 def p = Calendar.getInstance()
                                         p.set(2008, 4, 7+i, 12+j*4, 0, 0)
					 p = p.getTime()
                                         den[d]=p 
                                        // println den[d]
                                         d++
                            }
                            new Akce(nazev:"Matrix 4          ", zacatek_akce:den[i+2], popis:"musíte vidět", vstupne_min:150, vstupne_max:150, odkaz:"", zpusobVyprseniRezervace:vyprseni1, rozmisteni:saly[0], kategorie:promitani, poradatel:karel).save()
                            new Akce(nazev:"Alenka za zrcadlem", zacatek_akce:den[i+3], popis:"musíte vidět", vstupne_min:50, vstupne_max:150, odkaz:"", zpusobVyprseniRezervace:vyprseni2, rozmisteni:saly[1], kategorie:promitani, poradatel:sayid).save()
                            new Akce(nazev:"Shrek 8           ", zacatek_akce:den[i*2], popis:"musíte vidět", vstupne_min:150, vstupne_max:150, odkaz:"", zpusobVyprseniRezervace:vyprseni3, rozmisteni:saly[2], kategorie:promitani, poradatel:john).save()
                            new Akce(nazev:"Life of Brian     ", zacatek_akce:den[i+1], popis:"musíte vidět", vstupne_min:70, vstupne_max:70, odkaz:"", zpusobVyprseniRezervace:vyprseni4, rozmisteni:saly[3], kategorie:promitani, poradatel:caesar).save()
                            new Akce(nazev:"Rocky 9           ", zacatek_akce:den[i], popis:"musíte vidět", vstupne_min:70, vstupne_max:70, odkaz:"", zpusobVyprseniRezervace:vyprseni5, rozmisteni:saly[4], kategorie:promitani, poradatel:karel).save()
                      }
                    
            
                      //akce
                      println "akce"
                      
                      new Akce(nazev:"Kabát", zacatek_akce:den[3], popis:"to bude jízda!", vstupne_min:300, vstupne_max:350, odkaz:"", zpusobVyprseniRezervace:vyprseni1, rozmisteni:saly[6], kategorie:koncert, poradatel:jack).save()
                      new Akce(nazev:"Kabát", zacatek_akce:den[6], popis:"to bude jízda!", vstupne_min:300, vstupne_max:350, odkaz:"", zpusobVyprseniRezervace:vyprseni1, rozmisteni:saly[6], kategorie:koncert, poradatel:jack).save()
                      new Akce(nazev:"Horkýže slíže", zacatek_akce:den[5], popis:"to su naši hoši zo Slovenska", vstupne_min:200, vstupne_max:250, odkaz:"", zpusobVyprseniRezervace:vyprseni5, rozmisteni:saly[6], kategorie:koncert, poradatel:jack).save()
                      new Akce(nazev:"Horkýže slíže", zacatek_akce:den[7], popis:"to su naši hoši zo Slovenska", vstupne_min:200, vstupne_max:250, odkaz:"", zpusobVyprseniRezervace:vyprseni5, rozmisteni:saly[6], kategorie:koncert, poradatel:jack).save()
                      
                      new Akce(nazev:"Výstava exotických zvířat", zacatek_akce:den[0], popis:"pavouk kam se podíváš", vstupne_min:20, vstupne_max:50, odkaz:"", zpusobVyprseniRezervace:vyprseni2, rozmisteni:saly[7], kategorie:vystava, poradatel:kate).save()
                      new Akce(nazev:"Výstava okrasných rostlin", zacatek_akce:den[2], popis:"květina kam se podíváš", vstupne_min:20, vstupne_max:50, odkaz:"", zpusobVyprseniRezervace:vyprseni2, rozmisteni:saly[7], kategorie:vystava, poradatel:kate).save()
                      new Akce(nazev:"Výstava okrasných rostlin", zacatek_akce:den[4], popis:"květina kam se podíváš", vstupne_min:30, vstupne_max:60, odkaz:"", zpusobVyprseniRezervace:vyprseni2, rozmisteni:saly[7], kategorie:vystava, poradatel:kate).save()
                      new Akce(nazev:"Výstava psů", zacatek_akce:den[6], popis:"Pes - nejlepší přítel člověka", vstupne_min:50, vstupne_max:70, odkaz:"", zpusobVyprseniRezervace:vyprseni2, rozmisteni:saly[7], kategorie:vystava, poradatel:jack).save()
                      new Akce(nazev:"Výstava koček", zacatek_akce:den[8], popis:"Pro upřesnění - čtyřnohých koček", vstupne_min:50, vstupne_max:70, odkaz:"", zpusobVyprseniRezervace:vyprseni2, rozmisteni:saly[7], kategorie:vystava, poradatel:james).save()
                      new Akce(nazev:"Gladiatorské zápasy", zacatek_akce:den[8], popis:"buuude booolet", vstupne_min:2000, vstupne_max:5000, odkaz:"", zpusobVyprseniRezervace:vyprseni1, rozmisteni:saly[8], kategorie:sport, poradatel:caesar).save()
                      new Akce(nazev:"Gladiatorské zápasy", zacatek_akce:den[9], popis:"buuude booolet - finále", vstupne_min:3000, vstupne_max:6000, odkaz:"", zpusobVyprseniRezervace:vyprseni1, rozmisteni:saly[8], kategorie:sport, poradatel:caesar).save()
                      
                      new Akce(nazev:"Banik-Sparta", zacatek_akce:den[1], popis:"naši hoši ukaží pražským Pepíkům, zač je toho loket", vstupne_min:200, vstupne_max:500, odkaz:"", zpusobVyprseniRezervace:vyprseni4, rozmisteni:saly[9], kategorie:sport, poradatel:sayid).save()
                      new Akce(nazev:"Banik-Slavia", zacatek_akce:den[9], popis:"naši hoši ukaží pražským Pepíkům, zač je toho loket", vstupne_min:200, vstupne_max:500, odkaz:"", zpusobVyprseniRezervace:vyprseni4, rozmisteni:saly[9], kategorie:sport, poradatel:sayid).save()
                      
                      new Akce(nazev:"Hasičský ples", zacatek_akce:den[5], popis:"Ples nejen pro všechny hasiče", vstupne_min:100, vstupne_max:100, odkaz:"", zpusobVyprseniRezervace:vyprseni1, rozmisteni:saly[10], kategorie:ples, poradatel:kwon).save()
                      new Akce(nazev:"Erotický ples", zacatek_akce:den[6], popis:"To jste ještě nezažili", vstupne_min:100, vstupne_max:100, odkaz:"", zpusobVyprseniRezervace:vyprseni1, rozmisteni:saly[11], kategorie:ples, poradatel:karel).save()
                    
                      new Akce(nazev:"Záskok", zacatek_akce:den[0], popis:"Cimrmanova hra o nešťastné premiéře hry Vlasta", vstupne_min:100, vstupne_max:100, odkaz:"", zpusobVyprseniRezervace:vyprseni1, rozmisteni:saly[13], kategorie:divadelnihra, poradatel:kwon).save()
                      new Akce(nazev:"Afrika", zacatek_akce:den[1], popis:"aneb Češi mezi lidožravci", vstupne_min:100, vstupne_max:100, odkaz:"", zpusobVyprseniRezervace:vyprseni2, rozmisteni:saly[14], kategorie:divadelnihra, poradatel:kwon).save()
                      new Akce(nazev:"Dobytí severního pólu", zacatek_akce:den[4], popis:"Čechem Karlem Němcem 5. dubna 1909 - severské drama", vstupne_min:100, vstupne_max:100, odkaz:"", zpusobVyprseniRezervace:vyprseni2, rozmisteni:saly[13], kategorie:divadelnihra, poradatel:kwon).save()
                      new Akce(nazev:"Blaník", zacatek_akce:den[3], popis:"jevištní podoba českého mýtu", vstupne_min:100, vstupne_max:100, odkaz:"", zpusobVyprseniRezervace:vyprseni2, rozmisteni:saly[14], kategorie:divadelnihra, poradatel:kwon).save()
                      new Akce(nazev:"Vyšetřování ztráty třídní knihy", zacatek_akce:den[5], popis:"činohra", vstupne_min:100, vstupne_max:100, odkaz:"", zpusobVyprseniRezervace:vyprseni2, rozmisteni:saly[12], kategorie:divadelnihra, poradatel:kwon).save()
                      new Akce(nazev:"Blaník", zacatek_akce:den[6], popis:"jevištní podoba českého mýtu", vstupne_min:100, vstupne_max:100, odkaz:"", zpusobVyprseniRezervace:vyprseni2, rozmisteni:saly[12], kategorie:divadelnihra, poradatel:kwon).save()
                      new Akce(nazev:"Vyšetřování ztráty třídní knihy", zacatek_akce:den[7], popis:"činohra", vstupne_min:100, vstupne_max:100, odkaz:"", zpusobVyprseniRezervace:vyprseni2, rozmisteni:saly[13], kategorie:divadelnihra, poradatel:kwon).save()
                    
                      new Akce(nazev:"Je tadyyyy Maska!", zacatek_akce:den[8], popis:"soutěž o nejoriginálnější masku", vstupne_min:100, vstupne_max:100, odkaz:"", zpusobVyprseniRezervace:vyprseni4, rozmisteni:saly[15], kategorie:maskarnibal, poradatel:caesar).save()
                             
                      
	/*
				 def pondeli = [4]
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
                                                         def j = 0
                                                         def h = 0
							 for ( i=0; i<7; i++) {
									j = 0
                                                                        h++
									for (p in pondeli) {
                                                                            
										 p = Calendar.getInstance()
										 p.set(2008, 4, 7+i, 10+h*2, 0, 0)
										 p = p.getTime()
                                                                                 pondeli[j]=p 
                                                                                 println pondeli[j]
										 j++
                                                                                 println j
                                                                                 println pondeli[j]
									}
									new Akce(nazev:"Matrix 4", zacatek_akce:pondeli[0], popis:"musíte vidět", vstupne_min:150, vstupne_max:150, odkaz:"", zpusobVyprseniRezervace:vyprseni1, rozmisteni:sal, kategorie:promitani, poradatel:karel).save()
									new Akce(nazev:"Alenka za zrcadlem", zacatek_akce:pondeli[0], popis:"musíte vidět", vstupne_min:50, vstupne_max:150, odkaz:"", zpusobVyprseniRezervace:vyprseni2, rozmisteni:sal, kategorie:promitani, poradatel:sayid).save()
									new Akce(nazev:"Shrek 8", zacatek_akce:pondeli[2], popis:"musíte vidět", vstupne_min:150, vstupne_max:150, odkaz:"", zpusobVyprseniRezervace:vyprseni3, rozmisteni:sal, kategorie:promitani, poradatel:john).save()
									new Akce(nazev:"Life of Brian", zacatek_akce:pondeli[3], popis:"musíte vidět", vstupne_min:70, vstupne_max:70, odkaz:"", zpusobVyprseniRezervace:vyprseni4, rozmisteni:sal, kategorie:promitani, poradatel:caesar).save()
									new Akce(nazev:"Rocky 9", zacatek_akce:pondeli[4], popis:"musíte vidět", vstupne_min:70, vstupne_max:70, odkaz:"", zpusobVyprseniRezervace:vyprseni5, rozmisteni:sal, kategorie:promitani, poradatel:karel).save()
							 }

						}
				 }*/
                                 
            
            
            
            
            
            
        } catch (Exception e) {
						print "aaa, probleeem: " + e.toString()
        }
        println "boot - hotovka"

     }
     
     def destroy = {
     }
} 