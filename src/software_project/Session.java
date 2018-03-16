// creates a session which defines the current ATM and banking account which are used at the moment

package software_project;


public class Session {
    ATM terminal;
    Banking_account bank;
    BankingSystem system;

    public Session(ATM terminal, Banking_account bank, BankingSystem system) {
        this.terminal = terminal;
        this.bank = bank;
        this.system = system;
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

    public BankingSystem getSystem() {
        return system;
    }
    

   
    
    
}
