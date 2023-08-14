package com.kodnest.patterns.Assignment;

public class Pattern4 {
public static void main(String[] args) {
	for(int i=0;i<3;i++)
	{
		for(int j=1;j<3-i;j++)
		{
			System.out.print(" ");
		}
		for(int j=1;j<=2*i+1;j++)
		{
			System.out.print("*");
		}
		System.out.println();
	}
	for(int i=1;i<=4;i++)
	{
		if (i==1 || i==4)
		{
			for(int j=1;j<=5;j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
		else
		{
			for(int k=1;k<=5;k++) 
			{
				if(k==1 || k==5)
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
}
