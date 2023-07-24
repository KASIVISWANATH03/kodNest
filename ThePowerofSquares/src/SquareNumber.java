import java.util.Scanner;

public class SquareNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		System.out.println(squareNumber(n));

	}
	public static int squareNumber(int num) {
		return num*num;
	}

}
