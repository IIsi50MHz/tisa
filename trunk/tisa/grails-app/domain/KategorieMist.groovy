class KategorieMist {
    String nazev
    def hasMany = [misto:Misto]
        
    static constrains = {
        nazev(blank:false)
    }
}
