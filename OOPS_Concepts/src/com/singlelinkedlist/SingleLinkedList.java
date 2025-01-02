package com.singlelinkedlist;

public class SingleLinkedList 
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
		Node curr=first;
		while(curr.next!=null)
		{
			curr=curr.next;
		}
		curr.next=new Node(e,null);
		count++;
		return;
	}
	public void add(int index,Object e)
	{
		if(index<=-1 || index>=size())
		{
			throw new IndexOutOfBoundsException();
		}
		if(index==0)
		{
			first=new Node(e,first);
			count++;
			return;
		}
		Node curr=first;
		for(int i=1;i<index;i++)
		{
			curr=curr.next;
		}
		curr.next=new Node(e,curr.next);
		count++;
		return;
	}
	public int size()
	{
		return count;
	}
	public Object get(int index)
	{
		if(index<=-1 || index>=size())
		{
			throw new IndexOutOfBoundsException();
		}
		Node curr=first;
		for(int i=0;i<index;i++)
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
	public void remove(int index)
	{
		if(index<=-1 || index>=size())
		{
			throw new IndexOutOfBoundsException();
		}
		if(index==0)
		{
			first=first.next;
			count--;
			return;
		}
		Node curr=first;
		for(int i=1;i<index;i++)
		{
			curr=curr.next;
		}
		curr.next=curr.next.next;
		count--;
		return;
	}
	public void reverse()
	{
		Node next=null;
		Node prev=null;
		Node curr=first;
		while(curr!=null)
		{
			next=curr.next;
			curr.next=prev;
			prev=curr;
			curr=next;
		}
		first=prev;
	}
	
}
