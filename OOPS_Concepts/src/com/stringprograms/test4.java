package com.stringprograms;

import java.util.Scanner;

public class test4 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String");
		String str=sc.nextLine();
		int i=0,sum=0;
		while(i<str.length())
		{
			String s="";
			char ch=str.charAt(i);
			while(i<str.length() && ch>='0' && ch<='9' )
			{
				s+=ch;
				i++;
				if(i<str.length())
				{
					ch=str.charAt(i);
				}
			}
			if(s.length()!=0)
			{
				int n=Integer.parseInt(s);
				sum+=n;
			}
			i++;
		}
		System.out.println(sum);
	}
}
