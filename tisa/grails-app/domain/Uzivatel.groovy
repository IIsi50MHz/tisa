import java.security.MessageDigest;

class Uzivatel extends UserStub {

    def hasMany = [rezervace:Rezervace]
    
}
