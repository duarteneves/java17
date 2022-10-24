package pt.dneves.staticcontext;

import java.time.Period;

public class Static {

	public static final Period TWO_DAYS = Period.ofDays(2);
	
	
	private static Period days = TWO_DAYS;
	
	static {
		days = Period.ofDays(3);
	}

	
	private int count;
	
	
	public static Period getDays() {
		return days;
	}
	
	public static void setDays(Period numberOfDays) {
		days = numberOfDays;
//		count++;
	}
	
	public int getCount() {
		return count;
	}
	
	
	public static void main(String[] args) {
		
		Static s1 = new Static();
		
		Period days1 = s1.getDays();
		Period days2 = Static.getDays();
		
		s1.getCount();
		
//		Static.getCount();

		Static s2 = new Static();
		Period days3 = s2.getDays();
		
		// manter este exemplo - null
		s1 = null;
		
		s1.setDays(Period.ofDays(5));
		
		Period days4 = s1.getDays();
		
		System.out.println("s1: " + days4.getDays());

		Period days5 = s2.getDays();
		
		System.out.println("s2: " + days5.getDays());
		
	}
	
}
