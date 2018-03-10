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
        static int atmCounter = 1;
	boolean usable;								// hab ich eingefügt um den ATM sperren zu können
        int activeBnr;
        
	public ATM (int amount){
		this.cashAmount = amount;
		this.usable = true;
                this.serialNumber = atmCounter;
                atmCounter = atmCounter +1;
		this.checkCashAmount(cashAmount);
                new gui.InsertCard().setVisible(true);
		
	}
	/*
	public void setAmount (int amount) { 			würde ich raus nehmen
		cashAmount = amount;
	}*/
	
	
	
	public boolean checkCashAmount(int amount) {
		if (amount < 100){
			JOptionPane.showMessageDialog(null,"Cash Amount is getting low. It needs to be refilled.");	//Informationsfeld am Bildschirm
			usable = false; 																		// blockiert den ATM wenn zu wenig Cash
			return false;
		}return true;
		
	}
        
        public void discardBankingscard(Customer name){
            name.takeBankingcard();
            activeBnr = 0;
        }

	
}

abstract class Person {                     // oder als interface deklarieren?
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
    