package com.kodnest.patterns.Assignment;

public class Pattern21 {
public static void main(String[] args) {
	int val = 1;
	for(int i=1;i<=5;i++)
	{
		
		for(int j=1;j<=i;j++)
		{
			System.out.print(val);
			val++;
		}
		
		System.out.println();
		
	}
}
}