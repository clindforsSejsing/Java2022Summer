public class BarkingDog {
//if the dog barks before 8 or after 22 return true, if hourOfday is less than 0 but greater than 23, return false.
   //need to be in range 0-23
   public static void main(String[] args) {

      shouldWakeUp(true, 1);
      shouldWakeUp(false, 2);
      shouldWakeUp(true, 8);
      shouldWakeUp(true, -1);
      shouldWakeUp(true, 44);
      shouldWakeUp(true, 0);
   }
//if the dog barks before 8 and after 23. range 0-23.
   public static boolean shouldWakeUp(boolean barking, float hourOfDay) {
      if (barking && hourOfDay < 8 && hourOfDay >= 0) {
         //barking- true, mindre än 8 men större än 0.
         System.out.println("true");
         return true;
      } else if(barking && hourOfDay > 22 && hourOfDay < 23){
         System.out.println("true");
         return true;
      }
      else  {
         System.out.println("false");
         return false;
      }
   }
}
