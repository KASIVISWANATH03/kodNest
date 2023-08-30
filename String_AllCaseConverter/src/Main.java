import java.util.Scanner;

public class Main {
public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
	String nextLine = scanner.nextLine();
	CaseConverter caseConverter = new CaseConverter();
	caseConverter.converter(nextLine);
}
}
