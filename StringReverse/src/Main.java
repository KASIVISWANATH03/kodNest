import java.util.Scanner;

public class Main {
public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
	String s1 = scanner.nextLine();
	System.out.println("string before reversing "+s1);
	Reverse reverse = new Reverse();
	System.out.println("String after reversing "+reverse.stringReverse(s1));
	
}
}
