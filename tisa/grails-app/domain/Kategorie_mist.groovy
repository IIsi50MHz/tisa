class Kategorie_mist {
    String nazev
    def hasMany = [misto:Misto]
        
    static constrains = {
        nazev(blank:false)
    }
}
