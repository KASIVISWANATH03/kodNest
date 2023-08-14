
public class Factorial {
void findFactorial(int n)
{
	int product = 1;
	for(int i=1;i<=n;i++)
	{
		product = product*i;
		
	}
	System.out.println("the factorial of given number is "+product);
}
}
