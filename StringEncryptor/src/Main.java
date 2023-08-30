import java.util.Scanner;

public class Main {
public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
	
	String s1 = scanner.nextLine();
	int n = scanner.nextInt();
	System.out.println(encryptor(s1, n));
}
static String encryptor(String s1,int x)
{
	String s2 = "abcdefghijklmmopqrstuvwxyz";
	String s3 = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
	String s4 = "";
	String s5 = "";
	for(int i=x;i<s2.length();i++)
	{
		s4=s4+s2.charAt(i);
		s5=s5+s3.charAt(i);
	}
	for(int i=0;i<x;i++)
	{
		s4=s4+s2.charAt(i);
		s5=s5+s3.charAt(i);
	}
	
	String s6 = "";
	char arr[] = s1.toCharArray();
	for(char ch:arr)
	{
		if ((int)ch>=65 && (int)ch<=90)
		{
			s6=s6+s5.charAt(s3.indexOf(ch));
		}
		else if ((int)ch>=97 && (int)ch<=122)
		{
			s6=s6+s4.charAt(s2.indexOf(ch));
		}
		else
		{
			s6=s6+ch;
		}
	}
	return s6;
}
}
