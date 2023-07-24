import java.util.Scanner;

public class HalveTheNumber {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double n = sc.nextDouble();
		System.out.printf("%.2f",halveTheNumber(n));
	}
	public static double halveTheNumber(double num)
	{
		return num/2;
	}
}
