package com.arraylist;

public class Stack {
	private Object[] a;
	private int pos;
	public Stack() {
		a=new Object[5];
		pos=0;
	}
	public int size() {
		return pos;
	}
	public void push(Object e) {
		if(pos>=a.length) {
			increase();
		}
		a[pos++]=e;
		return;
	}
	public void increase() {
		Object[] temp=new Object[a.length+3];
		for(int i=0;i<a.length;i++) {
			temp[i]=a[i];
		}
		a=temp;
	}
	public Object pop() {
		if(pos==0) {
			System.out.println("Stack is empty");
			return null;
		}
		Object e=a[pos-1];
		a[pos-1]=null;
		pos--;
		return e;
	}
	public Object peek() {
		if(pos==0) {
			System.out.println("Stack is empty");
			return null;
		}
		return a[pos-1];
	}
	public boolean isEmpty() {
		if(pos==0) return true;
		return false;
	}
}
