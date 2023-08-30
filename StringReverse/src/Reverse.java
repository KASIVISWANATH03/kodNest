
public class Reverse {
String stringReverse(String s1)
{
	char arr1[] = s1.toCharArray();
	char arr2[] = new char[arr1.length];
	int j=arr1.length-1;
	for(int i=0;i<=arr1.length-1;i++)
	{
		arr2[i] = arr1[j];
		j--;
	}
	String s2 = new String(arr2);
//	String s2 = "";
//	for(int i=arr1.length-1;i>=0;i--)
//	{
//		s2=s2+arr1[i];
//	}
	return s2;
	
}
}
