package com.java.one;

public class CaluatorJava {
public static void main(String[] args){
	sub(8,9);
	sub (25,45);
	add(25,45);
	add (45,85);
	mul(9,15);
	div (45,5);
}
public static void sub(int a, int b){
	int j = a -b;
	System.out.println("Sub "+ j);
}
public static void add(int j, int k){
	int i= j+k;
	System.out.println("Result "+ i);
}
public static void mul(int e, int d){
	int h=e*d;
	System.out.println("Mul" + h);
}

public static void div(int j, int h) {

	int y = j/h;
	System.out.println("Div " + y);
}
}