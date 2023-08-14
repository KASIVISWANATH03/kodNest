
public class CalculateFactorialSum {
void calculateFactorialSum(int n)
{
	int sum = 0;
	for(int i=1;i<=n;i++)
	{
		int product = 1;
		for(int j=1;j<=i;j++)
		{
			product = product*j;
		}
		sum = sum+product;
	}
	System.out.println(sum);
}
}
