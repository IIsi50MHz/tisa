class Rezervace {
    String mista
    Date rezervovano
    Boolean prodano
    def belongsTo = Akce
    def belongsTo = Uzivatel
    Akce akce
    Uzivatel uzivatel
    
    static constraints = {
        akce()
        uzivatel()
        mista()
        rezervovano()
        prodano()
    }

}
