public class Televisor{
   //artibutos
   private String marca;
   private int pulgadas;
   private int volumen;
   private int canal= 5;
   private String estado;
   
   //constructor
   public Televisor(String marca, int tamaño){
      this.marca= marca;
      this.pulgadas= tamaño;
   }
   
   //metodos de accesos y cambios
   public String getMarca(){
      return marca;
   }
   public int getPulgadas(){
      return pulgadas;
   }
   public int getVolumen(){
      return volumen;
   }
   public int getCanal(){
      return canal;
   }
   public String getEstado(){
      return estado;
   }
   public void setVolumen(int sonido){
      this.volumen= sonido;
   }
   public void setCanal(int canal){
      this.canal= canal;
   }
   public void setEstado(String estado){
      this.estado= estado;
   }
   
   //metodos acciones
   public void dato(){
      System.out.println("El televisor de marca " + getMarca() + " de pulgadas " + getPulgadas());
   }
   
   public void estadoTele(){
      int a;
      System.out.println("1)Encender televisor \n 2)Apagar televisor");
      a= Console.readInt();
      if (a == 1){
         setEstado("Encendido");
         System.out.println("Televicion Encencida, Esta en el canal: " + getCanal() + ", con volumen: " + getVolumen() );
      }
      else{
      System.out.println("El televisor apagado");
      setEstado("Apagado");
      }
      }
   
   public void controlVolumen(){
      int volumen;
      boolean bandera= false;
      System.out.println("En que nivel de volumen quiere del 0 al 10?");
      do {
         volumen= Console.readInt();
         if (volumen <= 10 & volumen >= 0){
            bandera= true;
            System.out.println("El volumen del televisor es: " + volumen); 
            setVolumen(volumen);
         }else{
            System.out.println("El valor ingresado no es valido, intente nuevamente");
         }
      }while(bandera == false);   
   }
   
   public void controlCanal(){
      int canal;
      boolean bandera= false;
      System.out.println("A que canal quiere cambiar del 1 al 100?");
      do{
         canal= Console.readInt();
         if (canal >= 1 & canal <= 100){
            bandera= true;
            System.out.println("Se cambio al canal: " + canal);
            setCanal(canal);
         }else{
            System.out.println("El canal selecionado no existe, intente con otro canal");
         }
      }while (bandera== false);
   }
   
   public void canales(){
      int A;
      System.out.println("quiere subir (1) o bajar (2) el canal");
      A= Console.readInt();
      if (A == 1){
         this.canal= canal + 1;
         System.out.println("El canal es: " + getCanal());
         setCanal(A);
      }
      if (A == 2){
        this.canal= canal - 1;
        System.out.println("El canal es: " + getCanal());
        setCanal(A);
       }
   }
   
}

/*
En base a las propiedades obtenidas en el ejercicio 2, implementar la clase Televisor. Con el constructor,
los set y get que sean necesarios, y con los métodos para encender, apagar, subir y bajar el canal, subir y bajar
el volumen y volver al canal antes seleccionado*/
