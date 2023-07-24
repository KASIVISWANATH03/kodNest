import java.util.Scanner;

public class FinanceCalculatorApp {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double p = sc.nextDouble();
		double r = sc.nextDouble();
		double t = sc.nextDouble();
		FinanceCalculator calculator = new FinanceCalculator();

		System.out.printf("%.2f",calculator.calculateSimpleInterest(p,r,t));
	}
}
