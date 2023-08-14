
public class FindDuplicates {
void findDuplicates(int arr[])
{
	for(int i=0;i<arr.length;i++)
	{
		for(int j=i+1;j<arr.length;j++)
		{
			if (arr[i]==arr[j])
			{
				System.out.println("duplicates present");
				return ;
			}
		}
	}
	System.out.println("duplicates not present");
}
}
