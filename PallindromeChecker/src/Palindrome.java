
public class Palindrome {
	boolean palindromeChecker(int n)
	{
		int original = n;
		int rev = 0;
		while(n!=0)
		{
			int digit = n%10;
			rev = rev*10+digit;
			n = n/10;
		}
		if (original==rev)
		{
			return true;
		}
		else {
			return false;
		}
	}
}
