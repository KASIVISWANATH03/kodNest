import java.util.Scanner;

public class Main {
public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
	String nextLine = scanner.nextLine();
	String nextLine2 = scanner.nextLine();
	StringConcate stringConcate = new StringConcate();
	System.out.println(stringConcate.concateStrings(nextLine, nextLine2));
	
}
}
