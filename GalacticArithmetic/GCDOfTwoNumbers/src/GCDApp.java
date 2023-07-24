import java.util.Scanner;

public class GCDApp {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter two numbers to find the GCD ");
	int m = sc.nextInt();
	int n = sc.nextInt();
	//GCD gcd = new GCD();
	int res = GCD.findGCD(m,n);
	System.out.println("The GCD of "+m+" and "+n+" is "+res);
}
}
