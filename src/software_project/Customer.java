/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package software_project;

import static java.util.Arrays.equals;
import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author FT7673
 */
public class Customer extends Person{
	public int cashAmount;
        public int pin;
       
     
        public static int ccounter = 1;         // id of the customer
	
	public Customer(String name, int cashAmount, int pin){
		super(name,ccounter);
                this.pin = pin;
		this.cashAmount = cashAmount;
                ccounter = ccounter +1;
                
	}
        public int getccounter(){
            return ccounter;
        }
        public int getPin(){
            return pin;
        }
        @Override
	public String getName (){
           return super.getName();
	}

        /*
	public void insertBankingcard (ATM terminal, Banking_account ba){           brauchen wir das überhaupt?
		System.out.println("Do you insert your card(y/n)");
		Scanner scanner = new Scanner(System.in);
		String input = scanner.nextLine();
		if(input.equals("y")){
			cardins = true;
                        terminal.activeBnr = ba.bnr;
		}
		cardins = false;
	}*/

	
	public void enterPin(int pin){					//brauchen wir das?															// pin for the right account
		
	}
        
        public void withdrawCash(int amount, ATM terminal, Banking_account ba){
            BankingSystem bs = null;
            terminal.checkCashAmount();
            if( terminal.cashAmount <= amount){
                JOptionPane.showMessageDialog(null,"There is not enough money in the ATM to fullfill your request.");
            }
            else
            {
                if(bs.checkAccount(ba, amount) == true){
		cashAmount = cashAmount + amount;	
                ba.balance = ba.balance - (double) amount;
                JOptionPane.showMessageDialog(null,"The money on your account has been decreased by " + amount + "Euros and is now " + ba.balance + ".");
		terminal.cashAmount = terminal.cashAmount - amount;	
                }   
                else{
                  JOptionPane.showMessageDialog(null,"There is not enough money on the account");  
                }
            }
                															// controls if enough Cash is left
	
	}
        
        public boolean equals(Object o){
            if (this == o){
	return true;}
            if ( o == null || this.getClass () != o.getClass()){
	return false;}
            Customer c = (Customer) o;
            return this.id == c.id;
            
        }
                
}

