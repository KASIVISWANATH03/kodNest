
public  class RemoveDuplicates {
String removeDuplicates(String s)
{
	char arr[] = s.toCharArray();
	String s1 = "";
	for(char ch:arr)
	{
		int c = 0;
		for(int i=0;i<s1.length();i++)
		{
			if(s1.charAt(i)==ch)
			{
				c++;
			}
		}
		if(c==0)
		{
			s1 = s1+ch;
		}
		
		
		
	}
	return s1;
}
}
