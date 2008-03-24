class Zpusob_vyprseni_rezervace {
    String druh
    Integer cas
    
		static druhy = ["before_action_begin", "after_reservation_taken"]
		static casy = [300, 900, 1800, 3600, 7200, 14400, 18800, 37600, 75200, //last # is week
				150400,	300800, 526400, 1052800, 2105600] //last # is 4 weeks
		
    static constrains = {
        cas(blank:false)
        druh(inList:druhy)
    }
		
		String toString() {
        return this.cas +" " +this.druh
    }
}
