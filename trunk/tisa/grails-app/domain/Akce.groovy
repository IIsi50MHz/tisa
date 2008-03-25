class Akce {
    String nazev
    Date zacatek_akce
    String popis
    Integer vstupne_min
    Integer vstupne_max
    String odkaz
    def belongsTo = [Misto, Zpusob_vyprseni_rezervace, Rozmisteni]
    Misto misto
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