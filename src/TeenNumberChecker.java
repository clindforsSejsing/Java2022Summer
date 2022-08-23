public class TeenNumberChecker {
   public static void main(String [] args){
      /*The method should return boolean and it needs to return true if one of the parameters is in range 13(inclusive) - 19 (inclusive).
      Otherwise return false.*/
      hasTeen(9, 99, 19);
      /*should return true since 19 is in range 13 - 19*/

      hasTeen(23, 15, 42);
      /*should return true since 15 is in range 13 - 19*/

      hasTeen(22, 23, 34);
     /* should return false since numbers 22, 23, 34 are not in range 13-19*/

      isTeen(9);
      //should return false since 9 is in not range 13 - 19

      isTeen(13);
      //should return true since 13 is in range 13 - 19
   }

   public static boolean hasTeen (int one, int two ,int three){

      if(one >= 13 && one <= 19 ){
         System.out.println("true");
         return true;
      }
      if(two >= 13 && two <= 19 ){
         System.out.println("true");
         return true;
      }
      if(three >= 13 && three <= 19 ){
         System.out.println("true");
         return true;
      }
      System.out.println("false");
   return false;
   }

   public static boolean isTeen(int number ){

      if(number >=13 && number <=19){
         System.out.println("true");
         return true;
      }
      System.out.println("false");
      return false;
   }
}

