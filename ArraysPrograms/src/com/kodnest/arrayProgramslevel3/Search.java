package com.kodnest.arrayProgramslevel3;

public class Search {
	boolean isPresent(int arr[],int target)
	{
		for(int i:arr)
		{
			if (i==target)
			{
				return true;
			}
			
		}
		return false;
	}
}
