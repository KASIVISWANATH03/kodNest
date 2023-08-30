import java.util.Scanner;

public class Main {
public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
	String nextLine = scanner.nextLine();
	RemoveDuplicates removeDuplicates = new RemoveDuplicates();
	System.out.println(removeDuplicates.removeDuplicates(nextLine));
}
}
