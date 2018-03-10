package software_project;


import software_project.Banking_account;

public class BankingSystem{
     int id;
     
     public BankingSystem(int id){
         this.id = id;
     }
     
     public void checksBankBalance(Banking_account ba){
         System.out.println( ba.balance);
     }
     public static void transferMoney(Banking_account ba1, Banking_account ba2, double amount){
         ba1.balance = ba1.balance - amount;
         ba2.balance -= amount;
     }
 }