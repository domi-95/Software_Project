// takes care of the transactions of the banking account

package software_project;

import javax.swing.JOptionPane;


public class BankingSystem{
     private int id;
     
     public BankingSystem(int id){
         this.id = id;
     }
     
public boolean checkAccount(Banking_account ba, double amount){
         if(ba.getBalance() - (double) amount > 0){
             return true;
         }else{
             JOptionPane.showMessageDialog(null,"The choosen amount is too high and overdraws your account. Please choose a smaller amount.");
             return false;
         } 
     }
     
    
public void transferMoney(Banking_account ba1, Banking_account ba2, double amount){
         ba1.decreaseAccount(amount);
         ba2.increaseAccount(amount);
         JOptionPane.showMessageDialog(null, "You transfered the amount of " + amount + " Euros successfully to " + ba2.getCst().getName()+". Thank you.");
     }
 
public String checkBalance(Session s){
       Banking_account acc = s.getBank();
       String balance = String.valueOf(acc.getBalance());
       return balance;
}
}