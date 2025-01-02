package com.stringprograms;
import java.util.*;
public class test2 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String");
		String str=sc.nextLine();
		int i=0,sum=0;
		while(i<str.length())
		{
			String s="";
			char ch=str.charAt(i);
			if(ch>='0' && ch<='9')
			{
				s+=ch;
				int n=Integer.parseInt(s);
				sum+=n;
			}
			i++;
		}
		System.out.println(sum);
	}

}
