package com.kodnest.arrayProgramslevel4;

import java.util.Scanner;

public class ReplacingnegativeNumbers {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the size of the array ");
	int arr1[] = new int[sc.nextInt()];
	System.out.println("Enter "+arr1.length+" elements of arr1 ");
	for(int i=0;i<arr1.length;i++)
	{
		arr1[i] = sc.nextInt();
	}
	System.out.println("Array--->");
	for (int i : arr1) {
		System.out.print(i+" ");
	}
	System.out.println();
	Replacenegative rn = new Replacenegative();
	rn.replaceElement(arr1);
	System.out.println("The elements of the array after replacing all the negative values with zero");
	for(int i:arr1)
	{
		System.out.print(i+" ");
	}
}
}
