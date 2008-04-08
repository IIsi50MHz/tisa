class Rezervace {
    String mista
    String rezervovano //Date
    Boolean prodano
    def belongsTo = [Akce, Uzivatel]
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
