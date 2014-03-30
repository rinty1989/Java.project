package Method.Of.Java;

public class SuvJava {
public static void main(String[] args){
	int c= add (30,50)+20;
	System.out.println("First Answer " +c);
	
	
	int g = add (20,50)+55;
	System.out.println(g);
	
	int g1 = 8*100;
	System.out.println(g1);
	
	int a = 7*10;
	System.out.println(a);
	
	mult (2,4,6,8);
	mult(1,2,3,4);
	
}
public static int add (int n, int m){
	int c = n +m;
	System.out.println("2nd result "+c);
	return c;
}
public static int mult(int j, int k, int l, int i){
	int y = j*k*l*i;
	
	System.out.println(y);
	return y;
	
}
public static void mult(){
	int j = 10;
	int k = 8;
	int h = j*k;
	System.out.println("Result "+h);
	
}
}
