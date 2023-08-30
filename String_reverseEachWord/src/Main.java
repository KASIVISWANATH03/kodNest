import java.util.Scanner;

public class Main {
public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
	String s1 = scanner.nextLine();
	Reverse reverse = new Reverse();
	System.out.println(reverse.reverseEachWord(s1));
}
}
