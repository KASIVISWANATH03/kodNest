import java.util.Scanner;
public class JourneyCalculatorApp {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double speed = sc.nextDouble();
		double time = sc.nextDouble();
		JourneyCalculator jc = new JourneyCalculator();
		double res = jc.calculateDistance(60,1.5);
		System.out.printf("%.2f",res);
	}

}
