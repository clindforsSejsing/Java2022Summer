public class LeapYearCalculator {

   public static void main(String[] args) {
      //year needs to be: year >= 1 && year <= 9999. Or else return false.

      isLeapYear(1600);
      isLeapYear(2000);
      isLeapYear(2400);
      isLeapYear(1700);
      isLeapYear(1800);
      isLeapYear(1900);
      isLeapYear(2600);
      isLeapYear(1924);


   }

   public static boolean isLeapYear(int year) {
      if (year >= 1 && year <= 9999) {

         if (year % 4 == 0 && (year % 100 != 0 || (year % 100 == 0 && year % 400 == 0))) {
            System.out.println("true");
            return true;
         } else {
            System.out.println("false");
            return false;
         }
      }
      else {
         System.out.println("false");
   }return false;
}
}







