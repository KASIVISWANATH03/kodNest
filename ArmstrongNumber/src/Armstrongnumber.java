
public class Armstrongnumber {
	boolean checkArmstrongNumber(int n)
	{
		int original = n;
		int sum = 0;
		int count = 0;
		while(n!=0)
		{
			count=count+1;
			n=n/10;
		}
		n = original;
		while(n!=0)
		{
			int digit = n%10;
			sum = sum+(int)Math.pow(digit,count);
			n=n/10;
		}
		if (original==sum)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
}
