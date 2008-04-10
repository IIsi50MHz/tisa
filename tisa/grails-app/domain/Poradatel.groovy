class Poradatel {

    String cele_jmeno
    String email
    String telefon = ""
    String adresa = ""
    		
    def hasMany = [akce:Akce]
    
		static constraints = {
				cele_jmeno(blank:false)
				email(blank:false)
				telefon()
				adresa()
		}
                
   String toString() {
        return this.cele_jmeno
    }
    
}
