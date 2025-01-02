package com.newpack;

public class Test {

	public static void main(String[] args) {
		Interval i=new Interval();
		i.add(1,2);
		i.add(3,5);
		i.add(6,7);
		i.add(8, 10);
		i.addMid(4, 8);
		i.traverse();
//		i.add(1,2);
//		i.add(3,6);
//		i.add(9,12);
//		i.addMid(7, 8);
//		i.traverse();
	}

}
