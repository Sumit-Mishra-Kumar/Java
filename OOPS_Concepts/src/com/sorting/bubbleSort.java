package com.sorting;

import java.util.Arrays;

public class bubbleSort {

	public static void main(String[] args) 
	{
		int[] a = {4,2,5,8,7,6};
		sort(a);
		System.out.println(Arrays.toString(a));
	}
	static void sort(int[] a)
	{
		for(int j=0;j<a.length-1;j++)
		{
			for(int i=0;i<a.length-1-j;i++)
			{
				if(a[i]>a[i+1])
				{
					int temp=a[i];
					a[i]=a[i+1];
					a[i+1]=temp;
				}
			}
		}
	}

}
