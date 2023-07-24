import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter n value greater than 100");
		int n = sc.nextInt();
		if (n<100)
		{
			System.out.println("Enter the n value correctly");
		}
		else {
		NumbersDisplay nd = new NumbersDisplay();
		nd.divisible2(n);
		nd.divisible3(n);
		nd.divisible5(n);
		nd.divisible2and5(n);
		nd.divisible3and5(n);
		nd.prime(n);
		nd.evenNumberDivisible3(n);
		nd.oddNumberDivisible5(n);
		nd.evenPrime(n);
		nd.oddPrime(n);
		}
	}
}
