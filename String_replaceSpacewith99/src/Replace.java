
public class Replace {
String replaceSpaces(String s1)
{
	String arr[] = s1.split(" ");
	
	String s2 = "";
	for(String s:arr)
	{
		s2=s2+s+"99";
	}
	String s3 = "";
	for(int i=0;i<s2.length()-2;i++)
	{
		s3=s3+s2.charAt(i);
	}
	return s3;
}
}
