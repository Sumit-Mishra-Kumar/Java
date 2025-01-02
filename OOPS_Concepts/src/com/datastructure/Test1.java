package com.datastructure;

public class Test1 
{
	public static void main(String[] args) 
	{
		DoubleLinkdedList l=new DoubleLinkdedList();
		l.add(10);
		l.add(20);
		l.add(30);
		l.add(40);
		l.traverse();
		l.add(0,50);
		l.traverse();
		l.add(3,60);
		l.traverse();	
		l.remove(3);
		l.traverse();
		l.reverse();
		l.traverse();
		System.out.println(l.size());
	}
}
