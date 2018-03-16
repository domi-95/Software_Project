//Interface defines necessary methods for ATM

package software_project;


public interface Bankmachine {
    
    public void checkCashAmount();

    public String getLocation();

    public int getSerialNumber();
    
    public int getCashAmount();
    
    public void decreaseCashAmount(int cashAmount);
    
    public void increaseCashAmount(int cashAmount);

    
}
