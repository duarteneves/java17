public class Switch {

	public static void main(String[] args) {
		
		antes17();
		
		retornarValorYield();
		
		retornarValorArrow();
		
	}
	
	
	static void antes17() {

		char status = 'N';
		double price = 10;
		
		
		switch (status) {

			case 'S':
				price += 1;
			case 'N':
				price = price + 2;
			case 'D':
				price -= 4;
				break;
			case 'E':
				price = 0;
				break;			
			default:
				price = 3;
		}
		
		
		System.out.println("Price: " + price);
		
		
	}
	
	
	static void retornarValorYield() {
		
		String day = "Monday";
		
		String type = switch (day) {
		
		    case "Monday":
		        yield  "Weekday";
		    case "Tuesday":
		        yield "Weekday";
		    case "Wednesday":
		        yield "Weekday";
		    case "Thursday":
		        yield "Weekday";
		    case "Friday":
		        yield "Weekday";
		    case "Saturday":
		        yield "Weekend";
		    case "Sunday":
		        yield "Weekend";
		    default:
		        yield "Unknown";
		};
		
		System.out.println("Type: " + type);
		
	}
	
	static void retornarValorArrow() {
		
		String day = "Monday";
		
		String type = switch (day) {
		
			case "Monday" -> "Week day";
			case "Tuesday" -> "Week day";
			case "Wednesday" -> "Week day";
			case "Thursday" -> "Week day";
			case "Friday" -> "Week day";
			case "Saturday" -> "Weekend";
			case "Sunday" -> "Weekend";
			
			default -> "Unknown";
		
		};
		
		
		System.out.println("Type: " + type);
		
	}

	
	static String retornarValorArrow(String day) {

		return switch (day) {
		
			case "Monday" -> "Week day";
			case "Tuesday" -> "Week day";
			case "Wednesday" -> "Week day";
			case "Thursday" -> "Week day";
			case "Friday" -> "Week day";
			case "Saturday" -> "Weekend";
			case "Sunday" -> "Weekend";
			
			default -> "Unknown";
		
		};
		
	}

	
	static void multiplesLabels() {
		
		String day = "Monday";
		
		String type = switch (day) {
		
			case "Monday", "Tuesday", "Wednesday", "Thursday", "Friday" -> "Week day";
			case "Saturday", "Sunday" -> "Weekend";
			
			default -> "Unknown";
			
		};
		
		
		System.out.println("Type: " + type);
		
	}


//	static void patternMatching() {
//		
//		String obj = "String";
//		
//		String type = switch (obj) {
//		
//			case Integer i -> "It is an integer";
//			case String s -> "It is a string";
//			case Employee s -> "It is a Employee";
//			
//			default -> "It is none of the known data types";
//		
//		};
//		
//		
//		System.out.println("Type: " + type);
//		
//	}
	
	
//	static void nullCase() {
//		
//		String obj = null;
//	
//		String type = switch (obj) {
//		    
//			case null -> "It is NULL!!!";
//		    
//		    default -> "It is none of the known data types";
//		    
//		};
//		
//		
//		System.out.println("Type: " + type);
//		
//	}
	
}
