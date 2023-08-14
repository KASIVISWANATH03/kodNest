package com.kodnest.arrayProgramslevel3;

import java.util.Scanner;

public class SumArrayElements {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int arr[] = new int[sc.nextInt()];
	System.out.println("Enter "+arr.length+" elements of the array ");
	for(int i=0;i<arr.length;i++)
	{
		arr[i] = sc.nextInt();
	}
	FindSum findSum = new FindSum();
	int sum = findSum.findingTheSum(arr);
	System.out.println("The sum of the elements in the array is "+sum);
}
}
