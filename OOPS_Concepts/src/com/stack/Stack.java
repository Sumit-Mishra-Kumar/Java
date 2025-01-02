package com.stack;

public class Stack 
{
	private Node first;
	private int count;
	public void push(Object e)
	{
		if(first==null)
		{
			first=new Node(e);
			count++;
			return;
		}
		first=new Node(e,first);
		count++;
		return;
	}
	public void traverse()
	{
		Node curr=first;
		while(curr!=null)
		{
			System.out.print(curr.ele+" ");
			curr=curr.next;
		}
		System.out.println();
	}
	public int size()
	{
		return count;
	}
	public Object pop()
	{
		if(first==null)
		{
			System.out.println("Stack is empty");
			return null;
		}
		Object e=first;
		first=first.next;
		count--;
		return e;
	}
	public Object peek()
	{
		if(first==null)
		{
			return null;
		}
		return first.ele;
	}
}
