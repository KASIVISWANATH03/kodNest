import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number to check whether it is armstrong number or not..");
		int n = sc.nextInt();
		Armstrongnumber armstrongnumber = new Armstrongnumber();
		if(armstrongnumber.checkArmstrongNumber(n))
		{
			System.out.println("entered number "+n+" is a armstrong number..");
		}
		else
		{
			System.out.println("entered number "+n+" is not a armstrong number..");
		}
		sc.close();
	}
}
