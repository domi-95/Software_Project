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

public class ATM implements Bankmachine{
	int cashAmount;
        String location;
	int serialNumber;
        static int atmCounter = 1;						
        int activeBnr;
        
	public ATM (int amount, String location){
		this.cashAmount = amount;
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

    public int getActiveBnr() {
        return activeBnr;
    }
	
	
	
	public void checkCashAmount() {
		if (cashAmount < 1000){
			JOptionPane.showMessageDialog(null,"Cash Amount is getting low. It needs to be refilled. Please call an employee");	//Informationsfeld am Bildschirm
                        String s = JOptionPane.showInputDialog(null,"How much will you fill into the ATM?");
                        int mon = Integer.parseInt(s);
                        Employee e = null;
                        
                        e.refillATM(this, mon);
		}
		
	}
        
        public void discardBankingscard(Customer name){
            activeBnr = 0;
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





    