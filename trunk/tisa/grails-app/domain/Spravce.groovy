
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
    //TODO: asi nefacha nejlepepe - najde jen jedno misto
                def listMista() {
                  def list = []  
                    if (vsechna_prava){
                          list = Misto.list() 
                    } else {
                         // list = listMisto()
                         def i = 0
                         for(misto in Misto.findAllBySpravce(this)){
                             //list[i++] = misto
                               list[i++] = misto
                         }
                    }
              
                  return list
                }
				
		def listMisto() {
                  return Misto.findBySpravce(this)
                }
				
    
              //TODO: nefacha nejlepepe - najde jen jedno misto (spravce:ostrava),
               def listOperatorka() {
                 def list = []  
                    if (vsechna_prava){
                        list = Operatorka.list()
                    } else {
                        def i = 0
                          for(misto in Misto.findAllBySpravce(this)){
                           for(operatorka in Operatorka.findAllByMisto(misto)){
                                 list[i++]= operatorka
                          }
                          }
                    }
                 
                 return list
                }
    
    
                def listRezervace() {
                 def list = []  
                    if (vsechna_prava){
                        list = Rezervace.list()
                    } else {
                        def i = 0
                          for(akce in listAkce()){
                            for(rezervace in akce.rezervace){
                                list[i++] = rezervace
                            }
                          }
                    }
                 
                 return list
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
