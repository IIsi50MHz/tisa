class Misto {
  String nazev=""
  String odkaz_mapa=""
  String popis=""
  def hasMany = [akce:Akce]
  def belongsTo = [Mesto, Spravce]
  Mesto mesto
	Spravce spravce
  
    static constraints = {
        nazev(blank:false)
        popis(widget:"textarea")
        odkaz_mapa()
        mesto(blank:false)
    }
    
    String toString() {
        return this.nazev
    }
    
}
