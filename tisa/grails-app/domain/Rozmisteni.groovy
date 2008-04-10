class Rozmisteni {
    String nazev
    String plan_salu = ""
    def belongsTo = Misto
		def hasMany = [akce: Akce]
    Misto misto
    
    
    static constraints = {
        nazev(blank:false)
        plan_salu() //TODO blank:false
        misto(blank:false)
        
    }
		
		String toString() {
        return this.nazev
    }
}
