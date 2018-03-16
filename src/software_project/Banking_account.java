//holds the information about the Banking Account which is associate with a customer
package software_project;

public class Banking_account{
   
	String bnr;
	double balance;
        String pin;
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

    public String getPin() {
        return pin;
    }

    public Customer getCst() {
        return cst;
    }

   
        
    
    
        
}
