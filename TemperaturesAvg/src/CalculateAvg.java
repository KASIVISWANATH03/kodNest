
public class CalculateAvg {
void calculateAvg(int arr[])
{
	int sum = 0;
	for(int i=0;i<arr.length;i++)
	{
		sum = sum+arr[i];
	}
	System.out.println("the AVG of the given temperatures is "+(sum/arr.length));
}
}
