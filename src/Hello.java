public class Hello {
public static void main (String[] args){
 /* int myFirstNumber = 5 * 100;
   int mySecondNumber= 12;
   int myThirdNumber = 6;
   int myTotal = myFirstNumber + mySecondNumber + myThirdNumber;
   System.out.println(myTotal);
   int myLastOne= myTotal - 1000;
   System.out.println(myLastOne); //comment ut block: ctrö + shift + slash i numpaden

   boolean isAlien = false;
   if(isAlien == false){
      System.out.println("it is not Alien");
   }
   int topScore = 100;
   if(topScore != 100){
      System.out.println("you got the topscore!");
   }
   System.out.println("oh no, sorry!");*/

   double myInt= 20.00;
   double mySecInt = 80.00;
   double addedInts = (myInt + mySecInt) * 100.00;
   double valueRemain = addedInts % 40.00;

   boolean trOfals = (valueRemain == 0) ? true: false;

   if(!trOfals){
      System.out.println("Got some remainder");
   }
   System.out.println("no remainder.");
   calculateScore(true, 800, 5, 100);
   calculateScore(true, 10000, 8, 200);


   int highScore = calculateScore(true, 80000, 5, 1000);
   System.out.println("your highest score was " + highScore);
}
//skapar en metod inuti klassen men utanför main-method

   public static int calculateScore(boolean gameOver, int score, int levelCompleted, int bonus){
//koden behöver inte variablerna i och med att värderna sätts när man kör metoden i main

   if(gameOver){
      int finalScore = score + (levelCompleted * bonus);
      finalScore +=1000;
      System.out.println("your finalscore was " + finalScore);
      return finalScore;
   }
   return -1; //negativ 1 är att betyda värde ej funnet inom data
   }
}

//forts start från kapitel 4, char 49 methods

//expressions ex namn på varaibler och dess värde, statement avslutas med semikolon.