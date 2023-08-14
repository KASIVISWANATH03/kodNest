import java.util.Scanner;

public class Main {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("enter n value to find factorial ");
	int n = sc.nextInt();
	Factorial f = new Factorial();
	f.findFactorial(n);
}
}
