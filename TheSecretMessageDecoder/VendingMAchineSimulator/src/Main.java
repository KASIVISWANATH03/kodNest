import java.util.Scanner;

public class Main

{

public static void getProduct(String productCode)

{

// your code here
	switch (productCode)
	{
	case "P01":System.out.println("coco-cola");break;
	case "P02":System.out.println("sprite");break;
	case "P03":System.out.println("maa");break;
	case "P04":System.out.println("thumps-up");break;
	default :System.out.println("Enter the correct product code");
	}

}

public static void main(String[] args)

{
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the products code");
	String s = sc.nextLine();
	getProduct(s);
	
}

}