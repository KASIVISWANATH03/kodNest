package com.kodnest.arrayProgramslevel2;

import java.util.Scanner;

public class FindingPositiveElement {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int arr[] = new int[sc.nextInt()];
	System.out.println("Enter "+arr.length+" elements of the array");
	for(int i=0;i<arr.length;i++)
	{
		arr[i] = sc.nextInt();
	}
	System.out.println("the Positive elements in the array is ");
	for(int i:arr)
	{
		if(i>0)
		{
			System.out.print(i+" ");
		}
	}
}
}
