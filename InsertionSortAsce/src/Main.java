import java.util.Scanner;

public class Main {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the size of the array ");
	int arr1[] = new int[sc.nextInt()];
	System.out.println("Enter "+arr1.length+" elements of arr1 ");
	for(int i=0;i<arr1.length;i++)
	{
		arr1[i] = sc.nextInt();
	}
	Sort sort = new Sort();
	sort.insertionSort(arr1);
}
}
