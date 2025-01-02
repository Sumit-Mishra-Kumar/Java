package com.newpack;

public class Interval {
	private Node first;
	private int count;
	public void add(int a,int b)
	{
		if(first==null) 
		{
			first=new Node(a,b);
			count++;
			return;
		}
		Node curr=first;
		while(curr.next!=null)
		{
			curr=curr.next;
		}
		curr.next=new Node(a,b);
		count++;
		return;
	}
	public void addMid(int start, int end) {
        Node newInterval = new Node(start, end);
        
        // If the list is empty, simply add the new interval
        if (first == null) {
            first = newInterval;
            return;
        }

        Node curr = first;
        Node prev = null;
        
        // Find the correct place for the new interval
        while (curr != null && curr.ele_end < start) {
            prev = curr;
            curr = curr.next;
        }
        
        // Merge intervals if necessary
        if (curr != null && curr.ele_start <= end) {
            // Merge with the current interval
            newInterval.ele_start = Math.min(curr.ele_start, start);
            newInterval.ele_end = Math.max(curr.ele_end, end);
            // Skip the merged intervals
            while (curr != null && curr.ele_start <= newInterval.ele_end) {
                curr = curr.next;
            }
        } else {
            newInterval.ele_start = start;
            newInterval.ele_end = end;
        }

        // Insert the new interval in the list
        if (prev == null) {
            // New interval goes at the start
            newInterval.next = first;
            first = newInterval;
        } else {
            prev.next = newInterval;
            newInterval.next = curr;
        }

        count++;
    }
	public void traverse() {
		Node curr=first;
		while(curr!=null)
		{
			System.out.println(curr.ele_start+" "+curr.ele_end);
			curr=curr.next;
		}
	}
}
