
public class FindPrimeNumbers {
void findNumbersInArray(int arr[])
{
	System.out.println("the prime numbers in the array ");
	for(int i=0;i<arr.length;i++)
	{
		boolean c = true;
		for(int j=2;j<arr[i];j++)
		{
			if(arr[i]%j==0)
			{
				c = false;
				break;
			}
			
		}
		if(c)
		{
			System.out.print(arr[i]+" ");
		}
	}
}
}
