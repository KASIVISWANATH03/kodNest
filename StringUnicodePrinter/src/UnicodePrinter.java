
public class UnicodePrinter {
void unicodePrinter(String s1)
{
	char ch[] = s1.toCharArray();
	System.out.println("unicode values of every character in a string is");
	for(char c:ch )
	{
		System.out.println(c+"-->"+(int)c);
	}
}
}
