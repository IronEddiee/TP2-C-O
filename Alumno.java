public class Alumno {
   //atributos
   private String nombre;
   private int dni;
   private int diaN;
   private String mesN;
   private int añoN;
   private int nroLegajo;
   private char sexo;
   
   //Constructor
   public Alumno (String nombre, int dni, int dia, String mes, int año, int legajo, char sexo){
      this.nombre= nombre;
      this.dni= dni;
      this.diaN= dia;
      this.mesN= mes;
      this.añoN= año;
      this.nroLegajo= legajo;
      this.sexo= sexo;
   } 
   //metodo get
   public String getNombre(){
      return nombre;
   }
   public int getDni(){
      return dni;
   }
   public int getDiaN(){
      return diaN;
   }
   public String getMesN(){
      return mesN;
   }
   public int getAñoN(){
      return añoN;
   }
   public int getNroLegajo(){
      return nroLegajo;
   }
   public char getSexo(){
      return sexo;
   }
   
   //metodo set
   public void setNombre(String Nombre){
      this.nombre= Nombre;
   }
   public void setDni(int Dni){
      this.dni= Dni;
   }
   public void setDiaN(int Dia){
      this.diaN= Dia;
   }
   public void setMesN(String Mes){
      this.mesN= Mes;
   }
   public void setAñoN(int Año){
      this.añoN= Año;
   }
   public void setNroLegajo(int Legajo){
      this.nroLegajo= Legajo;
   }
   public void setSexo(char Sexo){
      this.sexo= Sexo;
   }
   
   //metodos 
   public void datosAlumno(){
      System.out.println("**Datos del alumno**");
      System.out.println("Nombre y apellido: " + getNombre());
      System.out.println("Fecha de nacimiento: " + getDiaN() + "/" + getMesN() + "/" + getAñoN());
      System.out.println("Sexo: " + getSexo());
      System.out.println("Numero de legajo: " + getNroLegajo() + "\n");
   }
}