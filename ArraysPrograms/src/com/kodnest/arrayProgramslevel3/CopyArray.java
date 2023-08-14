package com.kodnest.arrayProgramslevel3;

import java.util.Scanner;

public class CopyArray {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int arr[] = new int[sc.nextInt()];
	System.out.println("Enter the "+arr.length+" elements of the array");
	for(int i=0;i<arr.length;i++)
	{
		arr[i] = sc.nextInt();
	}
	System.out.println("Elements of the array ");
	for(int i:arr)
	{
		System.out.print(i+" ");
	}
	System.out.println();
	int newArr[] = new int[arr.length];
	for(int i=0;i<arr.length;i++)
	{
		newArr[i] = arr[i];
	}
	System.out.println("Elements of the new array ");
	for(int i:newArr)
	{
		System.out.print(i+" ");
	}
}
}
