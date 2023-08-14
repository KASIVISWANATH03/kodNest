import java.util.Scanner;

public class Main {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the size of array ");
	int arr[] = new int[sc.nextInt()];
	for(int i=0;i<arr.length;i++)
	{
		arr[i] = sc.nextInt();
	}
	FindPrimeNumbers f = new FindPrimeNumbers();
	f.findNumbersInArray(arr);
}
}
