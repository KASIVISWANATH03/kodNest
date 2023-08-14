import java.util.Scanner;

public class Main {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the array size ");
	int arr[] = new int[sc.nextInt()];
	for(int i=0;i<arr.length;i++)
	{
		arr[i] = sc.nextInt();
	}
	OddNumberCounter od = new OddNumberCounter();
	od.countOddNumbers(arr);
}
}
