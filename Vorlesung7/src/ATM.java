import javax.swing.JOptionPane;

public class ATM {
	int cashAmount;
	int serialNumber;
	boolean usable;								// hab ich eingefügt um den ATM sperren zu können
	
	public ATM (int amount, int nr, boolean usable){
		cashAmount = amount;
		serialNumber = nr;
		usable = true;
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
	
	public void defineCashAmount(ATM terminal, int amount){
		
	}
}

class Employee extends Person{
	public Employee(String name, int pid){
		super(name,pid);
	}
	public void refillATM (ATM terminal, int amount){																//Employee refills
		terminal.cashAmount = terminal.cashAmount + amount;
		if (terminal.checkCashAmount(terminal.cashAmount) == true){
			terminal.usable = true;																					// ATM is usable again
		}else{
			JOptionPane.showInputDialog("")
		};
	}
}

class Customer extends Person{
	public int cashAmount;

	public Customer(String name, int cid, int cashAmount){
		super(name,cid);
		this.cashAmount = cashAmount;
	}
}

class Surveillance_system{
	
	
	
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