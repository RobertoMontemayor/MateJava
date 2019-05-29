import java.io.*;
class Main{
   public static void main(String args[]){///Comentario
      int resp = Lectura.readInt("Ingresa lo que quieres hacer \n1=Multi\2=Suma");
      while (resp !=3){
         resp =Lectura.readInt("Ingresa lo que quieres hacer \n1=Multi\2=Suma");
         switch (resp){
            case 1:
               multiplicacion(Lectura.readInt("Ingresa un numero"),Lectura.readInt("Ingresa otro numero") );
               break;
            case 2:
               break;
         }
      }
   }
   public static void multiplicacion(int x, int y){
         System.out.println(x+" x "+y+" = "+(x*y));
   }
}