package Method.Of.Java;

public class helloMethod {

	public static void main(String[] args){
		
	sub();
	add();
	sub(); 
	mult();
	divi();
	
	
	}
	public static void sub (){
		int x = 10;
		int y = 55;
		int z = x -y;
		System.out.println("Result of Sub is " + z);
		
	}
	
	public static void add(){
		
		int a = 88;
		int b =15;
		int c= 75;
		int d =a+b+c;
		
		System.out.println("Answer to this Question is " + d);
	}
	
	public static void subR () {
		int r = 10;
		int b = 98;
		int c = r -b;
		System.out.println("Love java " + c);
		
		
	}
	
	public static void mult (){
		int j = 10;
		int r = 8;
		int y = j*r;
		System.out.println(+y);
	}
	
	public static void divi (){
		int j,y,x;
		j = 55;
		y = 5;
		x = j/y; 
		System.out.println("divi answer " + x);
	}
}
