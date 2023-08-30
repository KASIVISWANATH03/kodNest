
public class Converter {
void converter(String s1)
{
	String s2 = "";
	char ch[] = s1.toCharArray();
	for(char c :ch)
	{
		if((int)c>=65 && (int)c<=90)
		{
			s2 = s2+(char)((int)c+32);
		}
		else
		{
			s2 = s2+c;
		}
		
	}
	System.out.println("Original String "+s1);
	System.out.println("String after converting all the uppercase letters to lowercase letters is "+s2);
}
}
