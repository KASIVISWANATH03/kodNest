
public class Sort {
void sort(int arr[])
{
	for(int i=0;i<=arr.length-2;i++)
	{
		for(int j=0;j<=arr.length-2-i;j++)
		{
			if(arr[j]>arr[j+1])
			{
				int temp = arr[j+1];
				arr[j+1] = arr[j];
				arr[j] = temp;
			}
		}
		for(int x : arr)
		{
			System.out.print(x+" ");
		}
		System.out.println();
	}
	System.out.println("sorted array is");
	for(int x : arr)
	{
		System.out.print(x+" ");
	}
	
}
}
