public class Telefono{
   //atributos 
   private String tipo;
   private int codArea;
   private int numero;
   
   //constructor 
   public Telefono(String t, int codigo, int numero){
      this.tipo= t;
      this.codArea= codigo;
      this.numero= numero;
   }
   
   //metodo get
   public String getTipo(){
      return tipo;
   }
   public int getCodArea(){
      return codArea;
   }
   public int getNumero(){
      return numero;
   }
   
   //metodo set 
   public void setTipo(String t){
      this.tipo= t;
   }
   public void setCodArea(int codigo){
      this.codArea= codigo;
   }
   public void setNumero(int numero){
      this.numero= numero;
   }
   
   //metodos
   public void datosTelefonos(){
      System.out.println("Contactos \n Telefono: " + getTipo() + "\n Codigo Area: " + getCodArea() + "\n Numero: " + getNumero());
   }
}
