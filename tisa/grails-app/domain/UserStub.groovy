import java.security.MessageDigest;

class UserStub {
		
		String cele_jmeno = ""
		String email = ""
		String sul = ""
		String telefon = ""
		String adresa = ""
		String heslo = ""
		String hashed_heslo = ""

				
		static constraints = {
				cele_jmeno(blank:false)
				email(blank:false)
				heslo(nullable:true)
				hashed_heslo(nullable:true)
				sul(nullable:true)
				telefon()
				adresa()
    }
				
		def authenticate(String pass) {
				//println email+" "+hashed_heslo+" and "+hash(sul+pass)
				(hashed_heslo == hash(sul+pass))
    }

		def beforeInsert = {
				if (heslo!='') {
						//sul = hash(hashed_heslo+"abcd")
						hashed_heslo = hash(heslo)
						heslo = ''
        }			
    }

		def beforeUpdate = {				
				if (heslo!='') {
						//sul = hash(hashed_heslo+"abcd")
						hashed_heslo = hash(heslo)
						heslo = ''
        }			
    }
		
		def String hash(String password) {
				MessageDigest digest = MessageDigest.getInstance("SHA-1");
				digest.reset();
				digest.update(password.getBytes("UTF-8"))
				def byte[] messageDigest = digest.digest();
				StringBuffer hexString = new StringBuffer();
				for (int i=0;i<messageDigest.length;i++) {
						String hex = Integer.toHexString(0xFF & messageDigest[i]); 
						if(hex.length()==1)
						hexString.append('0');						
						hexString.append(hex);
				}
				return hexString.toString();
		}
				
}
