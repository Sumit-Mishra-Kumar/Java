package com.arraylist;

public class Test2 {

	public static void main(String[] args) {
		Queue s=new Queue();
		s.add(10);
		s.add(20);
		s.add(30);
		s.add(40);
		s.add(50);
		System.out.println(s.peek());
		System.out.println(s.poll());
		System.out.println(s.isEmpty());
		System.out.println(s.size());
		System.out.println(s.peek());
		System.out.println(s.size());
	}

}
