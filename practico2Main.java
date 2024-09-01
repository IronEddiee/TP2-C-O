public class practico2Main {
   public static void main (String[] args){
   
   String marca, estado;
   int pulgada, opciones;
   char boton;
   boolean bandera= false;
   System.out.println("Que televisor es?");
   marca= Console.readString();
   
   System.out.println("De cuantas pulgadas es?");
   pulgada= Console.readInt();
   
   Televisor tele= new Televisor (marca, pulgada);
   tele.estadoTele();
   
   do{
      System.out.println("Seleccione una opcion");
      System.out.println("1)Nivel de volumen \n 2)Subir o bajar canal \n 3)seleccionar un canal \n 4)Estado del televisor \n 5)Apagar televisor");
      opciones= Console.readInt();
      switch (opciones){
         case 1:
         {
            tele.controlVolumen();
            break;
         }
         case 2:
         {
            tele.canales();
            break;
         }
         case 3:
         {
            tele.controlCanal();
            break;
         }
         case 4:
         {
            tele.dato();
            break;
            
         }
         case 5:
         {
            System.out.println("Televisor apagado");
            bandera= true;
            break;
         }
         default:
         {
            System.out.println("El valor ingresado no es valido, intente nuevamente");
         }
      }
      
   }while(bandera== false);
   
   
   
   } 
}

  /*
   Alumno alumnoUno= new Alumno("Mauro Ezequiel Leguizamon", 42493571, 17, "Febrero", 2000, 108, 'M');
   alumnoUno.datosAlumno();
   
   Curso cursoUno= new Curso ('A', "Matematica", "Jose Arce", 4);
   cursoUno.datosCurso();
   
   Telefono contacto= new Telefono ("celular", 11, 27106382);
   contacto.datosTelefonos();*/