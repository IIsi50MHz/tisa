class Operatorka {
    Boolean vsechny_mista 
    String cele_jmeno
    String email
    String heslo
    String sul
    String telefon
    String adresa
    def belongsTo = Misto
    Misto misto
    
    
    static constraints = {
	vsechny_mista()
        cele_jmeno(blank:false)
	email(blank:false)
	heslo(size:5..30)
	sul(blank:false)
	telefon()
	adresa()
        misto()
    }
}
