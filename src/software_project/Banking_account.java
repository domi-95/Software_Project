//holds the information about the Banking Account which is associate with a customer
package software_project;

public class Banking_account{
   
	private String bnr;
	private double balance;
        private String pin;
        private Customer cst;
	
	public Banking_account(Customer cst, String bnr, double balance ){
	this.bnr = bnr;
        pin = cst.getPin();
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
    public void decreaseAccount(double amount){
        this.balance = this.balance - amount;
    }
    public void increaseAccount(double amount){
        this.balance = this.balance + amount;
    }

   
        
    
    
        
}
