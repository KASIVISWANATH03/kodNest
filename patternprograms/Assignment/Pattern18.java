package com.kodnest.patterns.Assignment;

public class Pattern18 {
public static void main(String[] args) {
	for(int i=1;i<=5;i++)
	{
		if(i%2==0)
		{
			int val = 0;
			for(int j =1;j<=i;j++)
			{
				val=val+2;
				System.out.print(val);
			}
		}
		else
		{
			int val = -1;
			for(int j =1;j<=i;j++)
			{
				val=val+2;
				System.out.print(val);
				
			}
		}
		System.out.println();
	}
}
}
