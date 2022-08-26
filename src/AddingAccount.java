import bank.Account;
// Create a new class for a bank account
// Create fields for the account number, balance, customer name, email and phone number.
//
// Create getters and setters for each field
// Create two additional methods
// 1. To allow the customer to deposit funds (this should increment the balance field).
// 2. To allow the customer to withdraw funds. This should deduct from the balance field,
// but not allow the withdrawal to complete if their are insufficient funds.
// You will want to create various code in the Main class (the one created by IntelliJ) to
// confirm your code is working.
// Add some System.out.println's in the two methods above as well.
public class AddingAccount {

   public static void main(String[] args){


      Account ninasAccout = new Account("1232", 10000.00, "Nina Friskis","nina.is.best@ninas.se", 1212125);

      System.out.println("Ninas account is : " + ninasAccout.getNumber());
      System.out.println("Ninas got this much money in her account : " + ninasAccout.getBalance());
      System.out.println("Ninas email: " + ninasAccout.getCustomerEmailAdress() + " " + " Ninas phonenumber is : " + ninasAccout.getCustomerPhoneNumber());

      /*ninasAccout.withdrawal(10.0);*/
      ninasAccout.deposit(10000);
      ninasAccout.withdrawal(100);

      /*ninasAccout.setCustomerEmailAdress("nina.is.best@ninas.se");
      * using a construktor instead in class Account*/

   }
}
