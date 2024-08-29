public class Curso {
   //atributos
   private char curso;
   private String materia;
   private String maestro;
   private int año;
   
   //constructor
   public Curso (char cursos, String m, String maestros, int años ){
      this.curso= cursos;
      this.materia= m;
      this.maestro= maestros;
      this.año= años;
   }
   
   //metodo get
   public char getCurso(){
      return curso;
   }
   public String getMateria(){
      return materia;
   }
   public String getMaestro(){
      return maestro;
   }
   public int getAño(){
      return año;
   }
   
   //metodo set
   public void setCurso(char Curso){
      this.curso= Curso;   
   }
   public void setMateria(String m){
      this.materia= m;
   }
   public void setMaestro(String maestros){
      this.maestro= maestros;
   }
   public void setAño(int años){
      this.año= años;
   }
   
   //metodos
   public void datosCurso(){
      System.out.println("Datos de cursada \n Curso: " + getCurso() + "\n Materia: " + getMateria() + "\n Maestro: " + getMaestro() + "\n Año escolar: " + getAño() + "\n");
      
   }
}