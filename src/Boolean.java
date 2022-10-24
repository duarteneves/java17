
public class Boolean {

	public static void main(String[] args) {
		
		orExclusive();
		
		and();
		
		or();
		
	}
	
	
	static void orExclusive() {
		
		System.out.println("orExclusive");
		
		int a = 3;
		int b = 2;
		boolean c = false;
		
		
		// true ^ true -> false
		
		c = (a > b ^ b == 2);
		
		System.out.println("c: " + c);

		
		// false ^ false -> false
		
		c = (a < b ^ b == 5);
		
		System.out.println("c: " + c);

		
		// true ^ false -> true
		
		c = (a > b ^ b == 5);
		
		System.out.println("c: " + c);


		// false ^ true -> true
		
		c = (a < b ^ b == 2);
		
		System.out.println("c: " + c);

		
	}

	
	static void and() {
		
		System.out.println("and");
		
		int a = 3;
		int b = 2;
		boolean c = false;
		
		
		c = (a > b & b == 2);
		
		System.out.println("c: " + c);
		
		
		c = (a < b & b == 5);
		
		System.out.println("c: " + c);
		
		
		c = (a > b & b == 5);
		
		System.out.println("c: " + c);
		
		
		c = (a < b & b == 2);
		
		System.out.println("c: " + c);
		
	}

	static void or() {
		
		System.out.println("or");
		
		int a = 3;
		int b = 2;
		boolean c = false;
		
		
		c = (a > b | b == 2);
		
		System.out.println("c: " + c);
		
		
		c = (a < b | b == 5);
		
		System.out.println("c: " + c);
		
		
		c = (a > b | b == 5);
		
		System.out.println("c: " + c);
		
		
		c = (a < b | b == 2);
		
		System.out.println("c: " + c);
		
	}
	
	static int test(int a, int b) {
		
		
		if(a < b) {
			return a;
		} else if(b > a) {
			return b;
		}
			
		
		return a;
		
		
	}
	
}
