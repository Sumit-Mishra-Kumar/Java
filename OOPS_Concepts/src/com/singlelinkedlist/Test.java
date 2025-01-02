package com.singlelinkedlist;

public class Test {

	public static void main(String[] args) {
		SingleLinkedList l=new SingleLinkedList();
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
