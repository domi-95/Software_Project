// creates the ATM which the customer interacts with

package software_project;


import javax.swing.JOptionPane;

public final class ATM implements Bankmachine{
	int cashAmount;
        String location;
	int serialNumber;
        static int atmCounter = 1;						
        
        
	public ATM (int amount, String location){
		this.cashAmount = amount;
                this.location = location;
                this.serialNumber = atmCounter;
                atmCounter = atmCounter +1;
		this.checkCashAmount();
		
        }

    public String getLocation() {
        return location;
    }

    public int getSerialNumber() {
        return serialNumber;
    }
   public void checkCashAmount() {
		if (cashAmount < 1000){
			JOptionPane.showMessageDialog(null,"Cash Amount is getting low. It needs to be refilled. Please call an employee");	//Informationsfeld am Bildschirm
                        String s = JOptionPane.showInputDialog(null,"Question for the employee: How much will you fill into the ATM?");
                        int mon = Integer.parseInt(s);
                        Employee e = null;
                        
                        e.refillATM(this, mon);
		}
		
	}
        
        public void discardBankingscard(Session s){
            s = null;
            JOptionPane.showMessageDialog(null,"Please take your card.");
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





    