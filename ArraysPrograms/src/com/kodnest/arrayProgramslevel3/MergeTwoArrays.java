package com.kodnest.arrayProgramslevel3;

import java.util.Scanner;

public class MergeTwoArrays {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the size of first array ");
	int arr1[] = new int[sc.nextInt()];
	System.out.println("Enter "+arr1.length+" elements of arr1 ");
	for(int i=0;i<arr1.length;i++)
	{
		arr1[i] = sc.nextInt();
	}
	System.out.println("the element of 1nd array  ");
	for(int i:arr1)
	{
		System.out.print(i+" ");
	}
	System.out.println();
	System.out.println("Enter the size of second array ");
	int arr2[] = new int[sc.nextInt()];
	System.out.println("Enter "+arr2.length+" elements of arr2 ");
	for(int i=0;i<arr2.length;i++)
	{
		arr2[i] = sc.nextInt();
	}
	System.out.println("the element of 2nd array  ");
	for(int i:arr2)
	{
		System.out.print(i+" ");
	}
	System.out.println();
	int arr3[] = new int[arr1.length+arr2.length];
	for(int i=0;i<arr1.length;i++)
	{
		arr3[i] = arr1[i];
	}
	for(int i=0;i<arr2.length;i++)
	{
		arr3[arr1.length+i] = arr2[i];
	}
	System.out.println("the element after merging the two arrays  ");
	for(int i:arr3)
	{
		System.out.print(i+" ");
	}
	System.out.println();
	
}
}
