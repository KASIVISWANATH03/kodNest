import java.util.Scanner;

public class Main

{

public static void checkDiscount(double purchaseAmount)

{ // your code here
	if (purchaseAmount>100)
	{
		System.out.println("Discount Applicable");
	}

}

public static void main(String[] args)

{
	Scanner sc = new Scanner(System.in);
	double purchaseAmount = sc.nextDouble();
	checkDiscount(purchaseAmount);
	
}

}
