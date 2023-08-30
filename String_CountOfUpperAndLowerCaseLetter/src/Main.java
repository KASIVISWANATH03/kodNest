import java.util.Scanner;

public class Main {
public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
	String nextLine = scanner.nextLine();
	LettersCount lettersCount = new LettersCount();
	lettersCount.countCapitalLetters(nextLine);
	
}
}
