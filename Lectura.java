import java.io.*;
class Lectura{
      public static byte readByte(String letrero)
      {
        System.out.println(letrero);
         DataInputStream d = new DataInputStream(System.in);
         String g;
         byte x = 0;
         byte sw = 0;
         byte f = 0;
         do {
             try
            {
            g=d.readLine();
             f = Byte.parseByte(g);
            sw = 0;
            }
            catch(NumberFormatException e)
            {
               System.out.println("No es un dato válido");
               sw=1;
            }
          
          catch (IOException e){g="0";}
         }while (sw ==1);
         return f;
       } 
       public static int readInt(String letrero)
      {
         System.out.println(letrero);
         DataInputStream d = new DataInputStream(System.in);
         String g;
         int x = 0;
         int sw = 0;
         int f = 0;
         do {
             try
            {
            g=d.readLine();
             f = Integer.parseInt(g);
            sw = 0;
            }
            catch(NumberFormatException e)
            {
               System.out.println("No es un dato válido");
               sw=1;
            }
          
          catch (IOException e){g="0";}
         }while (sw ==1);
         return f;
       } 
       public static short readShort(String letrero)
      {
         System.out.println(letrero);
         DataInputStream d = new DataInputStream(System.in);
         String g;
         short x = 0;
         short sw = 0;
         short f = 0;
         do {
             try
            {
            g=d.readLine();
             f = Short.parseShort(g);
            sw = 0;
            }
            catch(NumberFormatException e)
            {
               System.out.println("No es un dato válido");
               sw=1;
            }
          
          catch (IOException e){g="0";}
         }while (sw ==1);
         return f;       } 
       public static long readLong(String letrero)
      {
         System.out.println(letrero);
         DataInputStream d = new DataInputStream(System.in);
         String g;
         long x = 0;
         long sw = 0;
         long f = 0;
         do {
             try
            {
            g=d.readLine();
             f = Long.parseLong(g);
            sw = 0;
            }
            catch(NumberFormatException e)
            {
               System.out.println("No es un dato válido");
               sw=1;
            }
          
          catch (IOException e){g="0";}
         }while (sw ==1);
         return f;
       } 
       public static float readFloat(String letrero)
      {
         System.out.println(letrero);
         DataInputStream d = new DataInputStream(System.in);
         String g;
         float x = 0;
         float sw = 0;
         float f = 0;
         do {
             try
            {
            g=d.readLine();
             f = Float.parseFloat(g);
            sw = 0;
            }
            catch(NumberFormatException e)
            {
               System.out.println("No es un dato válido");
               sw=1;
            }
          
          catch (IOException e){g="0";}
         }while (sw ==1);
         return f;       } 
       public static double readDouble(String letrero)
      {
         System.out.println(letrero);
         DataInputStream d = new DataInputStream(System.in);
         String g;
         double x = 0;
         double sw = 0;
         double f = 0;
         do {
             try
            {
            g=d.readLine();
             f = Double.parseDouble(g);
            sw = 0;
            }
            catch(NumberFormatException e)
            {
               System.out.println("No es un dato válido");
               sw=1;
            }
          
          catch (IOException e){g="0";}
         }while (sw ==1);
         return f;       } 
       public static char readChar(String letrero)
      {
         System.out.println(letrero);
         DataInputStream u = new DataInputStream(System.in);
         String v;
         try
         {v=u.readLine();}
         catch (IOException e){v="0";}
         char w = v.charAt(0);
         return w;
       }
       public static String readString(String letrero)
      {
         System.out.println(letrero);
         DataInputStream x = new DataInputStream(System.in);
         String y;
         try
         {y=x.readLine();}
         catch (IOException e){y="0";}
         return y;
       }
   }