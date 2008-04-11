import org.codehaus.groovy.grails.web.json.JSONObject

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
		
		def plan_array = {
				jsonToArray(new JSONObject(plan_salu))
    }
		
		private jsonToArray(json) {
			def array = []
			def val
			for (key in json.keys()) {
					val = json.get(key)
					if (val instanceof JSONObject) {
							val = jsonToArray(val)
          }
					array[Integer.parseInt(key)] = val
			}
			array
    }


}
