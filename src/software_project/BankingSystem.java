package software_project;


import javax.swing.JOptionPane;
import software_project.Banking_account;

public class BankingSystem{
     int id;
     
     public BankingSystem(int id){
         this.id = id;
     }
     
     public void checksBankBalance(Banking_account ba){
         System.out.println( ba.balance);
     }
     
     public boolean checkAccount(Banking_account ba, int amount){
         if(ba.balance - (double) amount > 0){
             return true;
         }
         return false;
     }
     
    
     public void transferMoney(Banking_account ba1, Banking_account ba2, double amount){
         ba1.balance = ba1.balance - amount;
         ba2.balance = ba2.balance + amount;
         JOptionPane.showMessageDialog(null, "You transfered the amount of " + amount + " Euros successfully to " + ba2.getCst().getName()+". Thank you.");
     }

 }