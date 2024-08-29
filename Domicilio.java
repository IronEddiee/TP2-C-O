public class Domicilio{
   //atributos
   private String calle;
   private int altura;
   private String depto;
   private String barrio;
   private String localidad;
   private int codPostal;
   
   //constructor 
   public Domicilio(String calle, int nro, String casa, String barrio, String loca, int postal){
      this.calle= calle;
      this.altura= nro;
      this.depto= casa;
      this.barrio= barrio;
      this.localidad= loca;
      this.codPostal= postal;
   }
   
   //metodo get
   public String getCalle(){
      return calle;
   }
   public int getAltura(){
      return altura;
   }
   public String getDepto(){
      return depto;
   }
   public String getBarrio(){
      return barrio;
   }
   public String getLocalidad(){
      return localidad;
   }
   public int getCodPostal(){
      return codPostal;
   }
   
   //metodo set
   public void setCalle(String calle){
      this.calle= calle;
   }
   public void setAltura(int altura){
      this.altura= altura;
   }
   public void setDepto(String numero){
      this.depto= numero;
   }
   public void setBarrio (String barrios){
      this.barrio= barrios;
   }
   public void setLocalidad(String localidad){
      this.localidad= localidad;
   }
   public void setCodPostal(int postal){
      this.codPostal= postal;
   }
   //Metodos
   public void datosDomicilios(){
      System.out.println("Domicilio: " + getCalle() + " " +  getAltura() + ", barrio: " + getBarrio() + ", localidad: " + getLocalidad() + "\n");
      System.out.println("Codigo postal: " + getCodPostal());
  }
}