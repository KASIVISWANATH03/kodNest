package com.kodnest.arrayProgramslevel2;

import java.util.Scanner;

public class PrintArrayApp {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int arr[] = new int[sc.nextInt()];
	System.out.println("Enter "+arr.length+" elements of the array ");
	for(int i=0;i<arr.length;i++)
	{
		arr[i] = sc.nextInt();
	}
	PrintArray pa = new PrintArray();
	pa.printForward(arr);
	pa.printbackward(arr);
	
}
}
