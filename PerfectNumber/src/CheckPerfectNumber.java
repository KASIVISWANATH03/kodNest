
public class CheckPerfectNumber {
void checkPerfectNumber(int n)
{
	int sum=0;
	for(int i=1;i<n;i++)
	{
		if(n%i==0)
		{
			sum=sum+i;
			
		}
	}
	if(sum==n)
	{
		System.out.println("given number is perfect number");
	}
	else
	{
		System.out.println("given number is not perfect number");
	}
}
}
