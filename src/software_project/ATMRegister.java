// Container Class to organize ATMs
package software_project;

import java.util.ArrayList;
import javax.swing.JOptionPane;


public class ATMRegister {
    
    
    public static ArrayList<ATM> ATMlist = new ArrayList<ATM>();
    
    static{
        ATMlist.add(new ATM(10000, "Kokkola"));
       ATMlist.add(new ATM(15000, "Tampere"));
       ATMlist.add(new ATM(12500, "Helsinki"));
    }
    
    public boolean addATM(int money, String location){
       
        if(ATMlist.add(new ATM(money, location))== true){
            JOptionPane.showMessageDialog(null, "A new ATM is added." );
            return true;
        }else{
        return false;
        }
    }
    public boolean deleteATM(int number){
        
        for (int i = 0; i < ATMlist.size(); i++){
            ATM help = ATMlist.get(i);
            
            if (help.getSerialNumber()== number ){
                ATMlist.remove(i);
                JOptionPane.showMessageDialog(null,"The chosen ATM is deleted.");
                return true;
            }
        }
        return false;
    }
}
