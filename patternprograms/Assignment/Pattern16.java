package com.kodnest.patterns.Assignment;

public class Pattern16 {
public static void main(String[] args) {
	for(int i=0;i<=4;i++)
	{
		for(int j=1;j<=5-i;j++)
		{
			if(j==5-i)
			{
				System.out.print("*");
			}
			else
			{
				System.out.print(" ");
			}
		}
		System.out.println();
	}
}
}
