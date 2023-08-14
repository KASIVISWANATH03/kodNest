import java.util.Scanner;

public class Main {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	double puchaseAmount = sc.nextDouble();
	double  tax = sc.nextDouble();
	CalculateTotalWithTax ct = new CalculateTotalWithTax();
	ct.calculateTotalWithTax(puchaseAmount, tax);
}
}
