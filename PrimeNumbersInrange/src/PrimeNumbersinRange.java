
public class PrimeNumbersinRange {
void printPrimeNumbers(int start,int end)
{
	for(int i=start;i<=end;i++)
	{
		boolean c = true;
		for(int j=2;j<i;j++)
		{
			if(i%j==0)
			{
				c=false;
				break;
			}
		}
		if(c)
		{
			System.out.print(i+" ");
		}
	}
}
}
