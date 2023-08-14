package com.kodnest.arrayProgramslevel2;

public class PrintArray {
void printForward(int arr[])
{
	System.out.println("The elements of array in forward direction ");
	for(int i:arr)
	{
		System.out.print(i+" ");
	}
	System.out.println();
}
void printbackward(int arr[])
{
	System.out.println("The elements of array in backward direction ");
	for(int i=arr.length-1;i>=0;i--)
	{
		System.out.print(arr[i]+" ");
	}
}
}
