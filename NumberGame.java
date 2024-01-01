import java.util.Scanner;

public class NumberGame{
    public static void main(String[] args){
        
        int round=0;
        int won=0;
        
        Scanner sc=new Scanner(System.in);
        
        boolean flag=true;
        while(flag){
            System.out.println("1. To play");
            System.out.println("0. Exit");
            // int value=sc.nextInt();
            switch (sc.nextInt()) {
                case 1:
                        int attempt=1;
                        round++;
                        int rand=(int) Math.round(Math.random()*100);
                        while(attempt<=3){
                                
                            // System.out.println(rand);
                            System.out.print("Guess the number: ");
                            int num=sc.nextInt();
                            if(num==rand){
                                System.out.println("Your guess is right");
                                won++;
                                break;
                            }else{
                                if(Math.abs(num-rand)>50 && num >=50){
                                    System.out.println("Your guess is too high");
                                }else if(Math.abs(num-rand)>50 && num <50){
                                    System.out.println("Your guess is too low");
                                }else{
                                    System.out.println("Your guess is close");
                                }
                                System.out.println(attempt+"/3"+" attempts completed");
                            }
                            attempt++;
                        }
                        if(attempt>3){
                            System.out.println("Sorry, you have exhausted number of attempts");
                            System.out.println("Better luck next time!!");
                        }
                    break;
                case 0:
                        System.out.println("You have won "+ won+ "/"+ round);
                        System.out.println("Thank you! See You Soon!!");
                        flag=false;
                    break;
                default:
                        System.out.println("Something went wrong");
                    break;
            }
        }
    }
}