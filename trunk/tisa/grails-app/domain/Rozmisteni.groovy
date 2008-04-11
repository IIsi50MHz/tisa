
class Rozmisteni {
    String nazev
    String plan_salu = ""
    def belongsTo = Misto
		def hasMany = [akce: Akce]
    Misto misto
    
    
    static constraints = {
        nazev(blank:false)
        plan_salu(size:0..10000)
        misto(blank:false)
        
    }
		
		String toString() {
        return this.nazev
    }

}
