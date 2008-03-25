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
				heslo(blank:false)
				sul(blank:false)
				telefon()
				adresa()
    }
		
}
