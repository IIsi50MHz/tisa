import java.security.MessageDigest;

class Operatorka extends UserStub {
	
          def belongsTo = Misto
          Misto misto   
          Boolean vsechny_mista = false
    
           //TODO: nefacha 
           def listAkce() {
                  def list = []  
                    if (vsechny_mista){
                          list = Akce.list() 
                    } else {
                          def i = 0
                         
                            for(rozmisteni in misto.rozmisteni){
                              for(akce in rozmisteni.akce) {
                                list[i++] = akce;
                              }
                            }
                          
                    }
             return list
           }
                      
}
