package java.andOr;

public class ExampleAndOr {
public static void main (String[] args){
	
	int x = -20;
	int y = 20;
	// && and
	// || or 
	if (x > 0 && y > 0){
		System.out.println(" Both Nums are +ve");
	}else if ( x > 0 || y > 0){
		System.out.println(" Atleast one Num is +ve");
	}else{
		System.out.println(" Both nums are -ve");
		
	}
}
}
