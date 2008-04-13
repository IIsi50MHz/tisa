import java.security.MessageDigest;

class Uzivatel extends UserStub {

    def hasMany = [rezervace:Rezervace]
    
		String toString() {
        return this.cele_jmeno
    }
		
}
