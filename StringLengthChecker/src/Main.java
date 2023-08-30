import java.util.Scanner;

public class Main {
public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
	String s1 = scanner.nextLine();
	String s2 = scanner.nextLine();
	LengthChecker lengthChecker = new LengthChecker();
	lengthChecker.lengthChecker(s1, s2);
}
}
