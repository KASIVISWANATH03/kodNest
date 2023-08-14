
public class Main {
public static void main(String[] args) {
	int arr[] = {86,42,23,18,25};
	SearchingSortingtechnique s = new SearchingSortingtechnique();
	s.bubbleSort(arr);
	for(int x:arr)
	{
		System.out.print(x+" ");
	}
	System.out.println();
	int arr1[] = {86,43,23,18,25};
	
	s.selectionSort(arr1);
	for(int x:arr1)
	{
		System.out.print(x+" ");
	}
	System.out.println();
	int arr2[] = {86,42,23,19,25};
	s.insertionSort(arr2);
	for(int x:arr2)
	{
		System.out.print(x+" ");
	}
	System.out.println();
	int key = 86;
	System.out.println(s.binarySearch(arr2, key));
}
}
