class Kategorie_akci {
    String nazev
    def belongsTo = Akce
    Akce akce
    
    static constrains = {
        nazev(blank:false)
    }
}
