import java.util.Scanner;

public class ToCharArray {
public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
	String nextLine = scanner.nextLine();
	char ch[] = nextLine.toCharArray();
	//System.out.println(ch);
	for(char x :ch) {
		System.out.print(x+" ");
	}
	System.out.println();
}
}
