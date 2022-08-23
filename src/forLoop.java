public class forLoop {
   public static void main(String [] args){

     // calculateInterest(10000, 2.0);

      for(int i = 2; i <9; i++){
         System.out.println(calculateInterest(10000, i));
         //println with just 2 decimalpositions:
         System.out.println(i + "interest = " + String.format("%.2f", calculateInterest(10000, i)));
      }
      System.out.println("now we go backwards on the loop... ");
      for(int i = 8; i >1; i--){
         System.out.println(calculateInterest(10000, i));
         //println with just 2 decimalpositions:
         System.out.println(i + "interest = " + String.format("%.2f", calculateInterest(10000, i)));
      }
   }


   public static double calculateInterest(double amount, double interestRate){
      return(amount *(interestRate/100));
   }
}
