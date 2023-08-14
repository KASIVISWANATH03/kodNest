package com.kodnest.arrayProgramslevel4;

import java.util.Scanner;

public class SumOfCorrespondingElements {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the size of the array ");
	int arr1[] = new int[sc.nextInt()];
	System.out.println("Enter "+arr1.length+" elements of arr1 ");
	for(int i=0;i<arr1.length;i++)
	{
		arr1[i] = sc.nextInt();
	}
	int arr2[] = new int[arr1.length];
	System.out.println("Enter "+arr2.length+" elements of arr2 ");
	for(int i=0;i<arr2.length;i++)
	{
		arr2[i] = sc.nextInt();
	}
	SumElements se = new SumElements();
	int res[] = se.sumOfCorrespondingElements(arr1, arr2);
	System.out.println("Array-1");
	for(int i:arr1)
	{
		System.out.print(i+" ");
	}
	System.out.println();
	System.out.println("Array-2");
	for(int i:arr2)
	{
		System.out.print(i+" ");
	}
	System.out.println();
	
	System.out.println("The sum of corresponding elements of the two arrays are");
	for(int i:res)
	{
		System.out.print(i+" ");
	}
}
}
