package com.sorting;

import java.util.Arrays;

public class selectionSort {

	public static void main(String[] args)
	{
		int[] a = {4,2,5,8,7,6};
		sort(a);
		System.out.println(Arrays.toString(a));
	}
	static void sort(int[] a)
	{
		for(int i=0;i<a.length-1;i++)
		{
			int minIndex=i;
			for(int j=i+1;j<a.length;j++)
			{
				if(a[j]<a[minIndex])
				{
					minIndex=j;
				}
			}
			int temp=a[minIndex];
			a[minIndex]=a[i];
			a[i]=temp;
		}
	}

}
