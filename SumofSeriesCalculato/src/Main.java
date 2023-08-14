import java.util.Scanner;

public class Main

{

public static void calculateSumOfSeries(int n)

{
double sum =0;
for(float i=1;i<=n;i++)
{
	sum = sum+(1/i);
}
System.out.printf("%.2f",sum);
}

public static void main(String[] args) {
	Scanner sc  = new Scanner(System.in);
	int n = sc.nextInt();
	calculateSumOfSeries(n);
}

}