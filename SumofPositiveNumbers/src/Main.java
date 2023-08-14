import java.util.Scanner;

public class Main {
public static void main(String[] args) {
	Scanner sc= new Scanner(System.in);
	System.out.println("enter size of array");
	int arr[] = new int[sc.nextInt()];
	for(int i=0;i<arr.length;i++)
	{
		arr[i] = sc.nextInt();
	}
	SumofPositiveNumbers s = new SumofPositiveNumbers();
	s.sumOfPositiveNum(arr);
}
}
