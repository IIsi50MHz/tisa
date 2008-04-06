class Kategorie_mist {
    String nazev
    def belongsTo = Misto
    Misto misto
    
    static constrains = {
        nazev(blank:false)
    }
}
