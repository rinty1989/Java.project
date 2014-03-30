package Method.Of.Java;

public class ReturnFunction {
	public static void main(String[] args){
		int a = sub(25,10) + 20;
		System.out.println("Hello World " + a);
				
	}

	private static int sub(int i, int j) {
		// TODO Auto-generated method stub
		int k = i-j;
		System.out.println("Private " + k );
		return 0;
	}

}
