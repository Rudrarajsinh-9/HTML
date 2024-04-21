import java.util.Scanner;
public class Oddeven {

        public static void main(String[] args){
            Scanner sc = new Scanner(System.in);
            int a = 1;
            while(a!=0){
                System.out.println("Enter the value of a : ");
                 a = sc.nextInt();
                 if(a%2==0){
                    System.out.println("Number is even");
                }
                else{
                    System.out.println("number is odd");
                }

            }
        }   
    }  
