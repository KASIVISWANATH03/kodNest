import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number two revese ");
		int n = sc.nextInt();
		ReverseANumber rn = new ReverseANumber();
		int res = rn.reveseNumber(n);
		System.out.println("The revese of a number "+n+" is "+res);
		
	}
}
