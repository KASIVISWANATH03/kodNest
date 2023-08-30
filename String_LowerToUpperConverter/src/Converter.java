
public class Converter {
	void converter(String s1)
	{
		String s2 = "";
		char ch[] = s1.toCharArray();
		for(char c :ch)
		{
			if((int)c>=97 && (int)c<=122)
			{
				s2 = s2+(char)((int)c-32);
			}
			else
			{
				s2 = s2+c;
			}
			
		}
		System.out.println("Original String "+s1);
		System.out.println("String after converting all the lowercase letters to uppercase letters is "+s2);
	}
}
