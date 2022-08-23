public class Feet {
   //feet is >=0, inches is >=0 and <=12, then return -1 if not
   //1ft= 30.48000cm
   //1 inch = 2.54 cm, 1 feet = 12 inches
   public static void main(String [] args){

   }

   public static double calcFeetAndInchesToCentimeters(int feet, double inches){
      if (feet >= 0 && inches >=0 && inches <=12 ){
         //calculate
         System.out.println("feet = " + feet/30.48000 + "cm");
         return (feet / 30.48000);
      } else{
         System.out.println("no numbers");
         return -1;
      }

   }
   public static double calcFeetAndInchesToCentimeters(double inches){
      if(inches >=0){

      }
      return -1;
   }
}

//continue in method overloading chapter 58, 10.03 min in