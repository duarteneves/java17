import java.math.BigDecimal;
import java.math.RoundingMode;

public class Money {

	public static void main(String[] args) {
		
		// double 
		
		double d1 = 0.25;
		double d2 = 0.2;
		
		System.out.println(d1 + d2);							

		
        double d3 = 0.1;
        double d4 = 0.2;

        System.out.println(d3 + d4);							

        
        // Double
        
        Double d5 = Double.valueOf(0.25);
        Double d6 = Double.valueOf(0.2);
        
        System.out.println(d5 + d6);							
        
        
        Double d7 = Double.valueOf(0.1);
        Double d8 = Double.valueOf(0.2);
        
        System.out.println(d7 + d8);							

        
        // BigDecimal
        
        BigDecimal d9 = new BigDecimal(0.25);
        BigDecimal d10 = new BigDecimal(0.2);
        
        System.out.println(d9.add(d10));							
        
        
        BigDecimal d11 = new BigDecimal(0.1);
        BigDecimal d12 = new BigDecimal(0.2);
        
        System.out.println(d11.add(d12));							

        
        // BigDecimal round
        
        System.out.println(d9.add(d10).setScale(2, RoundingMode.HALF_UP));							
        
        System.out.println(d11.add(d12).setScale(2, RoundingMode.HALF_UP));
		
	}
	
}
