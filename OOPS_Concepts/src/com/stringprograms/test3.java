package com.stringprograms;

import java.util.Scanner;

public class test3 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String");
		String str=sc.nextLine();
		for(int i=0;i<str.length()-1;i++)
		{
			for(int j=i+1;j<str.length();j++)
			{
				if(isPalindrome(str,i,j))
				{
					System.out.println(str.substring(i,j+1));
				}
			}
		}

	}
	public static boolean isPalindrome(String s,int i,int j)
	{
		while(i<j)
		{
			if(s.charAt(i)!=s.charAt(j)) return false;
			i++;
			j--;
		}
		return true;
	}

}
