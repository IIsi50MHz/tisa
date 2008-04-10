class Misto {
  String nazev=""
  String odkaz_mapa=""
  String popis=""
  def hasMany = [rozmisteni:Rozmisteni]
  def belongsTo = [Mesto, Spravce, KategorieMist]
  Mesto mesto
  Spravce spravce
  KategorieMist kategorie
  
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
