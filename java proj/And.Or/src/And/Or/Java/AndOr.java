package And.Or.Java;

public class AndOr {
public static void main (String[] args){
	
	int a,b;
	a = 10;
	b = -10;
	// && and
	if (a > 0 && b > 0){
	
	System.out.println(" Both nums are +ve");
	}else if (a > 0 || b > 0){
		System.out.println("atleast one num is +ve");
	}else{
	
		System.out.println("Both nums are -ve");
		
	}
}
}
