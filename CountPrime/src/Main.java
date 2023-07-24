import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		prime(n);
		
	}
	public static void prime(int n)
	{
		
		System.out.println("The prime numbers from 1 to "+n);
		int count  = 0;
		for(int i=3;i<=n;i++)
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
				count++;
				System.out.print(i+" ");
			}
		}
		System.out.println();
		System.out.println("the number of prime numbers from 1 to "+n+" is "+count);
		
	}
}
