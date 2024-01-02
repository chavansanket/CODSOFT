package ATMInterface;

import java.util.Scanner;

public class AtmMachine {
    BankAccount account;

    public AtmMachine(BankAccount account){
        this.account=account;
    }

    public void run(){
        
        Scanner sc=new Scanner(System.in);
        boolean flag=false;
            while(!flag){
                
                System.out.println("1. To check Balance");
                System.out.println("2. To withdraw amount");
                System.out.println("3. To deposit amount");
                System.out.println("0. To Exit");
                
                switch (sc.nextInt()) {
                    case 1:
                        System.out.println(account.checkBalance());
                        break;
                    case 2:
                        System.out.print("Enter amount to withdraw: ");
                        account.withdraw(sc.nextDouble());
                        break;
                    case 3:
                        System.out.print("Enter amount to deposit: ");
                        account.deposit(sc.nextDouble());
                        break;
                    case 0:
                        flag=true;
                        System.out.println("Thank you visit again");
                        break;
                    default:
                        System.out.println("Server Issue! Please try again!!");
                        break;
                }
            }
    }
    

        
    
}
