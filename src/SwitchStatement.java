public class SwitchStatement {
   // Create a new switch statement using char instead of int
   // create a new char variable
   // create a switch statement testing for
   // A, B, C, D, or E
   // display a message if any of these are found and then break
   // Add a default which displays a message saying not found

   public static void main(String[] args) {

      char switchValue = 'A';

      switch (switchValue) {
         case 'A':
         case 'B':
         case 'C':
         case 'D':
         case 'E':
            System.out.println("number is 5");
            break;

         case 10:
            System.out.println("number is 10");
            break;

         default:
            System.out.println("none of the numbers are correct");
            break;
      }

      String month = "JuNe";
      switch (month.toLowerCase()) {
         case "January":
            System.out.println("Januari");
            break;
         case "june":
            System.out.println("june");
            break;
         default:
            System.out.println("Not Sure");
      }

      printDayOfTheWeek(5);
      printDayOfTheWeek(10);
   }


   //Write a method with the name printDayOfTheWeek that has one parameter of type int and name it day.
   //
   //The method should not return any value (hint: void)
   //
   //Using a switch statement print gSundayh, gMondayh, c ,gSaturdayh if the int parameter
   // gdayh is 0, 1, c , 6 respectively, otherwise it should print gInvalid dayh.
   //
   //Bonus:
   //	Write a second solution using if then else, instead of using switch.
   //	Create a new project in IntelliJ with the  name gDayOfTheWeekChallengeh

   public static void printDayOfTheWeek(int day) {


      switch (day) {
         case 0:
            System.out.println("monday");
            break;
         case 1:
            System.out.println("tuesday");
            break;
         case 2:
            System.out.println("wednesday");
            break;
         case 3:
            System.out.println("thursday");
            break;
         case 4:
            System.out.println("friday");
            break;
         case 5:
            System.out.println("saturday");
            break;
         case 6:
            System.out.println("sunday");
            break;
         default:
            System.out.println("Invalid day.");

      }


   }

   public static void printNumberInWord(int number){

   }
}
