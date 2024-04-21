import java.util.Scanner;
public class Odd.even {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = 1;
        while(a!=0){
            System.out.println("Enter the value of a : ");
            int a = sc.nextInt();
        }
        if(a%2==0){
            System.out.println("Number is prime");
        }
        else{
            System.out.println("number is not a prime number");
        }
        sc.close();
    }   
}

