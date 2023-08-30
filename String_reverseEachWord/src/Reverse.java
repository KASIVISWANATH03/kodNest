
public class Reverse {
String reverseEachWord(String s1)
{

	String arr[] = s1.split(" ");
	String rev = "";
	for(String s:arr)
	{
		for(int i=s.length()-1;i>=0;i--)
		{
			rev = rev+s.charAt(i);
		}
		rev = rev+" ";
	}
	return rev.trim();
	
}
}
