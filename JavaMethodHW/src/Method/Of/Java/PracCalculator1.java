package Method.Of.Java;

public class PracCalculator1 {
	public static void main(String[] args){
		add(2,5);
		add(20,25);
		sub(20,15);
		mult(10,5);
		mult (15,2);
		mult(7,9);
		div(15,5);
		
	}
public static void add(int r, int b){
	int a= r +b;
	System.out.println("Result is " + a);
}
public static void add2(int j, int k){
	int h = j +k;
	System.out.println("Result is " + h);
}

public static void sub(int r, int b){
	int d = r - b;
	System.out.println("Result is " + d);
	
}
public static void mult(int r, int j){
	int k = r*j;
	System.out.println("Result is " + k);
	
}
public static void mult2( int j, int k){
	int h = j * k;
	System.out.println("Result is " + h);
}
public static void mult3( int y, int r){
	int j = y*r;
	System.out.println("Result is " + j);
	
}
public static void div(int t, int j){
	int k = t / j;
	System.out.println("Result is " + k );
}

}
