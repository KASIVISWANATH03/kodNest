
public class Reverse {
	String reverseString(String s1)
	{
		char arr[] = s1.toCharArray();
		char arr1[] = new char[arr.length];
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i] == ' ')
			{
				arr1[i] = ' ';
			}
		}
		int j=arr.length-1;
		String s2 = "";
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]==' ')
			{
				i++;
			}
			else if(arr1[j]==' ')
			{
				j--;
			}


			arr1[j] = arr[i];
			j--;

		}
		for(char ch:arr1)
		{
			s2 = s2+ch;
		}
		return s2;
	}
}
