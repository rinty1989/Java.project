package com.ingerientace;

public class TwoClass {
/*
 * 
 */
	public static void main(String [] args){
		calculator (10,10);
	}
	public static void calculator (int a , int b){
		int add = a+b;
		int sub = a-b;
		int mul = a*b;
		int div = a/b;
		
		
		System.out.println("add result " + add);
		System.out.println("subtruct result " + sub);
		System.out.println("muultiply result " + mul);
		System.out.println("Division result " + div);
	
		
	}
}
