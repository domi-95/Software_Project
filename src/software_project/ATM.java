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
        String location;
	int serialNumber;
        static int atmCounter = 1;
	boolean usable;								// hab ich eingefügt um den ATM sperren zu können
        int activeBnr;
        
	public ATM (int amount, String location){
		this.cashAmount = amount;
		this.usable = true;
                this.location = location;
                this.serialNumber = atmCounter;
                atmCounter = atmCounter +1;
		this.checkCashAmount();
               // new gui.InsertCard().setVisible(true);
		
	}
	/*
	public void setAmount (int amount) { 			würde ich raus nehmen
		cashAmount = amount;
	}*/

    public int getCashAmount() {
        return cashAmount;
    }

    public String getLocation() {
        return location;
    }

    public int getSerialNumber() {
        return serialNumber;
    }

    public static int getAtmCounter() {
        return atmCounter;
    }

    public boolean isUsable() {
        return usable;
    }

    public int getActiveBnr() {
        return activeBnr;
    }
	
	
	
	public boolean checkCashAmount() {
		if (cashAmount < 100){
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





    