import java.util.Scanner;

public class Main {
public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
	String s1 = scanner.nextLine();
	AllSubStrings allSubStrings = new AllSubStrings();
	allSubStrings.allPossibleSubstrings(s1);
}
}
