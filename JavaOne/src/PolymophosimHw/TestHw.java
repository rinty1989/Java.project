package PolymophosimHw;

public class TestHw {
	/*
	 * 
	 */
public static void main(String[] args){
	add (25,45);
	add (125,11,5);
}
public static void add(int a, int b){
	int result = a+b;
	System.out.println("My Result " + result);
}
public static void add (int a, int b, int c){
	int result = a+b+c;
	System.out.println("Add world " + result);
	
}
}
