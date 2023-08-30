import java.util.Scanner;

public class SplitMethod {
public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
	String nextLine = scanner.nextLine();
	String s[] = nextLine.split("a");
	for(String x:s)
	{
		System.out.println(x+" ");
	}
}
}
