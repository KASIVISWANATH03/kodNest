import java.util.Scanner;

public class Main {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int n = sc.nextInt();
	Fibonacci f = new Fibonacci();
	int res = f.printFibonacci(n);
}
}
