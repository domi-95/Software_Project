/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package software_project;

import static software_project.ATM.atmCounter;

/**
 *
 * @author das
 */
public interface Bankmachine {
    
    public void checkCashAmount();
    
    public int getCashAmount();

    public String getLocation();

    public int getSerialNumber();

    public int getActiveBnr();
}
