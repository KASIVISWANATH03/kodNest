
public class MultiplyElements {
void multiplyElements(int arr[])
{ 
	int product = 1;
	for(int i=0;i<arr.length;i++)
	{
		product = product*arr[i];
	}
	System.out.println("the product of all the elements in the array "+product);
}
}
