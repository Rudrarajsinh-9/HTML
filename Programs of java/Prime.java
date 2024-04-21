import java.util.Scanner;
public class Prime {
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int a, b, i, j, prime;

		System.out.printf("Enter strating value: ");
		a = sc.nextInt();

		System.out.printf("\nEnter ending value: ");
		b = sc.nextInt();

		System.out.printf("\nYour Prime numbers are: ", a, b);

		for (i = a; i <= b; i++) {

			if (i == 1 || i == 0)
				continue;

			prime = 1;

			for (j = 2; j <= i / 2; ++j) {
				if (i % j == 0) {
					prime = 0;
					break;
				}
			}
			if (prime == 1)
				System.out.println(i);
		}
	}
}