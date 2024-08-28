public class Alumno {
   //atributos
   private int nombre, años, dni, grado, nroLegajo, sexo;
   private String Nombre;
   private int Años;
   private int Dni;
   private char Grado;
   private int NroLegajo;
   private char Sexo;
   
   //constructor
   public Alumno (String nombre, int años, int dni, char grado, int nroLegajo, char sexo){
      this.Nombre= nombre;
      this.Años= años;
      this.Dni= dni;
      this.Grado= grado;
      this.NroLegajo= nroLegajo;
      this.Sexo= sexo;
   }
   //metodos get
   public String getNombre() {
      return Nombre;
   }
   public int getAños(){
      return Años;
   }
   public int getDni(){
      return Dni;
   }
   public char getGrado(){
      return Grado;
   }
   public int getNroLegajo(){
      return NroLegajo;
   }
   public char getSexo(){
      return Sexo;
   }
   //metodo set
   public void setNombre(String nombre){
      this.Nombre= nombre;
   }
   public void setAños(int años){
      this.Años= años;
   }
   public void setDni(int dni){
      this.Dni= dni;
   }
   public void setGrado(char grado){
      this.Grado= grado;
   }   
   public void setNroLegajo( int nroLegajo){
      this.NroLegajo= nroLegajo;
   }
   public void setSexo(char sexo){
      if (sexo == 'M' | sexo == 'F'){
         this.Sexo= sexo;
      }else{
         System.out.println("La letra ingresada no es valida");
      }
   }
   public void datosAlumno(){
   System.out.println("DATOS DEL ALUMNO");
   System.out.println("Nombre y Apellido: " + getNombre());
   System.out.println("Edad: " + getAños());
   System.out.println("DNI: " + getDni());
   System.out.println("Sexo: " + getSexo());
   System.out.println("Grado: " + getGrado());
   System.out.println("Numero de legajo: " + getNroLegajo() + "\n");
   }
   
}