package com.stringprograms;
import java.util.*;
public class test1 {
	
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String:");
		String str=sc.nextLine();
		String s="";
		for(int i=str.length()-1;i>=0;i--)
		{
			s+=str.charAt(i);
		}
		if(s.equals(str)) System.out.println("Palindrome");
		else System.out.println("not Palindrome");
	}

}
