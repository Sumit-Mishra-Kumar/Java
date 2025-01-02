package com.newpack;

public class Node {
	int ele_start;
	int ele_end;
	Node next;
	public Node(int start,int end)
	{
		ele_start=start;
		ele_end=end;
	}
	public Node(int start,int end,Node n)
	{
		ele_start=start;
		ele_end=end;
		next=n;
	}
}
