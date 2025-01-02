package com.arraylist;

public class Queue {
	private Object[] a;
	private int pos;
	public Queue() {
		a=new Object[5];
		pos=0;
	}
	public int size() {
		return pos;
	}
	public void add(Object e) {
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
	public Object poll() {
		if(pos==0) {
			System.out.println("Stack is empty");
			return null;
		}
		Object e=a[0];
		for(int i=0;i<a.length-1;i++) {
			a[i]=a[i+1];
		}
		pos--;
		return e;
	}
	public Object peek() {
		if(pos==0) {
			System.out.println("Stack is empty");
			return null;
		}
		return a[0];
	}
	public boolean isEmpty() {
		if(pos==0) return true;
		return false;
	}
}



