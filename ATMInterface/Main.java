package ATMInterface;

public class Main {
    public static void main(String[] args) {
        BankAccount newAccount=new BankAccount(1000);
        AtmMachine atm=new AtmMachine(newAccount);
        atm.run();


    }
}
