
public class AllSubStrings {
void allPossibleSubstrings(String s1)
{
	String s2 = "";
	
	for(int i=0;i<s1.length();i++)
	{
		String s3 = "";
		
		for(int j=i;j<s1.length();j++)
		{
			s3 = s3+s1.charAt(j);
			s2 = s2+s3+" ";
		}
		
	}
	System.out.print(s2);
}
}
