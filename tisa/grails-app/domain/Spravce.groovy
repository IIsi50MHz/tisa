import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import sun.misc.BASE64Encoder;
import sun.misc.CharacterEncoder;

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
		
		def beforeSave  = {
				puts "hello ------- "
    }
		/*
		static final hash_password(String password) {
				MessageDigest md = null;
				try	{
					md = MessageDigest.getInstance("SHA"); //step 2
				}	catch(NoSuchAlgorithmException e)	{
						throw e
					//throw new SystemUnavailableException(e.getMessage());
				}
				try {
					md.update(password.getBytes("UTF-8")); //step 3
				}	catch(UnsupportedEncodingException e)	{
						throw e
					//throw new SystemUnavailableException(e.getMessage());
				}
				def raw = md.digest(); //step 4
				String hash = (new BASE64Encoder()).encode(raw); //step 5
				return hash; //step 6				
    }*/
		
}