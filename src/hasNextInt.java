import java.util.Scanner;
//programmet kan mata in 10 nummer- sen adderas de. Även felkontroller. ch 74 kap 5.
public class hasNextInt {

   //kontroll för att ett nummer skrivs in ch 73 kapitel 5

   //scanner
public static void main(String [] args){

   Scanner scanner = new Scanner(System.in);
   //importing scanner as an object. Man bör avsluta scannern även längst ner.


   int counter = 0;
   int sum = 0;

   //vi ska loopa tills vi får 10 nr

   while(true){
      int order = counter +1;
      System.out.println("Enter number # " + order + ":");

      boolean isAnInt = scanner.hasNextInt(); // kontroll att det är en boolean?

      if(isAnInt){
         int number = scanner.nextInt();
         counter++;
         sum +=number;
         if(counter == 10){
            break;
         }

      }else {
         System.out.println("invalid number...");
      }
      scanner.nextLine(); //handle end of line (enter key)

   }
   System.out.println("sum = " + sum);
   scanner.close();
}

}
