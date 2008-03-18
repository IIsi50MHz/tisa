class Misto {
  String nazev
  String odkaz_mapa
  String popis
  def hasMany = [akce:Akce]
  
    static constraints = {
        nazev(blank:false)
        popis(widget:"textarea")
        odkaz_mapa()
    }
    
    String toString() {
        return this.nazev
    }
    
}
