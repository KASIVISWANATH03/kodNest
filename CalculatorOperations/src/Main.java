import java.util.Scanner;

public class Main {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter n1 ");
	int n1 = sc.nextInt();
	System.out.println("Enter n2 ");
	int n2 = sc.nextInt();
	System.out.println("enter operator +,-,*,/,% ");
	char op = sc.next().charAt(0);
	Calculator calculator = new Calculator();
	calculator.calculator(n1, n2, op);
}
}
