package com.kodnest.arrayProgramslevel2;

import java.util.Scanner;

public class SwappingElements {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int arr[] = new int[sc.nextInt()];
	
	System.out.println("Enter "+arr.length+" elements of the array");
	for(int i=0;i<arr.length;i++)
	{
		arr[i] = sc.nextInt();
	}
	System.out.println("the elements of the array are before swapping ");
	for(int i:arr)
	{
		System.out.print(i+" ");
	}
	System.out.println();
	System.out.println("Enter the two indices to perform swapping ");
	int x = sc.nextInt();
	int y = sc.nextInt();
	int temp = arr[x];
	arr[x] = arr[y];
	arr[y] = temp;
	
	System.out.println("the elements of the array are after swapping ");
	for(int i:arr)
	{
		System.out.print(i+" ");
	}
}
}
