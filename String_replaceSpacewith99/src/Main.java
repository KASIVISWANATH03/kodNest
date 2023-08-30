import java.util.Scanner;

public class Main {
public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
	String s1 = scanner.nextLine();
	Replace replace = new Replace();
	System.out.println(replace.replaceSpaces(s1));
}
}
