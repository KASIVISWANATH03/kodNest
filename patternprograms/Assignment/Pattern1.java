package com.kodnest.patterns.Assignment;

public class Pattern1 {
public static void main(String[] args) {
	for(int i=1;i<=3;i++)
	{
		if (i==1 || i==3)
		{
			for(int j=1;j<=3;j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
		else
		{
			for(int k=1;k<=3;k++) 
			{
				if(k==1 || k==3)
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
