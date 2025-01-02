package com.stack;

public class Test1 {

	public static void main(String[] args) {
		Stack s=new Stack();
		s.push(10);
		s.push(20);
		s.push(30);
		s.traverse();
		s.pop();
		s.traverse();
		System.out.println(s.peek());
		s.traverse();
	}

}
