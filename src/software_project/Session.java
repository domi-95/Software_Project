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
public class Session {
    ATM terminal;
    Banking_account bank;

    public Session(ATM terminal, Banking_account bank) {
        this.terminal = terminal;
        this.bank = bank;
    }

    public ATM getTerminal() {
        return terminal;
    }

    public Banking_account getBank() {
        return bank;
    }

    public void setBank(Banking_account bank) {
        this.bank = bank;
    }

   
    
    
}
