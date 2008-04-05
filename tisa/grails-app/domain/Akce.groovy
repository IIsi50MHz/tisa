class Akce {
    String nazev
    Date zacatek_akce = new Date()
    String popis = ""
    Integer vstupne_min = 0
    Integer vstupne_max = 0
    String odkaz = ""
    def belongsTo = [ZpusobVyprseniRezervace, Rozmisteni, Poradatel]
    Rozmisteni rozmisteni
    ZpusobVyprseniRezervace zpusobVyprseniRezervace
    Poradatel poradatel
		
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
    }
}
