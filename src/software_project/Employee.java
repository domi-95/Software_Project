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
	public static void refillATM (ATM terminal, int amount){																//Employee refills
		terminal.cashAmount = terminal.cashAmount + amount;
		
	}
}
