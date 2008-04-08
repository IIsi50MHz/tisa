class Poradatel extends UserStub {

		def hasMany = [akce:Akce]		


}


/*
class Poradatel {

    String cele_jmeno
    String email
    String heslo
    String sul
    String telefon
    String adresa
    		
		static constraints = {
				cele_jmeno(blank:false)
				email(blank:false)
				heslo(size:5..30)
				sul(blank:false)
				telefon()
				adresa()
}

}
*/