import java.util.Scanner;

public class Main {
public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
	String nextLine = scanner.nextLine();
	Reverse reverse = new Reverse();
	System.err.println(reverse.reverseString(nextLine));
}
}
