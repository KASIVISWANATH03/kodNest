
public class Sort {
void insertionSort(int arr[])
{
	for(int i=1;i<=arr.length-1;i++)
	{
		int item = arr[i];
		int j = i-1;
		while(j>=0 && arr[j]>item)
		{
			arr[j+1] = arr[j];
			j--;
		}
		arr[j+1] = item;
		for(int x:arr)
		{
			System.out.print(x+" ");
		}
		System.out.println();
	}
	System.out.println("Sorted array...");
	for(int x:arr)
	{
		System.out.print(x+" ");
	}
}
}
