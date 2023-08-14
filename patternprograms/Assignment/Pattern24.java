package com.kodnest.patterns.Assignment;

public class Pattern24 {
public static void main(String[] args) {
	for(int i=1;i<=5;i++)
	{
		for(int j=1;j<=i;j++)
		{
			
			if(j==i)
			{
				System.out.print("&");
			}
			else if(j==1)
			{
				System.out.print("@");
			}
			else
			{
				System.out.print("-");
			}
		}
		System.out.println();
	}
}
}
