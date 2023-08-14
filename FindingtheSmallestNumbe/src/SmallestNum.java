
public class SmallestNum {
void smallestNumber(int arr[])
{
	int min = arr[0];
	for(int i=1;i<arr.length;i++)
	{
		if(min > arr[i])
		{
			min = arr[i];
		}
	}
	System.out.println("min element is "+min);
}
}
