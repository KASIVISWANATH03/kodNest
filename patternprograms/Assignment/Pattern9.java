package com.kodnest.patterns.Assignment;

public class Pattern9 {
public static void main(String[] args) {
	char ch = 'A';
	for(int i=0;i<5;i++)
	{
		
		for(int j=1;j<=5-i;j++)
		{
			System.out.print(" ");
		}
		for(int j=1;j<=2*i+1;j++)
		{
			System.out.print(ch);
			
		}
		System.out.println();
		ch++;
	}
}
}
