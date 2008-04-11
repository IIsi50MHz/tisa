class Rezervace {
    String mista = ""
    Date rezervovano
    Boolean prodano = false
    def belongsTo = [Akce, Uzivatel]
    Akce akce
    Uzivatel uzivatel
    
    static constraints = {
        akce()
        uzivatel()
        mista()
        rezervovano(nullable:true)
        prodano()
    }
		
		def beforeInsert = {
				rezervovano = new Date()
    }

		
		def addMisto(position) {
				mista += position[0]+"_"+position[1]+" "
    }
				

}
