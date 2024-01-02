package ATMInterface;

// public class BankAccount extends AtmMachine {
//     int Balance=0;


// }
public class BankAccount{
    private double Balance;

    public BankAccount(double balance){
        this.Balance=balance;
    }


    public void withdraw(double amount) {
        if(amount>Balance){

            System.out.println("Insufficient Balance");
        }else{
            Balance=Balance-amount;
            System.out.println("Transaction successfull");
            System.out.println("Your balance is: "+ Balance);
        }
    }
    public void deposit(double amount) {
        if(amount<0){
            System.out.println("enter valid amount");
        }else{
            Balance=Balance+amount;
            System.out.println("Transaction successfull");
            System.out.println("Your balance is: "+ Balance);
        }
    }

    public double checkBalance() {
       return Balance;
    }
       

}