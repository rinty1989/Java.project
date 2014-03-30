package Method.Of.Java;

public class Prac2Calcuator {
public static void main (String[] args){
	add(22,85);
	sub(115,85);
	mult(75,5);
	div(85,10);
	add(45,55);
	mult(85,75);
}
public static void add(int  a, int b){
	int j = a + b;
	System.out.println("Result " + j);
}
public static void sub( int j, int k){
	int l = j - k;
	System.out.println("Result " + l);
	
}
public static void mult(int y, int j){
	int h = y*j;
	System.out.println("Result " +h);
}
public static void div(int h, int j){
int k = h / j;
System.out.println("Result" + k);
}
public static void add2(int a, int b){
	int c = a + b;
	System.out.println("result "+ c);
}
public static void mult2(int h, int j){
	int k = h*j;
	System.out.println("Result " + k);
	
}
}
