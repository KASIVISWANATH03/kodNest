
public class DivisorCalculator {
void divisorCalculator(int n)
{
	int count = 0;
	for(int i=1;i<=n;i++)
	{
		if(n%i==0)
		{
			count++;
		}
	}
	System.out.println(count);
}
}
