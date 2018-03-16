// takes care of the transactions of the banking account

package software_project;

import javax.swing.JOptionPane;


public class BankingSystem{
     int id;
     
     public BankingSystem(int id){
         this.id = id;
     }
     
public boolean checkAccount(Banking_account ba, double amount){
         if(ba.balance - (double) amount > 0){
             return true;
         }else{
             JOptionPane.showMessageDialog(null,"The choosen amount is too high and overdraws your account. Please choose a smaller amount.");
             return false;
         } 
     }
     
    
public void transferMoney(Banking_account ba1, Banking_account ba2, double amount){
         ba1.balance = ba1.balance - amount;
         ba2.balance = ba2.balance + amount;
         JOptionPane.showMessageDialog(null, "You transfered the amount of " + amount + " Euros successfully to " + ba2.getCst().getName()+". Thank you.");
     }
 }