import java.util.Scanner;
public class Add{
    public static void main(String[] args){
        Scanner Scan = new  Scanner(System.in);
        System.out.println("Enter 1st number: ");
        int a = Scan.nextInt();
        System.out.println("Enter 2nd number: ");
        int b = Scan.nextInt();
        System.out.print("Addition of "+a+" and "+b+" ");
    }
}