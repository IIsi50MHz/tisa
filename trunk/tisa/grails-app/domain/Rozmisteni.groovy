import grails.converters.JSON

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
		
		def plan_salu_to_a = {
				try{ 
				grails.converters.JSON.parse(plan_salu)
				} catch (Exception e) {
						//if not valid json return 2D empty array
						return [[]]
        }
    }
}
