import java.util.Scanner;

public class Main {
public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
	String nextLine = scanner.nextLine();
	Converter converter = new Converter();
	converter.converter(nextLine);
}
}
