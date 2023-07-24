import java.util.Scanner;

public class CubeNumber {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		System.out.println(cubeNumber(n));

	}
	public static int cubeNumber(int num) {
		return num*num*num;
	}
}
