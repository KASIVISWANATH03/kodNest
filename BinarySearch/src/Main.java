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
	System.out.println("Enter key");
	int key = sc.nextInt();
	Search search = new Search();
	int res = search.findElement(key, arr1);
	if(res==-1)
	{
		System.out.println(" not Found");
	}
	else
	{
		System.out.println("found in index "+res);
	}
	sc.close();
}
}
