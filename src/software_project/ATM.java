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
	Bank_branch location;
        
	public ATM (int amount, int nr, boolean usable, Bank_branch location){
		this.cashAmount = amount;
		this.serialNumber = nr;
		this.usable = true;
                this.location = location;
		this.checkCashAmount(cashAmount);
		
	}
	/*
	public void setAmount (int amount) { 			würde ich raus nehmen
		cashAmount = amount;
	}*/
	
	public void withdrawCash(int amount, Customer name){
		cashAmount = cashAmount - amount;															// changes ATM Cash Amount
		name.cashAmount = name.cashAmount + amount;													// changes Customer Cash Amount
		this.checkCashAmount(cashAmount);															// controls if enough Cash is left
		 
	}
	
	public boolean checkCashAmount(int amount) {
		if (amount < 100){
			JOptionPane.showInputDialog("Cash Amount is getting low. It needs to be refilled.");	//Informationsfeld am Bildschirm
			usable = false; 																		// blockiert den ATM wenn zu wenig Cash
			return false;
		}return true;
		
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
	
	public Customer(String name, int cid, int cashAmount){
		super(name,cid);
		this.cashAmount = cashAmount;
		cardins = false;
	}
	public void insertBankingcard (){
		System.out.println("Do you insert your card(y/n)");
		Scanner scanner = new Scanner(System.in);
		String input = scanner.nextLine();
		if(input.equals("y")){
			cardins = true;
		}
		cardins = false;
	}
	
	public void takeBankingcard (){																				//card will be taken out.
		cardins = false;
	}
	
	public void enterPin(int pin){					//brauchen wir das?															// pin for the right account
		
	}
}

class Surveillance_system{
                                                                        // können wir das auch rauslassen?
	
	
}

class Bank_branch{
	String street;
	String town;
	String zip;
	
	public Bank_branch(String street, String town, String zip){
		this.street = street;
		this.town = town;
		this.zip = zip;
	}
	
}

class Banking_card{
	int pin;
	
	public Banking_card(int pin){
		this.pin = pin;
	}
}

class Banking_account{
	int id;
	double balance;
	
	public Banking_account(int aid, double balance ){
	this.id  = aid;
	this.balance = balance;
	}
}


