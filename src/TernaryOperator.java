
public class TernaryOperator {

	public static void main(String[] args) {
		
		int a = 2;
		int b = 3;
		
		int c = a >= b ? a : b;
		
		System.out.println("C: " + c);
		
		
		if(a >= b) {
			c = a;
		} else {
			c = b;
		}
		
		System.out.println("C: " + c);
		
		
		c = a >= b ? a : (--b == a) ? a : b;
		
		System.out.println("C: " + c);
		
	}
	
}
