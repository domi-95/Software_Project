// Customer is the person who interacts with the ATM GUI
package software_project;

import javax.swing.JOptionPane;


public class Customer extends Person{
	public int cashAmount;
        public String pin;
        public static int ccounter = 1;         // ID of the customer
	
	public Customer(String name, int cashAmount, String pin){
		super(name,ccounter);
                this.pin = pin;
		this.cashAmount = cashAmount;
                ccounter = ccounter +1;
                
	}
       
        @Override
	public String getName (){
           return super.getName();
	}
        
        public boolean withdrawCash(int amount, ATM terminal, Banking_account ba, Session s){
            
            terminal.checkCashAmount();
            if( terminal.cashAmount <= amount){
                JOptionPane.showMessageDialog(null,"There is not enough money in the ATM to fullfill your request.");
                return false;
            }
            else
            {
                
                if(s.getSystem().checkAccount(ba, amount) == true){
		cashAmount = cashAmount + amount;	
                ba.balance = ba.balance - (double) amount;
                JOptionPane.showMessageDialog(null,"The money on your account has been decreased by " + amount + " Euros and is now " + ba.balance + ".");
		terminal.cashAmount = terminal.cashAmount - amount;
                return true;
                }   
                else{
                  JOptionPane.showMessageDialog(null,"There is not enough money on the account");
                  return false;
                }
            }
                															// controls if enough Cash is left
	
	}
                
}

