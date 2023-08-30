import java.util.Scanner;

public class CompareToMethod {
public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
	String s1 = scanner.next();
	String s2 = scanner.next();
//	System.out.println(s1.compareTo(s2));
	if(s1.compareTo(s2)>0)
	{
		System.out.println("s1 is greater than s2");
	}
	else if(s1.compareTo(s2)<0)
	{
		System.out.println("s2 is greater than s1");
	}
	else
	{
		System.out.println("both strings are equal");
	}
}
}
