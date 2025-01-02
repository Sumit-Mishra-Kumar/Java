package com.stringprograms;

import java.util.Scanner;

public class test5 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String");
		String str=sc.nextLine();
		char[] c=str.toCharArray();
		int i=0;
		while(i<str.length()-1)
		{
			if(c[i]==c[i+1])
			{
				System.out.println(""+c[i]+c[i+1]);
			}
			i++;
		}
		
	}

}
