class Rezervace {
    String mista = ""
    Date rezervovano
    Boolean prodano = false
    def belongsTo = [Akce, Uzivatel]
    Akce akce
    Uzivatel uzivatel
		Integer mista_count = 0
    
    static constraints = {
        akce()
        uzivatel()
        mista()
        rezervovano(nullable:true)
        prodano()
				mista_count(validator: {
					if (it > 6) return ['too_much']
				})
    }
		
		def beforeInsert = {
				rezervovano = new Date()
    }

		
		def addMisto(position) {
				mista_count++
				mista += position[0]+"_"+position[1]+" "
    }
				

}
