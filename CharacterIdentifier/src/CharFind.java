
import java.util.Scanner;

public class CharFind {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the character to check it is digit or vowel or consonent");
		char ch = sc.next().charAt(0);
		identify(ch);
		
	}
	public static void identify(char ch)
	{
		if(Character.isDigit(ch))
		{
			System.out.println("Entered character is digit");
			
		}
		else if(!Character.isLetter(ch))
		{
			System.out.println("Entered charecter is a special symbol");
		}
		else
		{
			switch(Character.toLowerCase(ch))
			{
			case 'a':
			case 'e':
			case 'i':
			case 'o':
			case 'u':
				if (Character.isLowerCase(ch))
				{
					System.out.println("Entered character is lowercase vowel");
				}
				else
				{
					System.out.println("Entered character is uppercase vowel");
				}
				break;
			default:
				if (Character.isLowerCase(ch))
				{
					System.out.println("Entered character is lowercase consonent");
				}
				else
				{
					System.out.println("Entered character is uppercase consonent");
				}
			}
		}
	}
}
