import java.security.MessageDigest;

class Operatorka extends UserStub {
	
			def belongsTo = Misto
			Misto misto   
			Boolean vsechny_mista = false

			static constraints = {
					misto()
					vsechny_mista()
      }
		
			 //TODO: nefacha 
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

}
