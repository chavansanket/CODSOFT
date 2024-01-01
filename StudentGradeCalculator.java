import java.util.Scanner;

public class StudentGradeCalculator {
    public static void main(String[] args){
        StudentGradeCalculator.method();        

    }

    public static void method(){
        int sub1,sub2,sub3,sub4,sub5;   
        Scanner sc=new Scanner(System.in);
        System.out.println("Please enter your name");
        String name= sc.nextLine();
        System.out.print("Enter marks obtained in sub1: ");
        sub1=sc.nextInt();
        while(sub1<0 || sub1>100){
            System.out.print("Please enter valid marks: ");
            sub1=sc.nextInt();
        }

        System.out.print("Enter marks obtained in sub2: ");
        sub2=sc.nextInt();
        while(sub2<0 || sub2>100){
            System.out.print("Please enter valid marks: ");
            sub2=sc.nextInt();
        }

        System.out.print("Enter marks obtained in sub3: ");
        sub3=sc.nextInt();
        while(sub3<0 || sub3>100){
            System.out.print("Please enter valid marks: ");
            sub3=sc.nextInt();
        }

        System.out.print("Enter marks obtained in sub4: ");
        sub4=sc.nextInt();
        while(sub4<0 || sub4>100){
            System.out.print("Please enter valid marks: ");
            sub4=sc.nextInt();
        }

        System.out.print("Enter marks obtained in sub5: ");
        sub5=sc.nextInt();
        while(sub5<0 || sub5>100){
            System.out.print("Please enter valid marks: ");
            sub5=sc.nextInt();
        }

        int total=sub1+sub2+sub3+sub4+sub5;
        // System.out.println(total);
        double percentage=(total*100/500.0);
        System.out.println(percentage);
        String grade;
        if(percentage>=90){
            grade="O";    
        }else if(percentage>=80 && percentage<90){
            grade="+A";
        }else if(percentage>=70 && percentage<80){
            grade="A";
        }else if(percentage>=60 && percentage<70){
            grade="+B";
        }else if(percentage>=50 && percentage<60){
            grade="B";
        }else if(percentage>=35 && percentage<50){
            grade="C";
        }else{
            grade="F";
        }
        System.out.println("Dear "+name+" your result is as below: ");
        System.out.println("Total marks obtained: "+ total+" /"+"500");
        System.out.println("Your Percentage: "+ percentage);
        System.out.println("Your Grade: "+ grade);
    }
}

