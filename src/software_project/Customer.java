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
	public boolean cardins;
        public int pin;
        String name;
     
        public static int ccounter = 1;         // id of the customer
	
	public Customer(String name, int cashAmount, int pin){
		super(name,ccounter);
                this.pin = pin;
		this.cashAmount = cashAmount;
		cardins = false;
                ccounter = ccounter +1;
                
	}
        public int getccounter(){
            return ccounter;
        }
        public int getPin(){
            return pin;
        }
        
	public void insertBankingcard (ATM terminal, Banking_account ba){
		System.out.println("Do you insert your card(y/n)");
		Scanner scanner = new Scanner(System.in);
		String input = scanner.nextLine();
		if(input.equals("y")){
			cardins = true;
                        terminal.activeBnr = ba.bnr;
		}
		cardins = false;
	}
	
	public void takeBankingcard (){																				//card will be taken out.
		cardins = false;
	}
	
	public void enterPin(int pin){					//brauchen wir das?															// pin for the right account
		
	}
        
        public void withdrawCash(int amount, ATM terminal){
		cashAmount = cashAmount + amount;	
               
                JOptionPane.showMessageDialog(null,"Your cash amount has risen by " + amount + "Euros and is now " + cashAmount+ ".");
		terminal.cashAmount = terminal.cashAmount - amount;													// changes Customer Cash Amount
		terminal.checkCashAmount(cashAmount);															// controls if enough Cash is left
		 
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

