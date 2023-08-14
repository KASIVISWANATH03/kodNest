import java.util.Scanner;

public class Main {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int start = sc.nextInt();
	int end = sc.nextInt();
	PrimeNumbersinRange pr = new PrimeNumbersinRange();
	pr.printPrimeNumbers(start, end);
}
}
