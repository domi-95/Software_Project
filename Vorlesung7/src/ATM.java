public class ATM {
	int cashAmount;
	int serialNumber;
	
	public ATM (int amount, int nr){
		cashAmount = amount;
		serialNumber = nr;
		
	}
	
	public void setAmount (int amount) {
		cashAmount = amount;
	}
}

class Banking_system {
	public int id;
	
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
	
	public void defineCashAmount(ATM atm, int amount){
		atm.setAmount(amount);
	}
}

class Employee extends Person{
	public Employee(String name, int pid){
		super(name,pid);
	}
}

class Customer extends Person{
	public Customer(String name, int cid){
		super(name,cid);
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