class Misto {
  String nazev=""
  String odkaz_mapa=""
  String popis=""
  def hasMany = [akce:Akce]
  def belongsTo = [Mesto, Spravce, Kategorie_mist]
  Mesto mesto
  Spravce spravce
  Kategorie_mist kategorie
  
    static constraints = {
        nazev(blank:false)
        popis(widget:"textarea")
        odkaz_mapa()
        mesto(blank:false)
        kategorie()
    }
    
    String toString() {
        return this.nazev
    }
    
}
