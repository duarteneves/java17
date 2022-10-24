package pt.dneves.staticcontext;

import static java.lang.Math.random;

import java.math.BigDecimal;
import java.time.LocalDateTime;


public class OtherStaticContext {

	public static void main(String[] args) {
		
		Math.round(2.99);
		random();
		
		
		BigDecimal number = BigDecimal.valueOf(2.99);
		LocalDateTime now = LocalDateTime.now();
		
		System.out.println("HelloWorld");
		
	}
	
}
