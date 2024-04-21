import java.util.Scanner;

public class Lab3_1{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter marks of maths: ");
        double a = scan.nextDouble();
         System.out.print("Enter marks of physics: ");
        double b = scan.nextDouble();
         System.out.print("Enter marks of english: ");
        double c = scan.nextDouble();
         System.out.print("Enter marks of OOPJ: ");
        double d = scan.nextDouble();
         System.out.print("Enter marks of WD: ");
        double e = scan.nextDouble();
        double avg;
        avg = (a+b+c+d+e)/4;
        System.out.println(avg);
        if(avg>=60){
            System.out.println("Congrats! you got First Division");
        }
        else if(avg>50 && avg<59){
            System.out.println("Congrats! you got Second Divison");
        }
        else if(avg>40 && avg<49){
            System.out.println("you got Third Division");
        }
        else{
            System.out.println("Fail");
        }
    }
}