package com.kodnest.arrayProgramslevel3;

public class FindSum {
int findingTheSum(int arr[])
{
	int sum = 0;
	for(int i:arr)
	{
		sum = sum+i;
	}
	return sum;
}
}
