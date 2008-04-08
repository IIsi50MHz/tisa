class Mesto {
  
    String jmeno = "";
    String mapa="";
    String popis="";
    def hasMany = [misto:Misto]
    
    static constrains = {
       jmeno(blank:false)
       mapa()
       popis()
       misto()
    }
		
    String toString() {
        return this.jmeno
    }    
}
