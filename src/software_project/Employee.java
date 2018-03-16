//Employye is entitled to refill the ATM when it runs out of cash
package software_project;


public class Employee extends Person{
	public Employee(String name, int pid){
		super(name,pid);
	}
	public static void refillATM (ATM terminal, int amount){																//Employee refills
		terminal.cashAmount = terminal.cashAmount + amount;
		
	}
}
