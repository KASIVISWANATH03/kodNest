package com.kodnest.patterns.Assignment;

public class Pattern8 {
public static void main(String[] args) {
	for(int i=0;i<5;i++)
	{
		char ch = 'A';
		for(int j=1;j<=5-i;j++)
		{
			System.out.print(" ");
		}
		for(int j=1;j<=2*i+1;j++)
		{
			System.out.print(ch);
			ch++;
		}
		System.out.println();
	}
}
}
