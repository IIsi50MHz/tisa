class KategorieAkci {
    String nazev
    def hasMany = [akce:Akce]
    
    static constrains = {
        nazev(blank:false)
    }
		
		String toString() {
        return this.nazev
    }
}
