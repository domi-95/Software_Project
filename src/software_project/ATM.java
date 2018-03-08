/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package software_project;

/**
 *
 * @author FT7673
 */

    import java.util.Scanner;

import javax.swing.JOptionPane;

public class ATM {
	int cashAmount;
	int serialNumber;
	boolean usable;								// hab ich eingefügt um den ATM sperren zu können
        int activeBnr;
        
	public ATM (int amount, int nr, boolean usable){
		this.cashAmount = amount;
		this.serialNumber = nr;
		this.usable = true;
		this.checkCashAmount(cashAmount);
		
	}
	/*
	public void setAmount (int amount) { 			würde ich raus nehmen
		cashAmount = amount;
	}*/
	
	
	
	public boolean checkCashAmount(int amount) {
		if (amount < 100){
			JOptionPane.showInputDialog("Cash Amount is getting low. It needs to be refilled.");	//Informationsfeld am Bildschirm
			usable = false; 																		// blockiert den ATM wenn zu wenig Cash
			return false;
		}return true;
		
	}
        
        public void discardBankingscard(Customer name){
            name.takeBankingcard();
            activeBnr = 0;
        }

	
}

abstract class Person {
	public int id;
	public String name;
	
	
	public Person(String name, int id){
		this.id = id;
		this.name =name;
	}
}

class Manager extends Person{
	
	public Manager(String name, int pid){
		super(name,pid);
	}
	
	public int defineCashAmount(ATM terminal){
		
		int amount;
		amount = (terminal.cashAmount -1000)*-1;																	// to have 1000 Euro Cash
		
		return amount;
		
	}
}

class Employee extends Person{
	public Employee(String name, int pid){
		super(name,pid);
	}
	public boolean refillATM (ATM terminal, int amount){																//Employee refills
		terminal.cashAmount = terminal.cashAmount + amount;
		if (terminal.checkCashAmount(terminal.cashAmount) == true){
			terminal.usable = true;																					// ATM is usable again
			return true;
		}else{
			amount = (terminal.cashAmount -1000)*-1;
			refillATM(terminal,amount );																			// Recursion
		}
		return true;				
	}
}

class Customer extends Person{
	public int cashAmount;
	public boolean cardins;
        public int pin;
        String name;
	
	public Customer(String name, int cid, int cashAmount, int pin){
		super(name,cid);
                this.pin = pin;
		this.cashAmount = cashAmount;
		cardins = false;
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
		cashAmount = cashAmount + amount;															// changes ATM Cash Amount
		terminal.cashAmount = terminal.cashAmount + amount;													// changes Customer Cash Amount
		terminal.checkCashAmount(cashAmount);															// controls if enough Cash is left
		 
	}
        
        
}


class Banking_account{
	int bnr;
	double balance;
        int pin;
        Customer cst;
	
	public Banking_account(Customer cst, int bnr, double balance ){
	this.bnr = bnr;
        pin = cst.pin;
	this.balance = balance;
	}
}

 class BankingSystem{
     int id;
     
     public BankingSystem(int id){
         this.id = id;
     }
     
     public void checksBankBalance(Banking_account ba){
         System.out.println( ba.balance);
     }
     public void transferMoney(Banking_account ba1, Banking_account ba2, double amount){
         ba1.balance = ba1.balance - amount;
         ba2.balance -= amount;
     }
 }
    