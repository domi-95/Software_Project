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
	int bnr;
	double balance;
        int pin;
        Customer cst;
	
	public Banking_account(Customer cst, int bnr, double balance ){
	this.bnr = bnr;
        pin = cst.pin;
	this.balance = balance;
        this.cst = cst;
	}
        

    public int getBnr() {
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
