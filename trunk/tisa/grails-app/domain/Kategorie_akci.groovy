class Kategorie_akci {
    String nazev
    def hasMany = [akce:Akce]
    
    static constrains = {
        nazev(blank:false)
    }
}
