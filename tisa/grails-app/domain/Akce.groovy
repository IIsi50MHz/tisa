class Akce {
    String nazev
    Date zacatek_akce = new Date()
    String popis = ""
    Integer vstupne_min = 0
    Integer vstupne_max = 0
    String odkaz = ""
    def belongsTo = [ZpusobVyprseniRezervace, Rozmisteni, Poradatel, KategorieAkci, Misto]
    Rozmisteni rozmisteni
    ZpusobVyprseniRezervace zpusobVyprseniRezervace
    Poradatel poradatel
    KategorieAkci kategorie
	
    def hasMany = [rezervace:Rezervace]
        
    static constrains = {
        nazev()
        zacatek_akce()
        popis(widget:"textarea",blank:false)
        vstupne_min()
        vstupne_max()
        odkaz()
        zpusob_vyprseni(blank:false)
        poradatel()
        kategorie()
    }
    
    
		String toString() {
        return this.zacatek_akce.toString() + " " +this.rozmisteni.misto.toString() + " " + this.nazev
    }
    
}


/*

class Akce {
    String nazev
    Date zacatek_akce = new Date()
    String popis = ""
    Integer vstupne_min = 0
    Integer vstupne_max = 0
    String odkaz = ""
    def belongsTo = [ZpusobVyprseniRezervace, Rozmisteni, Poradatel, KategorieAkci]
    Rozmisteni rozmisteni
    ZpusobVyprseniRezervace zpusobVyprseniRezervace
    Poradatel poradatel
    KategorieAkci kategorie
		
    def hasMany = [rezervace:Rezervace]
        
    static constrains = {
        nazev()
        zacatek_akce()
        popis(widget:"textarea",blank:false)
        vstupne_min()
        vstupne_max()
        odkaz(blank:false)
        misto(blank:false)
        zpusob_vyprseni(blank:false)
        poradatel()
        kategorie()
    }
}


*/