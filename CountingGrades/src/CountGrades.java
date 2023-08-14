
public class CountGrades {
void countGrades(int arr[])
{
	int count =0;
	for(int i=0;i<arr.length;i++)
	{
		if(arr[i]>=75)
		{
			count++;
		}
	}
	System.out.println("The number of grades greater than or equal 75 is "+count);
}
}
