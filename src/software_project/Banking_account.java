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
public class Banking_account{
   
	String bnr;
	double balance;
        int pin;
        Customer cst;
	
	public Banking_account(Customer cst, String bnr, double balance ){
	this.bnr = bnr;
        pin = cst.pin;
	this.balance = balance;
        this.cst = cst;
	}
        

    public String getBnr() {
        return bnr;
    }

    public double getBalance() {
        return balance;
    }

    public int getPin() {
        return pin;
    }

    public Customer getCst() {
        return cst;
    }

   
        
    
    
        
}
