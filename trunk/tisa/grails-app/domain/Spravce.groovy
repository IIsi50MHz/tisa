
class Spravce extends UserStub {

		Boolean vsechna_prava = false
		def hasMany = [mista:Misto]		


				
		def listMisto() {
				return Misto.findBySpravce(this)
    }
				
		def listVyprseni(UserStub user) {
				vyprseni = []
				for (misto in listMisto()) {
						vyprseni += misto.zpusobyVyprseniRezervaci
        }
				return vyprseni
    }
    
    String toString() {
        return this.cele_jmeno
    }
}
