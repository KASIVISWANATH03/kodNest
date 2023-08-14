package com.kodnest.arrayProgramslevel4;

public class Replacenegative {
void replaceElement(int arr[])
{
	for(int i=0;i<arr.length;i++)
	{
		if(arr[i] <0 )
		{
			arr[i] = 0;
		}
	}
	
}
}
