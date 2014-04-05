package com.java.one;

public class OneJava {
public static void main(String [] args){
	sub(0, 0, 0);
	add();
	mul();
	div();
}
public static void sub(int k,int y, int x){
	k =22; y = 55; x = k-y;
	System.out.println("Sub" +x);
}
public static void add() {

int k=25; int j=15; int u=k+j;
System.out.println("Java " +u);
}
public static void mul(){
	 int j= 25; int k= 2; int l= j*k;
	 System.out.println("Mult " + l);
}
public static void div(){
int k = 25; int l = 15; int u =k/l;
System.out.println("Result " + u);
}
}
