
public class Fibonacci {
	int printFibonacci(int n)
	{
	int fib1 = 0;
	int fib2 = 1;
	if(n==1)
	{
		System.out.println(fib1);
	}
	else if(n==2)
	{
		System.out.println(fib1+" "+fib2);
	}
	else
	{
		System.out.print(fib1+" "+fib2+" ");
		int i=3;
		while(i<=n)
		{
			int nextNo = fib2+fib1;
			fib1 = fib2;
			fib2 = nextNo;
			System.out.print(nextNo+" ");
			i++;
		}
	}
	return 0;
}
}
