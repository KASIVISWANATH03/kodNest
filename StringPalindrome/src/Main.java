import java.util.Scanner;

public class Main {
public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
	String s1 = scanner.nextLine();
	System.out.println("string before reversing "+s1);
	Reverse reverse = new Reverse();
	String s2 = reverse.stringReverse(s1);
	System.out.println("String after reversing "+s2);
	Palindrome palindrome = new Palindrome();
	System.out.print("palindrome result ");
	System.out.println(palindrome.isPalindrome(s1, s2));
}
}
