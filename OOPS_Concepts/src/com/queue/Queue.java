package com.queue;

public class Queue 
{
	private Node first;
	private int count;
	public void add(Object e)
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
	public int size()
	{
		return count;
	}
	public Object poll()
	{
		if(first==null)
		{
			System.out.println("Queue is empty");
			return null;
		}
		Node curr=first;
		while(curr.next.next!=null)
		{
			curr=curr.next;
		}
		Object e=curr.next;
		curr.next=null;
		count--;
		return e;
	}
	public Object peek()
	{
		if(first==null)
		{
			return null;
		}
		Node curr=first;
		while(curr.next!=null)
		{
			curr=curr.next;
		}
		return curr.ele;
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
}
