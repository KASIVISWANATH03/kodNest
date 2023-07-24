import java.lang.Character;
public class Main

{

public static void identifyCharacter(char ch)

{
	if(Character.isDigit(ch))
	{
		System.out.println("digit");
	}
	else if(Character.isLowerCase(ch))
	{
		if (ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u')
		{
			System.out.println("lower-case vowel");
		}
		else {
			System.out.println("lower-case consonent");
		}
	}
	else if(Character.isUpperCase(ch))
	{
		if (ch=='A' || ch=='E' || ch=='I' || ch=='O' || ch=='U')
		{
			System.out.println("upper-case vowel");
		}
		else {
			System.out.println("upper-case consonent");
		}
	}
	else
	{
		System.out.println("special symbol");
	}
	
	
// your code here

}

public static void main(String[] args)

{

identifyCharacter('/');

}

}

