import org.junit.Assert;
import org.junit.jupiter.api.Test;


public class SwitchTest {


	@Test
	public void retornarValorArrow_weekday_ok() {
		
		
		// build scenario
		
		String monday = "Monday";
		String tuesday = "Tuesday";
		String wednesday = "Wednesday";
		String thursday = "Thursday";
		String friday = "Friday";
		
		
		// call method / service / operation
		
		String mondayDescr = Switch.retornarValorArrow(monday);
		String tuesdayDescr = Switch.retornarValorArrow(tuesday);
		String wednesdayDescr = Switch.retornarValorArrow(wednesday);
		String thursdayDescr = Switch.retornarValorArrow(thursday);
		String fridayDescr = Switch.retornarValorArrow(friday);
		
		
		// asserts
		
		Assert.assertEquals("Week day", mondayDescr);
		Assert.assertEquals("Week day", tuesdayDescr);
		Assert.assertEquals("Week day", wednesdayDescr);
		Assert.assertEquals("Week day", thursdayDescr);
		Assert.assertEquals("Week day", fridayDescr);
		
	}

		
	@Test
	public void retornarValorArrow_weekend_ok() {
		
		
		// build scenario
		
		String saturday = "Saturday";
		String sunday = "Sunday";
		
		
		// call method / service / operation
		
		String saturdayDescr = Switch.retornarValorArrow(saturday);
		String sundayDescr = Switch.retornarValorArrow(sunday);
		
		
		// asserts
		
		Assert.assertEquals("Weekend", saturdayDescr);
		Assert.assertEquals("Weekend", sundayDescr);
		
	}

	@Test
	public void retornarValorArrow_unknown() {
		
		
		// build scenario
		
		String day = "Vacation";
		
		
		// call method / service / operation
		
		String result = Switch.retornarValorArrow(day);
		
		
		// asserts
		
		Assert.assertEquals("Unknown", result);

	}
	
}
