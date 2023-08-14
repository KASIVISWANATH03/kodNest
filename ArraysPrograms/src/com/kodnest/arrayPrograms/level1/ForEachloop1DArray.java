package com.kodnest.arrayPrograms.level1;

import java.util.Scanner;

public class ForEachloop1DArray {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the size of the array : ");
	int n = sc.nextInt();
	int arr[] = new int[n];
	for(int i=0;i<n;i++)
	{
		System.out.println("Enter the "+i+" element of the arr ");
		arr[i] = sc.nextInt();
		
	}
	System.out.println("The values present in the array are ");
	for(int i:arr)
	{
		System.out.print(i+5+" ");
	}
	sc.close();
}
}
