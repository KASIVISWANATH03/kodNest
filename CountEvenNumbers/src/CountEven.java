
public class CountEven {
void countEvenNumbers(int arr[])
{
	int count=0;
	for(int i=0;i<arr.length;i++)
	{
		if(arr[i]%2==0)
		{
			count++;
		}
	}
	System.out.println("num of even numbers is "+count);
}
}
