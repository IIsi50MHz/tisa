class Mesto {
  
    String jmeno = "";
    String mapa="";
    String popis="";
    
    static constrains = {
       jmeno(blank:false)
       mapa()
       popis()
    }
		
    String toString() {
        return this.jmeno
    }    
}
