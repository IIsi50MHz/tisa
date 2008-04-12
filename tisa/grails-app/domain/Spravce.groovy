
class Spravce extends UserStub {

		Boolean vsechna_prava = false
		def hasMany = [mista:Misto]		


                def listAkce() {
                  def list = []  
                    if (vsechna_prava){
                          list = Akce.list() 
                    } else {
                          def i = 0
                          for(misto in listMisto()){
                            for(rozmisteni in misto.rozmisteni){
                              for(akce in rozmisteni.akce) {
                                list[i++] = akce;
                              }
                            }
                          }
                    } 
                    
                  return list
                }
                
                def listRozmisteni() {
                 def list = []  
                    if (vsechna_prava){
                        list = Rozmisteni.list()
                    } else {
                        def i = 0
                          for(misto in listMisto()){
                            for(rozmisteni in misto.rozmisteni){
                                list[i++] = rozmisteni
                            }
                          }
                    }
                 
                 return list
                }
                
                def listSpravce() {
                 def list = []  
                    if (vsechna_prava){
                        list = Spravce.list()
                    } else {
                        list = this;
                    }
                 
                 return list
                }
    
                def listMista() {
                  def list = []  
                    if (vsechna_prava){
                          list = Misto.list() 
                    } else {
                          list = listMisto()
                    }
              
                  return list
                }
				
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
