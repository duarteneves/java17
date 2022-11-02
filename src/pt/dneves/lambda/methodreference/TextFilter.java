package pt.dneves.lambda.methodreference;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class TextFilter {

	
	public static boolean isFakeNews(String text) {
		return text.startsWith("Fake News");
	}
	
	public int sort(String t1, String t2) {
		return t1.compareTo(t2);
	}
	
	
	public static void main(String[] args) {
		
		
		TextFilter filter = new TextFilter();
		List<String> list = new ArrayList<>();
		
		
		// Class::staticMethod
		
		list.removeIf(s -> TextFilter.isFakeNews(s));
		list.removeIf(TextFilter::isFakeNews);
		
		
		// object::instanceMethod
		
		Collections.sort(list, (s1, s2) -> filter.sort(s1, s2));
		Collections.sort(list, filter::sort);
		
		
		// Class::instanceMethod
		
		Collections.sort(list, (s1, s2) -> s1.compareToIgnoreCase(s2));
		Collections.sort(list, String::compareToIgnoreCase);
		
		
		// Class::new
		
		String word = new Random()
	        .ints(97, 122)
	        .limit(7)
	        .collect(StringBuilder::new,
	                 StringBuilder::appendCodePoint,
	                 StringBuilder::append)
	        .toString();
		
		System.out.println(word);
		
	}
	
}
