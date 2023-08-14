import java.util.Scanner;

public class Main {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int n = sc.nextInt();
	Palindrome palindrome = new Palindrome();
	if(palindrome.palindromeChecker(n))
	{
		System.out.println("Entered number "+n+" is a palindrome");
	}
	else
	{
		System.out.println("Entered number "+n+" is not a palindrome");
	}
}
}
