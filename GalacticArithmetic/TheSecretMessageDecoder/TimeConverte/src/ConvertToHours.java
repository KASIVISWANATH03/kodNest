import java.util.Scanner;

public class ConvertToHours {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int min = sc.nextInt();
		System.out.println(convertToHours(min));
	}
	public static double convertToHours(int minutes)
	{
		return minutes/60.0;
	}
}
