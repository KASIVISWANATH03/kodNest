
public class NumbersDisplay {
void divisible2(int n){
	System.out.println("The numbers divisible by 2 from 1 to "+n);
	for(int i=1;i<=n;i++)
	{
		if(i%2==0)
		{
			System.out.print(i+" ");
		}
	}
	
}

void divisible3(int n){
	System.out.println();
	System.out.println("The numbers divisible by 3 from 1 to "+n);
	for(int i=1;i<=n;i++)
	{
		if(i%3==0)
		{
			System.out.print(i+" ");
		}
	}
	
}

void divisible5(int n){
	System.out.println();
	System.out.println("The numbers divisible by 5 from 1 to "+n);
	for(int i=1;i<=n;i++)
	{
		if(i%5==0)
		{
			System.out.print(i+" ");
		}
	}
	
}

void divisible2and5(int n){
	System.out.println();
	System.out.println("The numbers divisible by 2 and 5 from 1 to "+n);
	for(int i=1;i<=n;i++)
	{
		if(i%2==0 && i%5==0)
		{
			System.out.print(i+" ");
		}
	}
	
}

void divisible3and5(int n){
	System.out.println();
	System.out.println("The numbers divisible by 3 and comes in table of 5 from 1 to "+n);
	for(int i=1;i<=n;i++)
	{
		if(i%3==0 && i%5==0)
		{
			System.out.print(i+" ");
		}
	}
	
}

void prime(int n)
{
	System.out.println();
	System.out.println("The prime numbers from 1 to "+n);
	for(int i=1;i<=n;i++)
	{
		int c = 0;
		for(int j=2;j<i;j++)
		{
			if(i%j==0)
			{
				c = 1;
				break;
			}
		}
		if (c==0)
		{
			System.out.print(i+" ");
		}
	}
	
}

void evenNumberDivisible3(int n){
	System.out.println();
	System.out.println("The even numbers divisible by 3 from 1 to "+n);
	for(int i=1;i<=n;i++)
	{
		if(i%2==0 && i%3==0)
		{
			System.out.print(i+" ");
		}
	}
	
}

void oddNumberDivisible5(int n){
	System.out.println();
	System.out.println("The odd numbers divisible by 5 from 1 to "+n);
	for(int i=1;i<=n;i++)
	{
		if(i%2!=0 && i%5==0)
		{
			System.out.print(i+" ");
		}
	}
	
}

void evenPrime(int n)
{
	System.out.println();
	System.out.println("The even prime numbers from 1 to "+n);
	for(int i=1;i<=n;i++)
	{
		int c = 0;
		for(int j=2;j<i;j++)
		{
			if(i%j==0)
			{
				c = 1;
				break;
			}
		}
		if (c==0 && i%2==0)
		{
			System.out.print(i+" ");
		}
	}
	
}

void oddPrime(int n)
{
	System.out.println();
	System.out.println("The odd prime numbers from 1 to "+n);
	for(int i=1;i<=n;i++)
	{
		int c = 0;
		for(int j=2;j<i;j++)
		{
			if(i%j==0)
			{
				c = 1;
				break;
			}
		}
		if (c==0 && i%2!=0)
		{
			System.out.print(i+" ");
		}
	}
	
}


}
