package com.kodnest.patterns.Assignment;

public class Pattern20 {
public static void main(String[] args) {
	for(int i=1;i<=5;i++)
	{
		int val = 1;
		for(int j=5;j>i;j--)
		{
			System.out.print(" ");
		}
		for(int j=5;j>5-i;j--)
		{
			System.out.print(val);
			val++;
		}
		System.out.println();
		
	}
}
}
