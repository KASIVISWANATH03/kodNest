
public class OddNumberCounter {
void countOddNumbers(int arr[])
{
	int count = 0;
	for(int i=0;i<arr.length;i++)
	{
		if(arr[i] % 2 !=0)
		{
			count++;
		}
	}
	System.out.println("the number of odd numbers in the array is "+count);
}
}
