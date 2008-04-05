import java.security.MessageDigest;

class Spravce {

		String cele_jmeno
		String email
		String heslo
		String sul
		String telefon
		String adresa
		Boolean vsechna_prava = 0
		
		static constraints = {
				cele_jmeno(blank:false)
				email(blank:false)
				heslo(size:5..30)
				sul(blank:false)
				telefon()
				adresa()
    }
		
		def authenticate(String email, String pass) {
				Spravce.findByEmailAndHeslo(email, (String)hash(pass))
    }
		
		def beforeSave  = {
				puts "hello ------- saving..."
				password = hash(password)
    }
		
		def byte[] hash(String password) {
       MessageDigest digest = MessageDigest.getInstance("SHA-1");
       digest.reset();
       byte[] input = digest.digest(password.getBytes("UTF-8"));
		}
				
}
