import java.security.MessageDigest;

class Spravce {

		String cele_jmeno = ""
		String email = ""
		String sul = ""
		String telefon = ""
		String adresa = ""
		String heslo = ""
		String hashed_heslo = ""
		Boolean vsechna_prava = false
		private Boolean nove_heslo = false
		def hasMany = [mista:Misto]		
		
		static constraints = {
				cele_jmeno(blank:false)
				email(blank:false)
				hashed_heslo(nullable:true)
				sul(nullable:true)
				telefon()
				adresa()
    }
		
		def authenticate(String email, String pass) {
				Spravce.findByEmailAndHashedHeslo(email, hash(sul+pass))
    }

		def beforeInsert = {
				beforeUpdate()
    }

		def beforeUpdate   = {
				
				if (heslo!='') {
						this.sul = hash(this.heslo+"abcd")
						this.hashed_heslo = hash(this.sul+this.heslo)
						this.heslo = ''
        }		
    }
		
		def String hash(String password) {
       MessageDigest digest = MessageDigest.getInstance("SHA-1");
       digest.reset();
       (String) digest.digest(password.getBytes("UTF-8"));
		}
				
}
