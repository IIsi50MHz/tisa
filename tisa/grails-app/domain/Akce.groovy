class Akce {
    String nazev
    Date zacatek_akce = new Date()
    String popis = ""
    Integer vstupne_min = 0
    Integer vstupne_max = 0
    String odkaz = ""
    def belongsTo = [Zpusob_vyprseni_rezervace, Rozmisteni]
    Rozmisteni rozmisteni
    Zpusob_vyprseni_rezervace zpusob_vyprseni_rezervace
		
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
    }
}
