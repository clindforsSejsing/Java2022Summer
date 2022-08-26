package bank;
// Create a new class for a bank account
// Create fields for the account number, balance, customer name, email and phone number.
//
// Create getters and setters for each field **(code- generate i menyn)**
// Create two additional methods
// 1. To allow the customer to deposit funds (this should increment the balance field).
// 2. To allow the customer to withdraw funds. This should deduct from the balance field,
// but not allow the withdrawal to complete if their are insufficient funds.
// You will want to create various code in the Main class (the one created by IntelliJ) to
// confirm your code is working.
// Add some System.out.println's in the two methods above as well.
public class Account {

   private String number;
   private double balance;
   private String customerName;
   private String customerEmailAdress;
   private int customerPhoneNumber;
   public Account(){
      System.out.println("this is an empty constructor");
      //uses to initials the object
   }

   public Account(String number, double balance, String customerName, String customerEmailAdress, int customerPhoneNumber){
      //made another cunstructor and overload it by using the same name but with parameters,

      System.out.println("Account constructor with parameters called.");

      this.number = number;
      this.balance = balance;
      this.customerName = customerName;
      this.customerEmailAdress = customerEmailAdress;
      this.customerPhoneNumber = customerPhoneNumber;
   }



   public void deposit(double depositAmount){
      //this reffering to object Account and its variables
      this.balance += depositAmount;
      System.out.println("Deposit of " + depositAmount + " made. New balance is: " + this.balance);
   }

   public void withdrawal(double withdrawalAmount){
      if(this.balance - withdrawalAmount < 0){
         System.out.println(this.balance + "is available. Withdrawal not able.");
      }else {
         this.balance-=withdrawalAmount;
         System.out.println("withdrawal of " + withdrawalAmount + "processed. Remaining amount is" + this.balance);
      }
   }

   public String getNumber() {
      return number;
   }

   public void setNumber(String number) {
      this.number = number;
   }

   public double getBalance() {
      return balance;
   }

   public void setBalance(double balance) {
      this.balance = balance;
   }

   public String getCustomerName() {
      return customerName;
   }

   public void setCustomerName(String customerName) {
      this.customerName = customerName;
   }

   public String getCustomerEmailAdress() {
      return customerEmailAdress;
   }

   public void setCustomerEmailAdress(String customerEmailAdress) {
      this.customerEmailAdress = customerEmailAdress;
   }

   public int getCustomerPhoneNumber() {
      return customerPhoneNumber;
   }

   public void setCustomerPhoneNumber(int customerPhoneNumber) {
      this.customerPhoneNumber = customerPhoneNumber;
   }
}
