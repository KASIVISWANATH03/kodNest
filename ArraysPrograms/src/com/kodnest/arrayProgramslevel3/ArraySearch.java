package com.kodnest.arrayProgramslevel3;

import java.util.Scanner;

public class ArraySearch {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int arr[] = new int[sc.nextInt()];
	System.out.println("Enter "+arr.length+" elements of the array ");
	for(int i=0;i<arr.length;i++)
	{
		arr[i] = sc.nextInt();
		
	}
	System.out.println("Enter the target to search ");
	int target = sc.nextInt();
	Search search=new Search();
	if (search.isPresent(arr, target))
	{
		System.out.println("target is found ");
	}
	else
	{
		System.out.println("target is not found ");
	}
}
}
