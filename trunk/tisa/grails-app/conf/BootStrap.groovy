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

				def pepa = new Uzivatel(cele_jmeno:"Pepa Novák", email:"pepa@tisa.cz", heslo:"pepa").save()
    				def honza = new Uzivatel(cele_jmeno:"Honza Hloupý", email:"honza@tisa.cz", heslo:"honza").save()
    				def karkulka = new Uzivatel(cele_jmeno:"Karkulka Červená", email:"karkulka@tisa.cz", heslo:"karkulka").save()
    				def cestmir = new Uzivatel(cele_jmeno:"Čestmír Létající", email:"cestmir@tisa.cz", heslo:"cestmir").save()
    				def gott = new Uzivatel(cele_jmeno:"Karel Gott", email:"karel@tisa.cz", heslo:"karel").save()
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
									
                                                                                def plan = "{\"0\":{\"0\":\"e\",\"1\":\"stage\",\"2\":\"stage\",\"3\":\"stage\",\"4\":\"stage\",\"5\":\"stage\",\"6\":\"stage\",\"7\":\"stage\",\"8\":\"stage\",\"9\":\"stage\",\"10\":\"stage\",\"11\":\"stage\",\"12\":\"stage\",\"13\":\"stage\",\"14\":\"stage\",\"15\":\"stage\",\"16\":\"stage\",\"17\":\"stage\",\"18\":\"stage\",\"19\":\"e\"},\"1\":{\"0\":\"e\",\"1\":\"e\",\"2\":\"e\",\"3\":\"e\",\"4\":\"e\",\"5\":\"e\",\"6\":\"e\",\"7\":\"e\",\"8\":\"e\",\"9\":\"e\",\"10\":\"e\",\"11\":\"e\",\"12\":\"e\",\"13\":\"e\",\"14\":\"e\",\"15\":\"e\",\"16\":\"e\",\"17\":\"e\",\"18\":\"e\",\"19\":\"e\"},\"2\":{\"0\":\"e\",\"1\":\"e\",\"2\":\"e\",\"3\":\"e\",\"4\":\"e\",\"5\":\"e\",\"6\":\"e\",\"7\":\"e\",\"8\":\"e\",\"9\":\"e\",\"10\":\"e\",\"11\":\"e\",\"12\":\"e\",\"13\":\"e\",\"14\":\"e\",\"15\":\"e\",\"16\":\"e\",\"17\":\"e\",\"18\":\"e\",\"19\":\"e\"},\"3\":{\"0\":\"e\",\"1\":\"e\",\"2\":\"e\",\"3\":\"e\",\"4\":\"seat\",\"5\":\"seat\",\"6\":\"seat\",\"7\":\"seat\",\"8\":\"seat\",\"9\":\"seat\",\"10\":\"seat\",\"11\":\"seat\",\"12\":\"seat\",\"13\":\"seat\",\"14\":\"seat\",\"15\":\"seat\",\"16\":\"e\",\"17\":\"e\",\"18\":\"e\",\"19\":\"e\"},\"4\":{\"0\":\"e\",\"1\":\"e\",\"2\":\"e\",\"3\":\"e\",\"4\":\"seat\",\"5\":\"seat\",\"6\":\"seat\",\"7\":\"seat\",\"8\":\"seat\",\"9\":\"seat\",\"10\":\"seat\",\"11\":\"seat\",\"12\":\"seat\",\"13\":\"seat\",\"14\":\"seat\",\"15\":\"seat\",\"16\":\"e\",\"17\":\"e\",\"18\":\"e\",\"19\":\"e\"},\"5\":{\"0\":\"e\",\"1\":\"e\",\"2\":\"e\",\"3\":\"e\",\"4\":\"seat\",\"5\":\"seat\",\"6\":\"seat\",\"7\":\"seat\",\"8\":\"seat\",\"9\":\"seat\",\"10\":\"seat\",\"11\":\"seat\",\"12\":\"seat\",\"13\":\"seat\",\"14\":\"seat\",\"15\":\"seat\",\"16\":\"e\",\"17\":\"e\",\"18\":\"e\",\"19\":\"e\"},\"6\":{\"0\":\"e\",\"1\":\"e\",\"2\":\"e\",\"3\":\"e\",\"4\":\"seat\",\"5\":\"seat\",\"6\":\"seat\",\"7\":\"seat\",\"8\":\"seat\",\"9\":\"seat\",\"10\":\"seat\",\"11\":\"seat\",\"12\":\"seat\",\"13\":\"seat\",\"14\":\"seat\",\"15\":\"seat\",\"16\":\"e\",\"17\":\"e\",\"18\":\"e\",\"19\":\"e\"},\"7\":{\"0\":\"e\",\"1\":\"e\",\"2\":\"e\",\"3\":\"e\",\"4\":\"seat\",\"5\":\"seat\",\"6\":\"seat\",\"7\":\"seat\",\"8\":\"seat\",\"9\":\"seat\",\"10\":\"seat\",\"11\":\"seat\",\"12\":\"seat\",\"13\":\"seat\",\"14\":\"seat\",\"15\":\"seat\",\"16\":\"e\",\"17\":\"e\",\"18\":\"e\",\"19\":\"e\"},\"8\":{\"0\":\"e\",\"1\":\"e\",\"2\":\"e\",\"3\":\"e\",\"4\":\"e\",\"5\":\"e\",\"6\":\"e\",\"7\":\"e\",\"8\":\"e\",\"9\":\"e\",\"10\":\"e\",\"11\":\"e\",\"12\":\"e\",\"13\":\"e\",\"14\":\"e\",\"15\":\"e\",\"16\":\"e\",\"17\":\"e\",\"18\":\"e\",\"19\":\"e\"},\"9\":{\"0\":\"door\",\"1\":\"door\",\"2\":\"e\",\"3\":\"e\",\"4\":\"seat\",\"5\":\"seat\",\"6\":\"seat\",\"7\":\"seat\",\"8\":\"seat\",\"9\":\"seat\",\"10\":\"seat\",\"11\":\"seat\",\"12\":\"seat\",\"13\":\"seat\",\"14\":\"seat\",\"15\":\"seat\",\"16\":\"e\",\"17\":\"e\",\"18\":\"door\",\"19\":\"door\"},\"10\":{\"0\":\"e\",\"1\":\"e\",\"2\":\"e\",\"3\":\"e\",\"4\":\"seat\",\"5\":\"seat\",\"6\":\"seat\",\"7\":\"seat\",\"8\":\"seat\",\"9\":\"seat\",\"10\":\"seat\",\"11\":\"seat\",\"12\":\"seat\",\"13\":\"seat\",\"14\":\"seat\",\"15\":\"seat\",\"16\":\"e\",\"17\":\"e\",\"18\":\"e\",\"19\":\"e\"},\"11\":{\"0\":\"seat\",\"1\":\"seat\",\"2\":\"seat\",\"3\":\"e\",\"4\":\"seat\",\"5\":\"seat\",\"6\":\"seat\",\"7\":\"seat\",\"8\":\"seat\",\"9\":\"seat\",\"10\":\"seat\",\"11\":\"seat\",\"12\":\"seat\",\"13\":\"seat\",\"14\":\"seat\",\"15\":\"seat\",\"16\":\"e\",\"17\":\"seat\",\"18\":\"seat\",\"19\":\"seat\"},\"12\":{\"0\":\"seat\",\"1\":\"seat\",\"2\":\"seat\",\"3\":\"e\",\"4\":\"seat\",\"5\":\"seat\",\"6\":\"seat\",\"7\":\"seat\",\"8\":\"seat\",\"9\":\"seat\",\"10\":\"seat\",\"11\":\"seat\",\"12\":\"seat\",\"13\":\"seat\",\"14\":\"seat\",\"15\":\"seat\",\"16\":\"e\",\"17\":\"seat\",\"18\":\"seat\",\"19\":\"seat\"},\"13\":{\"0\":\"e\",\"1\":\"e\",\"2\":\"e\",\"3\":\"e\",\"4\":\"e\",\"5\":\"e\",\"6\":\"e\",\"7\":\"e\",\"8\":\"e\",\"9\":\"e\",\"10\":\"e\",\"11\":\"e\",\"12\":\"e\",\"13\":\"e\",\"14\":\"e\",\"15\":\"e\",\"16\":\"e\",\"17\":\"e\",\"18\":\"e\",\"19\":\"e\"},\"14\":{\"0\":\"seat\",\"1\":\"seat\",\"2\":\"seat\",\"3\":\"e\",\"4\":\"seat\",\"5\":\"seat\",\"6\":\"seat\",\"7\":\"seat\",\"8\":\"seat\",\"9\":\"seat\",\"10\":\"seat\",\"11\":\"seat\",\"12\":\"seat\",\"13\":\"seat\",\"14\":\"seat\",\"15\":\"seat\",\"16\":\"e\",\"17\":\"seat\",\"18\":\"seat\",\"19\":\"seat\"},\"15\":{\"0\":\"seat\",\"1\":\"seat\",\"2\":\"seat\",\"3\":\"e\",\"4\":\"seat\",\"5\":\"seat\",\"6\":\"seat\",\"7\":\"seat\",\"8\":\"seat\",\"9\":\"seat\",\"10\":\"seat\",\"11\":\"seat\",\"12\":\"seat\",\"13\":\"seat\",\"14\":\"seat\",\"15\":\"seat\",\"16\":\"e\",\"17\":\"seat\",\"18\":\"seat\",\"19\":\"seat\"},\"16\":{\"0\":\"seat\",\"1\":\"seat\",\"2\":\"seat\",\"3\":\"e\",\"4\":\"seat\",\"5\":\"seat\",\"6\":\"seat\",\"7\":\"seat\",\"8\":\"seat\",\"9\":\"seat\",\"10\":\"seat\",\"11\":\"seat\",\"12\":\"seat\",\"13\":\"seat\",\"14\":\"seat\",\"15\":\"seat\",\"16\":\"e\",\"17\":\"seat\",\"18\":\"seat\",\"19\":\"seat\"},\"17\":{\"0\":\"seat\",\"1\":\"seat\",\"2\":\"seat\",\"3\":\"e\",\"4\":\"seat\",\"5\":\"seat\",\"6\":\"seat\",\"7\":\"seat\",\"8\":\"seat\",\"9\":\"seat\",\"10\":\"seat\",\"11\":\"seat\",\"12\":\"seat\",\"13\":\"seat\",\"14\":\"seat\",\"15\":\"seat\",\"16\":\"e\",\"17\":\"seat\",\"18\":\"seat\",\"19\":\"seat\"},\"18\":{\"0\":\"e\",\"1\":\"e\",\"2\":\"e\",\"3\":\"e\",\"4\":\"e\",\"5\":\"e\",\"6\":\"e\",\"7\":\"e\",\"8\":\"e\",\"9\":\"e\",\"10\":\"e\",\"11\":\"e\",\"12\":\"e\",\"13\":\"e\",\"14\":\"e\",\"15\":\"e\",\"16\":\"e\",\"17\":\"e\",\"18\":\"e\",\"19\":\"e\"},\"19\":{\"0\":\"e\",\"1\":\"e\",\"2\":\"e\",\"3\":\"e\",\"4\":\"seat\",\"5\":\"seat\",\"6\":\"seat\",\"7\":\"seat\",\"8\":\"seat\",\"9\":\"seat\",\"10\":\"seat\",\"11\":\"seat\",\"12\":\"seat\",\"13\":\"seat\",\"14\":\"seat\",\"15\":\"seat\",\"16\":\"seat\",\"17\":\"e\",\"18\":\"e\",\"19\":\"e\"}}"
                                                                                def plan2 = "{\"0\":{\"0\":\"e\",\"1\":\"e\",\"2\":\"stage\",\"3\":\"stage\",\"4\":\"stage\",\"5\":\"stage\",\"6\":\"stage\",\"7\":\"stage\",\"8\":\"stage\",\"9\":\"stage\",\"10\":\"stage\",\"11\":\"stage\",\"12\":\"stage\",\"13\":\"stage\",\"14\":\"stage\",\"15\":\"stage\",\"16\":\"stage\",\"17\":\"stage\",\"18\":\"e\",\"19\":\"e\"},\"1\":{\"0\":\"e\",\"1\":\"e\",\"2\":\"stage\",\"3\":\"stage\",\"4\":\"stage\",\"5\":\"stage\",\"6\":\"stage\",\"7\":\"stage\",\"8\":\"stage\",\"9\":\"stage\",\"10\":\"stage\",\"11\":\"stage\",\"12\":\"stage\",\"13\":\"stage\",\"14\":\"stage\",\"15\":\"stage\",\"16\":\"stage\",\"17\":\"stage\",\"18\":\"e\",\"19\":\"e\"},\"2\":{\"0\":\"e\",\"1\":\"e\",\"2\":\"stage\",\"3\":\"stage\",\"4\":\"stage\",\"5\":\"stage\",\"6\":\"stage\",\"7\":\"stage\",\"8\":\"stage\",\"9\":\"stage\",\"10\":\"stage\",\"11\":\"stage\",\"12\":\"stage\",\"13\":\"stage\",\"14\":\"stage\",\"15\":\"stage\",\"16\":\"stage\",\"17\":\"stage\",\"18\":\"e\",\"19\":\"e\"},\"3\":{\"0\":\"e\",\"1\":\"e\",\"2\":\"stage\",\"3\":\"stage\",\"4\":\"stage\",\"5\":\"stage\",\"6\":\"stage\",\"7\":\"stage\",\"8\":\"stage\",\"9\":\"stage\",\"10\":\"stage\",\"11\":\"stage\",\"12\":\"stage\",\"13\":\"stage\",\"14\":\"stage\",\"15\":\"stage\",\"16\":\"stage\",\"17\":\"stage\",\"18\":\"e\",\"19\":\"e\"},\"4\":{\"0\":\"e\",\"1\":\"e\",\"2\":\"e\",\"3\":\"e\",\"4\":\"e\",\"5\":\"e\",\"6\":\"e\",\"7\":\"e\",\"8\":\"e\",\"9\":\"e\",\"10\":\"e\",\"11\":\"e\",\"12\":\"e\",\"13\":\"e\",\"14\":\"e\",\"15\":\"e\",\"16\":\"e\",\"17\":\"e\",\"18\":\"e\",\"19\":\"e\"},\"5\":{\"0\":\"e\",\"1\":\"e\",\"2\":\"e\",\"3\":\"e\",\"4\":\"e\",\"5\":\"e\",\"6\":\"e\",\"7\":\"e\",\"8\":\"e\",\"9\":\"e\",\"10\":\"e\",\"11\":\"e\",\"12\":\"e\",\"13\":\"e\",\"14\":\"e\",\"15\":\"e\",\"16\":\"e\",\"17\":\"e\",\"18\":\"e\",\"19\":\"e\"},\"6\":{\"0\":\"e\",\"1\":\"e\",\"2\":\"seat\",\"3\":\"seat\",\"4\":\"seat\",\"5\":\"seat\",\"6\":\"seat\",\"7\":\"seat\",\"8\":\"seat\",\"9\":\"e\",\"10\":\"e\",\"11\":\"seat\",\"12\":\"seat\",\"13\":\"seat\",\"14\":\"seat\",\"15\":\"seat\",\"16\":\"seat\",\"17\":\"seat\",\"18\":\"e\",\"19\":\"e\"},\"7\":{\"0\":\"e\",\"1\":\"e\",\"2\":\"seat\",\"3\":\"seat\",\"4\":\"seat\",\"5\":\"seat\",\"6\":\"seat\",\"7\":\"seat\",\"8\":\"seat\",\"9\":\"e\",\"10\":\"e\",\"11\":\"seat\",\"12\":\"seat\",\"13\":\"seat\",\"14\":\"seat\",\"15\":\"seat\",\"16\":\"seat\",\"17\":\"seat\",\"18\":\"e\",\"19\":\"e\"},\"8\":{\"0\":\"e\",\"1\":\"e\",\"2\":\"seat\",\"3\":\"seat\",\"4\":\"seat\",\"5\":\"seat\",\"6\":\"seat\",\"7\":\"seat\",\"8\":\"seat\",\"9\":\"e\",\"10\":\"e\",\"11\":\"seat\",\"12\":\"seat\",\"13\":\"seat\",\"14\":\"seat\",\"15\":\"seat\",\"16\":\"seat\",\"17\":\"seat\",\"18\":\"e\",\"19\":\"e\"},\"9\":{\"0\":\"door\",\"1\":\"e\",\"2\":\"e\",\"3\":\"e\",\"4\":\"e\",\"5\":\"e\",\"6\":\"e\",\"7\":\"e\",\"8\":\"e\",\"9\":\"e\",\"10\":\"e\",\"11\":\"e\",\"12\":\"e\",\"13\":\"e\",\"14\":\"e\",\"15\":\"e\",\"16\":\"e\",\"17\":\"e\",\"18\":\"e\",\"19\":\"door\"},\"10\":{\"0\":\"e\",\"1\":\"e\",\"2\":\"seat\",\"3\":\"seat\",\"4\":\"seat\",\"5\":\"seat\",\"6\":\"seat\",\"7\":\"seat\",\"8\":\"seat\",\"9\":\"e\",\"10\":\"e\",\"11\":\"seat\",\"12\":\"seat\",\"13\":\"seat\",\"14\":\"seat\",\"15\":\"seat\",\"16\":\"seat\",\"17\":\"seat\",\"18\":\"e\",\"19\":\"e\"},\"11\":{\"0\":\"e\",\"1\":\"e\",\"2\":\"seat\",\"3\":\"seat\",\"4\":\"seat\",\"5\":\"seat\",\"6\":\"seat\",\"7\":\"seat\",\"8\":\"seat\",\"9\":\"e\",\"10\":\"e\",\"11\":\"seat\",\"12\":\"seat\",\"13\":\"seat\",\"14\":\"seat\",\"15\":\"seat\",\"16\":\"seat\",\"17\":\"seat\",\"18\":\"e\",\"19\":\"e\"},\"12\":{\"0\":\"e\",\"1\":\"e\",\"2\":\"seat\",\"3\":\"seat\",\"4\":\"seat\",\"5\":\"seat\",\"6\":\"seat\",\"7\":\"seat\",\"8\":\"seat\",\"9\":\"e\",\"10\":\"e\",\"11\":\"seat\",\"12\":\"seat\",\"13\":\"seat\",\"14\":\"seat\",\"15\":\"seat\",\"16\":\"seat\",\"17\":\"seat\",\"18\":\"e\",\"19\":\"e\"},\"13\":{\"0\":\"e\",\"1\":\"e\",\"2\":\"seat\",\"3\":\"seat\",\"4\":\"seat\",\"5\":\"seat\",\"6\":\"seat\",\"7\":\"seat\",\"8\":\"seat\",\"9\":\"e\",\"10\":\"e\",\"11\":\"seat\",\"12\":\"seat\",\"13\":\"seat\",\"14\":\"seat\",\"15\":\"seat\",\"16\":\"seat\",\"17\":\"seat\",\"18\":\"e\",\"19\":\"e\"},\"14\":{\"0\":\"e\",\"1\":\"e\",\"2\":\"seat\",\"3\":\"seat\",\"4\":\"seat\",\"5\":\"seat\",\"6\":\"seat\",\"7\":\"seat\",\"8\":\"seat\",\"9\":\"e\",\"10\":\"e\",\"11\":\"seat\",\"12\":\"seat\",\"13\":\"seat\",\"14\":\"seat\",\"15\":\"seat\",\"16\":\"seat\",\"17\":\"seat\",\"18\":\"e\",\"19\":\"e\"},\"15\":{\"0\":\"door\",\"1\":\"e\",\"2\":\"e\",\"3\":\"e\",\"4\":\"e\",\"5\":\"e\",\"6\":\"e\",\"7\":\"e\",\"8\":\"e\",\"9\":\"e\",\"10\":\"e\",\"11\":\"e\",\"12\":\"e\",\"13\":\"e\",\"14\":\"e\",\"15\":\"e\",\"16\":\"e\",\"17\":\"e\",\"18\":\"e\",\"19\":\"door\"},\"16\":{\"0\":\"e\",\"1\":\"e\",\"2\":\"seat\",\"3\":\"seat\",\"4\":\"seat\",\"5\":\"seat\",\"6\":\"seat\",\"7\":\"seat\",\"8\":\"seat\",\"9\":\"e\",\"10\":\"e\",\"11\":\"seat\",\"12\":\"seat\",\"13\":\"seat\",\"14\":\"seat\",\"15\":\"seat\",\"16\":\"seat\",\"17\":\"seat\",\"18\":\"e\",\"19\":\"e\"},\"17\":{\"0\":\"e\",\"1\":\"e\",\"2\":\"seat\",\"3\":\"seat\",\"4\":\"seat\",\"5\":\"seat\",\"6\":\"seat\",\"7\":\"seat\",\"8\":\"seat\",\"9\":\"e\",\"10\":\"e\",\"11\":\"seat\",\"12\":\"seat\",\"13\":\"seat\",\"14\":\"seat\",\"15\":\"seat\",\"16\":\"seat\",\"17\":\"seat\",\"18\":\"e\",\"19\":\"e\"},\"18\":{\"0\":\"e\",\"1\":\"e\",\"2\":\"seat\",\"3\":\"seat\",\"4\":\"seat\",\"5\":\"seat\",\"6\":\"seat\",\"7\":\"seat\",\"8\":\"seat\",\"9\":\"e\",\"10\":\"e\",\"11\":\"seat\",\"12\":\"seat\",\"13\":\"seat\",\"14\":\"seat\",\"15\":\"seat\",\"16\":\"seat\",\"17\":\"seat\",\"18\":\"e\",\"19\":\"e\"},\"19\":{\"0\":\"e\",\"1\":\"e\",\"2\":\"e\",\"3\":\"e\",\"4\":\"e\",\"5\":\"e\",\"6\":\"e\",\"7\":\"e\",\"8\":\"e\",\"9\":\"door\",\"10\":\"door\",\"11\":\"e\",\"12\":\"e\",\"13\":\"e\",\"14\":\"e\",\"15\":\"e\",\"16\":\"e\",\"17\":\"e\",\"18\":\"e\",\"19\":\"e\"}}"
                                                                                def plan3 = "{\"0\":{\"0\":\"seat\",\"1\":\"seat\",\"2\":\"seat\",\"3\":\"seat\",\"4\":\"seat\",\"5\":\"seat\",\"6\":\"seat\",\"7\":\"door\",\"8\":\"seat\",\"9\":\"seat\",\"10\":\"seat\",\"11\":\"seat\",\"12\":\"seat\",\"13\":\"seat\",\"14\":\"seat\"},\"1\":{\"0\":\"seat\",\"1\":\"seat\",\"2\":\"seat\",\"3\":\"seat\",\"4\":\"seat\",\"5\":\"seat\",\"6\":\"seat\",\"7\":\"e\",\"8\":\"seat\",\"9\":\"seat\",\"10\":\"seat\",\"11\":\"seat\",\"12\":\"seat\",\"13\":\"seat\",\"14\":\"seat\"},\"2\":{\"0\":\"seat\",\"1\":\"seat\",\"2\":\"seat\",\"3\":\"seat\",\"4\":\"seat\",\"5\":\"seat\",\"6\":\"seat\",\"7\":\"e\",\"8\":\"seat\",\"9\":\"seat\",\"10\":\"seat\",\"11\":\"seat\",\"12\":\"seat\",\"13\":\"seat\",\"14\":\"seat\"},\"3\":{\"0\":\"seat\",\"1\":\"seat\",\"2\":\"seat\",\"3\":\"e\",\"4\":\"e\",\"5\":\"e\",\"6\":\"e\",\"7\":\"e\",\"8\":\"e\",\"9\":\"e\",\"10\":\"e\",\"11\":\"e\",\"12\":\"seat\",\"13\":\"seat\",\"14\":\"seat\"},\"4\":{\"0\":\"seat\",\"1\":\"seat\",\"2\":\"seat\",\"3\":\"e\",\"4\":\"stage\",\"5\":\"stage\",\"6\":\"stage\",\"7\":\"stage\",\"8\":\"stage\",\"9\":\"stage\",\"10\":\"stage\",\"11\":\"e\",\"12\":\"seat\",\"13\":\"seat\",\"14\":\"seat\"},\"5\":{\"0\":\"seat\",\"1\":\"seat\",\"2\":\"seat\",\"3\":\"e\",\"4\":\"stage\",\"5\":\"stage\",\"6\":\"stage\",\"7\":\"stage\",\"8\":\"stage\",\"9\":\"stage\",\"10\":\"stage\",\"11\":\"e\",\"12\":\"seat\",\"13\":\"seat\",\"14\":\"seat\"},\"6\":{\"0\":\"seat\",\"1\":\"seat\",\"2\":\"seat\",\"3\":\"e\",\"4\":\"stage\",\"5\":\"stage\",\"6\":\"stage\",\"7\":\"stage\",\"8\":\"stage\",\"9\":\"stage\",\"10\":\"stage\",\"11\":\"e\",\"12\":\"seat\",\"13\":\"seat\",\"14\":\"seat\"},\"7\":{\"0\":\"door\",\"1\":\"e\",\"2\":\"e\",\"3\":\"e\",\"4\":\"stage\",\"5\":\"stage\",\"6\":\"stage\",\"7\":\"stage\",\"8\":\"stage\",\"9\":\"stage\",\"10\":\"stage\",\"11\":\"e\",\"12\":\"e\",\"13\":\"e\",\"14\":\"door\"},\"8\":{\"0\":\"seat\",\"1\":\"seat\",\"2\":\"seat\",\"3\":\"e\",\"4\":\"stage\",\"5\":\"stage\",\"6\":\"stage\",\"7\":\"stage\",\"8\":\"stage\",\"9\":\"stage\",\"10\":\"stage\",\"11\":\"e\",\"12\":\"seat\",\"13\":\"seat\",\"14\":\"seat\"},\"9\":{\"0\":\"seat\",\"1\":\"seat\",\"2\":\"seat\",\"3\":\"e\",\"4\":\"stage\",\"5\":\"stage\",\"6\":\"stage\",\"7\":\"stage\",\"8\":\"stage\",\"9\":\"stage\",\"10\":\"stage\",\"11\":\"e\",\"12\":\"seat\",\"13\":\"seat\",\"14\":\"seat\"},\"10\":{\"0\":\"seat\",\"1\":\"seat\",\"2\":\"seat\",\"3\":\"e\",\"4\":\"stage\",\"5\":\"stage\",\"6\":\"stage\",\"7\":\"stage\",\"8\":\"stage\",\"9\":\"stage\",\"10\":\"stage\",\"11\":\"e\",\"12\":\"seat\",\"13\":\"seat\",\"14\":\"seat\"},\"11\":{\"0\":\"seat\",\"1\":\"seat\",\"2\":\"seat\",\"3\":\"e\",\"4\":\"e\",\"5\":\"e\",\"6\":\"e\",\"7\":\"e\",\"8\":\"e\",\"9\":\"e\",\"10\":\"e\",\"11\":\"e\",\"12\":\"seat\",\"13\":\"seat\",\"14\":\"seat\"},\"12\":{\"0\":\"seat\",\"1\":\"seat\",\"2\":\"seat\",\"3\":\"seat\",\"4\":\"seat\",\"5\":\"seat\",\"6\":\"seat\",\"7\":\"e\",\"8\":\"seat\",\"9\":\"seat\",\"10\":\"seat\",\"11\":\"seat\",\"12\":\"seat\",\"13\":\"seat\",\"14\":\"seat\"},\"13\":{\"0\":\"seat\",\"1\":\"seat\",\"2\":\"seat\",\"3\":\"seat\",\"4\":\"seat\",\"5\":\"seat\",\"6\":\"seat\",\"7\":\"e\",\"8\":\"seat\",\"9\":\"seat\",\"10\":\"seat\",\"11\":\"seat\",\"12\":\"seat\",\"13\":\"seat\",\"14\":\"seat\"},\"14\":{\"0\":\"seat\",\"1\":\"seat\",\"2\":\"seat\",\"3\":\"seat\",\"4\":\"seat\",\"5\":\"seat\",\"6\":\"seat\",\"7\":\"door\",\"8\":\"seat\",\"9\":\"seat\",\"10\":\"seat\",\"11\":\"seat\",\"12\":\"seat\",\"13\":\"seat\",\"14\":\"seat\"}}"
                                                                                def plan4 = "{\"0\":{\"0\":\"e\",\"1\":\"e\",\"2\":\"seat\",\"3\":\"seat\",\"4\":\"seat\",\"5\":\"seat\",\"6\":\"seat\",\"7\":\"seat\",\"8\":\"seat\",\"9\":\"seat\",\"10\":\"seat\",\"11\":\"seat\",\"12\":\"seat\",\"13\":\"seat\",\"14\":\"door\",\"15\":\"door\",\"16\":\"seat\",\"17\":\"seat\",\"18\":\"seat\",\"19\":\"seat\"},\"1\":{\"0\":\"e\",\"1\":\"seat\",\"2\":\"seat\",\"3\":\"seat\",\"4\":\"seat\",\"5\":\"seat\",\"6\":\"seat\",\"7\":\"seat\",\"8\":\"seat\",\"9\":\"seat\",\"10\":\"seat\",\"11\":\"seat\",\"12\":\"seat\",\"13\":\"seat\",\"14\":\"e\",\"15\":\"e\",\"16\":\"seat\",\"17\":\"seat\",\"18\":\"seat\",\"19\":\"seat\"},\"2\":{\"0\":\"seat\",\"1\":\"seat\",\"2\":\"seat\",\"3\":\"seat\",\"4\":\"seat\",\"5\":\"seat\",\"6\":\"seat\",\"7\":\"seat\",\"8\":\"seat\",\"9\":\"seat\",\"10\":\"seat\",\"11\":\"seat\",\"12\":\"seat\",\"13\":\"seat\",\"14\":\"e\",\"15\":\"e\",\"16\":\"seat\",\"17\":\"seat\",\"18\":\"seat\",\"19\":\"seat\"},\"3\":{\"0\":\"seat\",\"1\":\"seat\",\"2\":\"seat\",\"3\":\"seat\",\"4\":\"e\",\"5\":\"e\",\"6\":\"e\",\"7\":\"e\",\"8\":\"e\",\"9\":\"e\",\"10\":\"e\",\"11\":\"e\",\"12\":\"e\",\"13\":\"e\",\"14\":\"e\",\"15\":\"e\",\"16\":\"e\",\"17\":\"e\",\"18\":\"e\",\"19\":\"e\"},\"4\":{\"0\":\"seat\",\"1\":\"seat\",\"2\":\"seat\",\"3\":\"e\",\"4\":\"e\",\"5\":\"stage\",\"6\":\"stage\",\"7\":\"stage\",\"8\":\"stage\",\"9\":\"stage\",\"10\":\"stage\",\"11\":\"stage\",\"12\":\"stage\",\"13\":\"stage\",\"14\":\"stage\",\"15\":\"stage\",\"16\":\"stage\",\"17\":\"stage\",\"18\":\"stage\",\"19\":\"stage\"},\"5\":{\"0\":\"seat\",\"1\":\"seat\",\"2\":\"seat\",\"3\":\"e\",\"4\":\"stage\",\"5\":\"stage\",\"6\":\"stage\",\"7\":\"stage\",\"8\":\"stage\",\"9\":\"stage\",\"10\":\"stage\",\"11\":\"stage\",\"12\":\"stage\",\"13\":\"stage\",\"14\":\"stage\",\"15\":\"stage\",\"16\":\"stage\",\"17\":\"stage\",\"18\":\"stage\",\"19\":\"stage\"},\"6\":{\"0\":\"seat\",\"1\":\"seat\",\"2\":\"seat\",\"3\":\"e\",\"4\":\"stage\",\"5\":\"stage\",\"6\":\"stage\",\"7\":\"stage\",\"8\":\"stage\",\"9\":\"stage\",\"10\":\"stage\",\"11\":\"stage\",\"12\":\"stage\",\"13\":\"stage\",\"14\":\"stage\",\"15\":\"stage\",\"16\":\"stage\",\"17\":\"stage\",\"18\":\"stage\",\"19\":\"stage\"},\"7\":{\"0\":\"seat\",\"1\":\"seat\",\"2\":\"seat\",\"3\":\"e\",\"4\":\"stage\",\"5\":\"stage\",\"6\":\"stage\",\"7\":\"stage\",\"8\":\"stage\",\"9\":\"stage\",\"10\":\"stage\",\"11\":\"stage\",\"12\":\"stage\",\"13\":\"stage\",\"14\":\"stage\",\"15\":\"stage\",\"16\":\"stage\",\"17\":\"stage\",\"18\":\"stage\",\"19\":\"stage\"},\"8\":{\"0\":\"seat\",\"1\":\"seat\",\"2\":\"seat\",\"3\":\"e\",\"4\":\"stage\",\"5\":\"stage\",\"6\":\"stage\",\"7\":\"stage\",\"8\":\"stage\",\"9\":\"stage\",\"10\":\"stage\",\"11\":\"stage\",\"12\":\"stage\",\"13\":\"stage\",\"14\":\"stage\",\"15\":\"stage\",\"16\":\"stage\",\"17\":\"stage\",\"18\":\"stage\",\"19\":\"stage\"},\"9\":{\"0\":\"seat\",\"1\":\"seat\",\"2\":\"seat\",\"3\":\"e\",\"4\":\"stage\",\"5\":\"stage\",\"6\":\"stage\",\"7\":\"stage\",\"8\":\"stage\",\"9\":\"stage\",\"10\":\"stage\",\"11\":\"stage\",\"12\":\"stage\",\"13\":\"stage\",\"14\":\"stage\",\"15\":\"stage\",\"16\":\"stage\",\"17\":\"stage\",\"18\":\"stage\",\"19\":\"stage\"},\"10\":{\"0\":\"seat\",\"1\":\"seat\",\"2\":\"seat\",\"3\":\"e\",\"4\":\"stage\",\"5\":\"stage\",\"6\":\"stage\",\"7\":\"stage\",\"8\":\"stage\",\"9\":\"stage\",\"10\":\"stage\",\"11\":\"stage\",\"12\":\"stage\",\"13\":\"stage\",\"14\":\"stage\",\"15\":\"stage\",\"16\":\"stage\",\"17\":\"stage\",\"18\":\"stage\",\"19\":\"stage\"},\"11\":{\"0\":\"seat\",\"1\":\"seat\",\"2\":\"seat\",\"3\":\"e\",\"4\":\"stage\",\"5\":\"stage\",\"6\":\"stage\",\"7\":\"stage\",\"8\":\"stage\",\"9\":\"stage\",\"10\":\"stage\",\"11\":\"stage\",\"12\":\"stage\",\"13\":\"stage\",\"14\":\"stage\",\"15\":\"stage\",\"16\":\"stage\",\"17\":\"stage\",\"18\":\"stage\",\"19\":\"stage\"},\"12\":{\"0\":\"seat\",\"1\":\"seat\",\"2\":\"seat\",\"3\":\"e\",\"4\":\"stage\",\"5\":\"stage\",\"6\":\"stage\",\"7\":\"stage\",\"8\":\"stage\",\"9\":\"stage\",\"10\":\"stage\",\"11\":\"stage\",\"12\":\"stage\",\"13\":\"stage\",\"14\":\"stage\",\"15\":\"stage\",\"16\":\"stage\",\"17\":\"stage\",\"18\":\"stage\",\"19\":\"stage\"},\"13\":{\"0\":\"seat\",\"1\":\"seat\",\"2\":\"seat\",\"3\":\"e\",\"4\":\"stage\",\"5\":\"stage\",\"6\":\"stage\",\"7\":\"stage\",\"8\":\"stage\",\"9\":\"stage\",\"10\":\"stage\",\"11\":\"stage\",\"12\":\"stage\",\"13\":\"stage\",\"14\":\"stage\",\"15\":\"stage\",\"16\":\"stage\",\"17\":\"stage\",\"18\":\"stage\",\"19\":\"stage\"},\"14\":{\"0\":\"seat\",\"1\":\"seat\",\"2\":\"seat\",\"3\":\"e\",\"4\":\"stage\",\"5\":\"stage\",\"6\":\"stage\",\"7\":\"stage\",\"8\":\"stage\",\"9\":\"stage\",\"10\":\"stage\",\"11\":\"stage\",\"12\":\"stage\",\"13\":\"stage\",\"14\":\"stage\",\"15\":\"stage\",\"16\":\"stage\",\"17\":\"stage\",\"18\":\"stage\",\"19\":\"stage\"},\"15\":{\"0\":\"seat\",\"1\":\"seat\",\"2\":\"seat\",\"3\":\"e\",\"4\":\"e\",\"5\":\"stage\",\"6\":\"stage\",\"7\":\"stage\",\"8\":\"stage\",\"9\":\"stage\",\"10\":\"stage\",\"11\":\"stage\",\"12\":\"stage\",\"13\":\"stage\",\"14\":\"stage\",\"15\":\"stage\",\"16\":\"stage\",\"17\":\"stage\",\"18\":\"stage\",\"19\":\"stage\"},\"16\":{\"0\":\"seat\",\"1\":\"seat\",\"2\":\"seat\",\"3\":\"seat\",\"4\":\"e\",\"5\":\"e\",\"6\":\"e\",\"7\":\"e\",\"8\":\"e\",\"9\":\"e\",\"10\":\"e\",\"11\":\"e\",\"12\":\"e\",\"13\":\"e\",\"14\":\"e\",\"15\":\"e\",\"16\":\"e\",\"17\":\"e\",\"18\":\"e\",\"19\":\"e\"},\"17\":{\"0\":\"seat\",\"1\":\"seat\",\"2\":\"seat\",\"3\":\"seat\",\"4\":\"seat\",\"5\":\"seat\",\"6\":\"seat\",\"7\":\"seat\",\"8\":\"seat\",\"9\":\"seat\",\"10\":\"seat\",\"11\":\"seat\",\"12\":\"seat\",\"13\":\"seat\",\"14\":\"e\",\"15\":\"e\",\"16\":\"seat\",\"17\":\"seat\",\"18\":\"seat\",\"19\":\"seat\"},\"18\":{\"0\":\"e\",\"1\":\"seat\",\"2\":\"seat\",\"3\":\"seat\",\"4\":\"seat\",\"5\":\"seat\",\"6\":\"seat\",\"7\":\"seat\",\"8\":\"seat\",\"9\":\"seat\",\"10\":\"seat\",\"11\":\"seat\",\"12\":\"seat\",\"13\":\"seat\",\"14\":\"e\",\"15\":\"e\",\"16\":\"seat\",\"17\":\"seat\",\"18\":\"seat\",\"19\":\"seat\"},\"19\":{\"0\":\"e\",\"1\":\"e\",\"2\":\"seat\",\"3\":\"seat\",\"4\":\"seat\",\"5\":\"seat\",\"6\":\"seat\",\"7\":\"seat\",\"8\":\"seat\",\"9\":\"seat\",\"10\":\"seat\",\"11\":\"seat\",\"12\":\"seat\",\"13\":\"seat\",\"14\":\"door\",\"15\":\"door\",\"16\":\"seat\",\"17\":\"seat\",\"18\":\"seat\",\"19\":\"seat\"}}"
                                                                                
                                
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
                    
                      def cervena = new Akce(nazev:"Červená Karkulka", zacatek_akce:den[3], popis:"tentokrát ještě červenější (horor)", vstupne_min:70, vstupne_max:70, odkaz:"", zpusobVyprseniRezervace:vyprseni5, rozmisteni:saly[5], kategorie:promitani, poradatel:john).save()
                      //akce
                      println "akce"
                      
                      def kabat = new Akce(nazev:"Kabát", zacatek_akce:den[3], popis:"to bude jízda!", vstupne_min:300, vstupne_max:350, odkaz:"", zpusobVyprseniRezervace:vyprseni1, rozmisteni:saly[6], kategorie:koncert, poradatel:jack).save()
                      new Akce(nazev:"Kabát", zacatek_akce:den[6], popis:"to bude jízda!", vstupne_min:300, vstupne_max:350, odkaz:"", zpusobVyprseniRezervace:vyprseni1, rozmisteni:saly[6], kategorie:koncert, poradatel:jack).save()
                      new Akce(nazev:"Horkýže slíže", zacatek_akce:den[5], popis:"to su naši hoši zo Slovenska", vstupne_min:200, vstupne_max:250, odkaz:"", zpusobVyprseniRezervace:vyprseni5, rozmisteni:saly[6], kategorie:koncert, poradatel:jack).save()
                      new Akce(nazev:"Horkýže slíže", zacatek_akce:den[7], popis:"to su naši hoši zo Slovenska", vstupne_min:200, vstupne_max:250, odkaz:"", zpusobVyprseniRezervace:vyprseni5, rozmisteni:saly[6], kategorie:koncert, poradatel:jack).save()
                      
                      def exotic = new Akce(nazev:"Výstava exotických zvířat", zacatek_akce:den[0], popis:"pavouk kam se podíváš", vstupne_min:20, vstupne_max:50, odkaz:"", zpusobVyprseniRezervace:vyprseni2, rozmisteni:saly[7], kategorie:vystava, poradatel:kate).save()
                      new Akce(nazev:"Výstava okrasných rostlin", zacatek_akce:den[2], popis:"květina kam se podíváš", vstupne_min:20, vstupne_max:50, odkaz:"", zpusobVyprseniRezervace:vyprseni2, rozmisteni:saly[7], kategorie:vystava, poradatel:kate).save()
                      new Akce(nazev:"Výstava okrasných rostlin", zacatek_akce:den[4], popis:"květina kam se podíváš", vstupne_min:30, vstupne_max:60, odkaz:"", zpusobVyprseniRezervace:vyprseni2, rozmisteni:saly[7], kategorie:vystava, poradatel:kate).save()
                      new Akce(nazev:"Výstava psů", zacatek_akce:den[6], popis:"Pes - nejlepší přítel člověka", vstupne_min:50, vstupne_max:70, odkaz:"", zpusobVyprseniRezervace:vyprseni2, rozmisteni:saly[7], kategorie:vystava, poradatel:jack).save()
                      new Akce(nazev:"Výstava koček", zacatek_akce:den[8], popis:"Pro upřesnění - čtyřnohých koček", vstupne_min:50, vstupne_max:70, odkaz:"", zpusobVyprseniRezervace:vyprseni2, rozmisteni:saly[7], kategorie:vystava, poradatel:james).save()
                      new Akce(nazev:"Gladiatorské zápasy", zacatek_akce:den[8], popis:"buuude booolet", vstupne_min:2000, vstupne_max:5000, odkaz:"", zpusobVyprseniRezervace:vyprseni1, rozmisteni:saly[8], kategorie:sport, poradatel:caesar).save()
                      new Akce(nazev:"Gladiatorské zápasy", zacatek_akce:den[9], popis:"buuude booolet - finále", vstupne_min:3000, vstupne_max:6000, odkaz:"", zpusobVyprseniRezervace:vyprseni1, rozmisteni:saly[8], kategorie:sport, poradatel:caesar).save()
                      
                      def sparta = new Akce(nazev:"Banik-Sparta", zacatek_akce:den[1], popis:"naši hoši ukaží pražským Pepíkům, zač je toho loket", vstupne_min:200, vstupne_max:500, odkaz:"", zpusobVyprseniRezervace:vyprseni4, rozmisteni:saly[9], kategorie:sport, poradatel:sayid).save()
                      new Akce(nazev:"Banik-Slavia", zacatek_akce:den[9], popis:"naši hoši ukaží pražským Pepíkům, zač je toho loket", vstupne_min:200, vstupne_max:500, odkaz:"", zpusobVyprseniRezervace:vyprseni4, rozmisteni:saly[9], kategorie:sport, poradatel:sayid).save()
                      
                      new Akce(nazev:"Hasičský ples", zacatek_akce:den[5], popis:"Ples nejen pro všechny hasiče", vstupne_min:100, vstupne_max:100, odkaz:"", zpusobVyprseniRezervace:vyprseni1, rozmisteni:saly[10], kategorie:ples, poradatel:kwon).save()
                      def erotic = new Akce(nazev:"Erotický ples", zacatek_akce:den[6], popis:"To jste ještě nezažili", vstupne_min:100, vstupne_max:100, odkaz:"", zpusobVyprseniRezervace:vyprseni1, rozmisteni:saly[11], kategorie:ples, poradatel:karel).save()
                    
                      def zaskok = new Akce(nazev:"Záskok", zacatek_akce:den[0], popis:"Cimrmanova hra o nešťastné premiéře hry Vlasta", vstupne_min:100, vstupne_max:100, odkaz:"", zpusobVyprseniRezervace:vyprseni1, rozmisteni:saly[13], kategorie:divadelnihra, poradatel:kwon).save()
                      def afrika = new Akce(nazev:"Afrika", zacatek_akce:den[1], popis:"aneb Češi mezi lidožravci", vstupne_min:100, vstupne_max:100, odkaz:"", zpusobVyprseniRezervace:vyprseni2, rozmisteni:saly[14], kategorie:divadelnihra, poradatel:kwon).save()
                      new Akce(nazev:"Dobytí severního pólu", zacatek_akce:den[4], popis:"Čechem Karlem Němcem 5. dubna 1909 - severské drama", vstupne_min:100, vstupne_max:100, odkaz:"", zpusobVyprseniRezervace:vyprseni2, rozmisteni:saly[13], kategorie:divadelnihra, poradatel:kwon).save()
                      new Akce(nazev:"Blaník", zacatek_akce:den[3], popis:"jevištní podoba českého mýtu", vstupne_min:100, vstupne_max:100, odkaz:"", zpusobVyprseniRezervace:vyprseni2, rozmisteni:saly[14], kategorie:divadelnihra, poradatel:kwon).save()
                      new Akce(nazev:"Vyšetřování ztráty třídní knihy", zacatek_akce:den[5], popis:"činohra", vstupne_min:100, vstupne_max:100, odkaz:"", zpusobVyprseniRezervace:vyprseni2, rozmisteni:saly[12], kategorie:divadelnihra, poradatel:kwon).save()
                      new Akce(nazev:"Blaník", zacatek_akce:den[6], popis:"jevištní podoba českého mýtu", vstupne_min:100, vstupne_max:100, odkaz:"", zpusobVyprseniRezervace:vyprseni2, rozmisteni:saly[12], kategorie:divadelnihra, poradatel:kwon).save()
                      new Akce(nazev:"Vyšetřování ztráty třídní knihy", zacatek_akce:den[7], popis:"činohra", vstupne_min:100, vstupne_max:100, odkaz:"", zpusobVyprseniRezervace:vyprseni2, rozmisteni:saly[13], kategorie:divadelnihra, poradatel:kwon).save()
                    
                      new Akce(nazev:"Je tadyyyy Maska!", zacatek_akce:den[8], popis:"soutěž o nejoriginálnější masku", vstupne_min:100, vstupne_max:100, odkaz:"", zpusobVyprseniRezervace:vyprseni4, rozmisteni:saly[15], kategorie:maskarnibal, poradatel:caesar).save()
                             
            //rezervace
            println "rezervace"   
            
	new Rezervace(akce:exotic, uzivatel: pepa, mista:"1_8 4_6", prodano: false, mista_count:2).save()                             
        new Rezervace(akce:cervena, uzivatel: honza, mista:"2_2 2_8", prodano: false, mista_count:2).save()                             
        new Rezervace(akce:kabat, uzivatel: cestmir, mista:"1_4", prodano: false, mista_count:1).save()                              
        new Rezervace(akce:exotic, uzivatel: karkulka, mista:"2_8", prodano: false, mista_count:1).save()                              
        new Rezervace(akce:cervena, uzivatel: gott, mista:"3_4", prodano: true, mista_count:1).save()                               
        new Rezervace(akce:kabat, uzivatel: gott, mista:"3_6", prodano: true, mista_count:1).save()                               
        new Rezervace(akce:cervena, uzivatel: pepa, mista:"6_7 7_4", prodano: false, mista_count:2).save()                             
        new Rezervace(akce:zaskok, uzivatel: honza, mista:"4_2 2_1", prodano: false, mista_count:2).save()                             
        new Rezervace(akce:kabat, uzivatel: cestmir, mista:"3_3", prodano: false, mista_count:1).save()                              
        new Rezervace(akce:sparta, uzivatel: karkulka, mista:"4_3", prodano: false, mista_count:1).save()                              
        new Rezervace(akce:sparta, uzivatel: gott, mista:"3_6", prodano: true, mista_count:1).save()                               
        new Rezervace(akce:erotic, uzivatel: gott, mista:"6_9", prodano: true, mista_count:1).save()                               
        new Rezervace(akce:afrika, uzivatel: gott, mista:"1_1", prodano: true, mista_count:1).save()                               
        
        
             
            
        } catch (Exception e) {
						print "aaa, probleeem: " + e.toString()
        }
        println "boot - hotovka"

     }
     
     def destroy = {
     }
} 