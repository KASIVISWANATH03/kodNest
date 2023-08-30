
public class CountCharacters {
void countCharacters(String s1)
{
	String s2 = "";
	for(int i=0;i<s1.length();i++)
	{
		if(!s2.contains(String.valueOf(s1.charAt(i))))
		{
			s2 = s2+s1.charAt(i);
		}
	}

	for(int i=0;i<s2.length();i++)
	{
		int c = 0;
		for(int j=0;j<s1.length();j++)
		{
			if(s2.charAt(i)==s1.charAt(j))
			{
				c++;
			}
		}
		System.out.println(s2.charAt(i)+"-->"+c);
	}
}
}
