
public class LettersCount {
	void countCapitalLetters(String s1)
	{
		int countUpperCase = 0;
		int countLowerCase = 0;
		char ch[] = s1.toCharArray();
		for(char c :ch)
		{
			if((int)c>=65 && (int)c<=90)
			{
				countUpperCase++;
			}
			else if((int)c>=97 && (int)c<=122)
			{
				countLowerCase++;
			}

		}
		System.out.println("Upper Case letter count in a string "+countUpperCase);
		System.out.println("Lower Case letter coutn in a string "+countLowerCase);
	}
}
