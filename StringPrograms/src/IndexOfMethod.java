import java.util.Scanner;

public class IndexOfMethod {
public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
	String nextLine = scanner.nextLine();
	System.out.println(nextLine.indexOf('a'));
	System.out.println(nextLine.indexOf('a', 2));
	System.out.println(nextLine.indexOf("viswa"));
	System.out.println(nextLine.indexOf("kasi",1));
	System.out.println(nextLine.indexOf(98));
	
	
}
}
