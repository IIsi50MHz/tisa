class ZpusobVyprseniRezervace {
    String druh
    Integer cas
    def belongsTo = Misto
    Misto misto
    
		static druhy = ["before_action_begin", "after_reservation_taken"]
		static casy = [300, 900, 1800, 3600, 7200, 14400, 18800, 37600, 75200, //last # is week
				150400,	300800, 526400, 1052800, 2105600] //last # is 4 weeks
		
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
