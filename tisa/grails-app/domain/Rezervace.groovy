class Rezervace {
    String mista
    Date rezervovano
    Boolean prodano
    def belongsTo = Akce
    Akce akce;
    
    static constraints = {
        akce()
        mista()
        rezervovano()
        prodano()
    }

}
