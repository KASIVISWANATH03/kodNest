import java.util.Scanner;

public class PlanetExploreApp {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double rad = sc.nextDouble();
		PlanetExplorer explorer = new PlanetExplorer();

		System.out.printf("%.2f",explorer.calculateSurfaceArea(rad));
	}
}
