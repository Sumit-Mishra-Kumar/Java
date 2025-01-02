package com.queue;

public class Test {

	public static void main(String[] args) {
		Queue q=new Queue();
		q.add(10);
		q.add(20);
		q.add(30);
		q.add(40);
		q.traverse();
		q.poll();
		q.traverse();
		System.out.println(q.peek());
		q.traverse();
	}
}
