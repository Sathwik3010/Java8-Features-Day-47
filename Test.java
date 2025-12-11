package com.codegnan.java8;

public class Test {

	public static void main(String[] args) {
//		Interf i = new Demo();
//		Interf i = (a,b)->System.out.println(a+b);
		Interf i = n ->(n*n);
//		i.sum(10,5);
		System.out.println(i.squareInt(5));
	}

}
