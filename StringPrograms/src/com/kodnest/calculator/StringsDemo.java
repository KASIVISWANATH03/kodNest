package com.kodnest.calculator;

import java.util.Scanner;

public class StringsDemo {
	public static void main(String[] args) {
		//	String s = "kasi";
		//	System.out.println(s);
		//	StringBuilder stringBuilder = new StringBuilder("kasi");
		//	System.out.println(stringBuilder);
		//	System.out.println("revesed string");
		//	System.out.println(stringBuilder.reverse());
		Scanner scanner = new Scanner(System.in);
		System.out.println("enter length");
		char ch[] = new char[scanner.nextInt()];
		System.out.println("enter 10 characters ");
		for(int i=0;i<10;i++)
		{
			ch[i] = scanner.next().charAt(0);
		}
		System.out.println("1 array");
		for(char x : ch)
		{
			System.out.print(x+" ");
		}
		System.out.println();
		
		
		System.out.println("copied array");
		char ch1[] = new char[ch.length];
		for(int i=0;i<10;i++)
		{
			ch1[i] = ch[i];
			
		}
		//System.out.println("1 array");
		for(char x : ch1)
		{
			System.out.print(x+" ");
		}
		System.out.println();
		
		System.out.println("copied in reverse direction");
		//System.out.println("1 array");
		
		char ch2[] = new char[ch1.length];
		int i = ch1.length-1;
		for(char c: ch1)
		{
			ch2[i]=c;
			i--;
		}
		for(char x:ch2)
		{
			System.out.print(x+" ");
		}
		System.out.println();
	}
}
