package com.arraylist;

public class ArrayList {
	private Object[] a;
	private int pos;
	public ArrayList() {
		a=new Object[5];
		pos=0;
	}
	public int size() {
		return pos;
	}
	public void add(Object ele) {
		if(pos>=a.length) {
			increase();
		}
		a[pos++]=ele;
	}
	public void increase() {
		Object[] temp=new Object[a.length+3];
		for(int i=0;i<a.length;i++) {
			temp[i]=a[i];
		}
		a=temp;
	}
	public Object get(int index) {
		if(index<=-1 || index>=size()) {
			throw new IndexOutOfBoundsException();
		}
		return a[index];
	}
	public void remove(int index) {
		if(index<=-1 || index>=size()) {
			throw new IndexOutOfBoundsException();
		}
		for(int i=index+1;i<size();i++) {
			a[i-1]=a[i];
		}
		a[pos]=null;
	}
	public void add(int index,Object e) {
		if(index<=-1 || index>=size()) {
			throw new IndexOutOfBoundsException();
		}
		if(pos>=a.length) {
			increase();
		}
		for(int i=size()-1;i>index;i++)
		{
			a[i+1]=a[i];
		}
		a[index]=e;
		pos++;
	}
}
