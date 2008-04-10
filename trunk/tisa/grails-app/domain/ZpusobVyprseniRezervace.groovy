class ZpusobVyprseniRezervace {
    String druh
    String cas //byl tam int
    def belongsTo = Misto
    Misto misto
    
		static druhy = ["před začátkem akce", "po rezervaci"]
                //static druhy = ["before_action_begin", "after_reservation_taken"]
		static casy = ["5 minut", "15 minut", "půl hodiny", "hodina", "2 hodiny", "4 hodiny", "8 hodin", "12 hodin", "24 hodin", //last # is week
				"48 hodin", "4 dny", "týden", "2 týdny", "4 týdny"] //last # is 4 weeks
		//static casy = [300, 900, 1800, 3600, 7200, 14400, 18800, 37600, 75200, //last # is week
		//		150400,	300800, 526400, 1052800, 2105600]
                            
    
    static constrains = {
        cas(blank:false)
        druh(inList:druhy)
    }
		
		String toString() {
				/*
				def messageSource = grailsAttributes.getApplicationContext().getBean("messageSource")
		    def t_cas = messageSource.getMessage( "tisa.zpusobVyprseniRezervace.cas."+this.cas, 'cs' )
		    def t_druh = messageSource.getMessage( "tisa.zpusobVyprseniRezervace.druh."+this.druh, 'cs' )
				return t_cas + " " + t_druh
				*/
			 return cas + " " + druh
    }
}
