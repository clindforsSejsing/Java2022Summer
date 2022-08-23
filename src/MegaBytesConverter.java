
public class MegaBytesConverter {

   // 1 MB = 1024 KB

   public static void main(String[] args) {
      printMegaBytesAndKiloBytes(2500);
      printMegaBytesAndKiloBytes(-1024);
      printMegaBytesAndKiloBytes(5000);
   }


      public static void printMegaBytesAndKiloBytes(int kiloBytes) {
         if (kiloBytes < 0) {
            System.out.println("invalid value");
         } else {
            int division = kiloBytes / 1024;
            int parameter = kiloBytes % 1024;
            System.out.println(kiloBytes + "KB =" + division + "MB and" + parameter + " KB . ");
         }
      }
   }


