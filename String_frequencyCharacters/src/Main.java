import java.util.Scanner;

public class Main {
public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
	String s = scanner.nextLine();
	CountCharacters countCharacters = new CountCharacters();
	countCharacters.countCharacters(s);
}
}