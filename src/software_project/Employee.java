/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package software_project;

/**
 *
 * @author das
 */
public class Employee extends Person{
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
