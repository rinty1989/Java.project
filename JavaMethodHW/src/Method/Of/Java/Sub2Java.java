package Method.Of.Java;

public class Sub2Java {
public static void main(String[] args){
	
	int c= add();
	System.out.println(c);
	
	mult(2,3,4,5);
	mult(4,8,12,18);
	
	add(22,15);
	add(35,85);
	
	sub(85,55);
	sub(115,78);
	
	div (100,5);
	div (55,2);
	
}
public static int add(){
	int a =15; int b= 35; int c =a+b;
	System.out.println("My Answer "+c);
	return c;
}
public static int mult(int a, int b, int c, int d){
	int f=a*b*c*d;
	System.out.println("First Answer "+f);
	return f;
}
public static int add(int a, int b){
	int c=a+b;
	System.out.println("OMG "+c);
	return c;
}
public static int sub(int a, int b){
	int v= a-b;
	System.out.println("Sub "+v);
	return v;
}
public static int div( int j, int k){
	int c= j/k;
	System.out.println("Div " +c);
	return c;
	
}
}
