public class practico2Main {
   public static void main (String[] args){
   
   Alumno alumnoUno= new Alumno("Mauro Ezequiel Leguizamon", 42493571, 17, "Febrero", 2000, 108, 'M');
   alumnoUno.datosAlumno();
   
   Curso cursoUno= new Curso ('A', "Matematica", "Jose Arce", 4);
   cursoUno.datosCurso();
   
   Telefono contacto= new Telefono ("celular", 11, 27106382);
   contacto.datosTelefonos();
   } 
}