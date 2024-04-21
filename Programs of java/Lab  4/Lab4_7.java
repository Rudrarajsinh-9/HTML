import java.util.Scanner;
public class Lab4_7
{
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String userInput = scanner.nextLine();
        printPyramid(userInput);
    }
public static void printPyramid(String inputString) 
    {
        for (int i = 1; i <= inputString.length(); i++) 
        {
            System.out.println(inputString.substring(0, i));
        }
    }
}
 