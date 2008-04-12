import java.security.MessageDigest;

class Operatorka extends UserStub {
	
			def belongsTo = Misto
			Misto misto   
			Boolean vsechny_mista = false

			static constraints = {
					misto()
					vsechny_mista()
      }
		
			
			 def listAkce() {
							def list = []  
								if (vsechny_mista){
											list = Akce.list() 
								} else {
											def i = 0
											for (rozmisteni in Rozmisteni.findByMisto(misto)) {
												for(akce in Akce.findByRozmisteni(rozmisteni)) {
														list[i++] = akce;
												}
											}
								}
				 return list
			 }
                         
    
                         def listMista() {
                             def list = []  
                              if (vsechny_mista){
                                   list = Misto.list() 
                                  //list = Spravce.listMista()
                              } else {
                                   list = listMisto()
                              }
              
                         return list
                         }
                         
            def listRozmisteni() {
                 def list = []  
                    if (vsechny_mista){
                        list = Rozmisteni.list()
                    } else {
                        def i = 0
                         
                            for(rozmisteni in Rozmisteni.findByMisto(misto)){
                                list[i++] = rozmisteni
                            }
                          
                    }
                 
                 return list
                }
				
            def listRezervace() {
                 def list = []  
                    if (vsechny_mista){
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
                
             def listSpravce() {
                 def list = []  
                    if (vsechny_mista){
                        list = Spravce.list()
                    } else {
                        list = Spravce.list() //TODO jenom sve spravce
                    }
                 return list
                }
    
    
		def listMisto() {
                  def list = this
                  return list.misto
                }
                

}
