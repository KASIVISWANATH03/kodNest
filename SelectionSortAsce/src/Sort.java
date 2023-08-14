
public class Sort {
void selectionSort(int arr[])
{
	int min,pos,help;
	for(int i=0;i<=arr.length-2;i++)
	{
		min = arr[i];
		pos = i;
		for(int j=i+1;j<=arr.length-1;j++)
		{
			if(min > arr[j])
			{
				min = arr[j];
				pos = j;
			}
			
		}
		//help = arr[i];
		//arr[i] = arr[pos];
		//arr[pos] = help;
		arr[i] = arr[i]+arr[pos];
		arr[pos] = arr[i]-arr[pos];
		arr[i] = arr[i]-arr[pos];
		for(int x : arr)
		{
			System.out.print(x+" ");
		}
		System.out.println();
}
	System.out.println("array after sorting");
	for(int x : arr)
	{
		System.out.print(x+" ");
	}
}
}
