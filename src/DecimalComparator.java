public class DecimalComparator {

   //method should return true if the numbers are same up to three decimal places, otherwise return false.
   public static void main(String[] args) {
      areEqualByThreeDecimalPlaces(-3.1756, -3.175); //true
      areEqualByThreeDecimalPlaces(3.175, 3.176); //false
      areEqualByThreeDecimalPlaces(3.0, 3.0); //true
      areEqualByThreeDecimalPlaces(-3.123, 3.123); //false

   }

   public static boolean areEqualByThreeDecimalPlaces(double nrOne, double nrTwo) {

      int intNr1 = (int) (nrOne * 1000);
      int intNr2 = (int) (nrTwo * 1000);

      double doubleNr1 = (double) intNr1 / 1000;
      double doubleNr2 = (double) intNr2 / 1000;

      System.out.println("intNr1: " + intNr1 + " intNr2 " + intNr2 + " doubleNr1 " + doubleNr1 + " doubleNr2 " + doubleNr2);

      if (doubleNr1 == doubleNr2) {
         System.out.println("True");
         return true;
      } else {
         System.out.println("False");
         return false;
      }

      // DecimalFormat d1= new DecimalFormat("#.###");
      /*double value = Math.abs(nrOne);
      double value2 = Math.abs(nrTwo);*/
      //denna skriver ut exakta talet med 3 decimaler.

  /* if (nrOne == nrTwo){
      System.out.println(" All true");
      return true;
   } else if(d1.format(nrOne).equals(d1.format(nrTwo))){
      System.out.println("True");
      return true;

   }*/
   /*else if((Math.abs(d1.format(nrOne) == (Math.abs(d1.format(nrTwo)){
      System.out.println("True");
      return true;
   }*/

/*   }System.out.println("d1.format(nrOne):" + d1.format(nrOne) + " d1.format(nrTwo) "+d1.format(nrTwo));
      System.out.println("all false");
      return false;*/
   }
}

//hur att returnera exakt tal? math.abs går ej att använda då den tar bort minustecken.