package pt.dneves.stream;

import java.util.Arrays;
import java.util.Optional;

public class StreamPerformanceMatchFind {

	
	public static void main(String[] args) {
		
		
		String[] colors = {"RED", "GREEN", "BLUE"};
		
		// Stream<String> stream = Arrays.stream(colors);
		
		boolean allMatch = Arrays.stream(colors).allMatch(color -> color.equals("GREEN"));
		boolean anyMatch = Arrays.stream(colors).anyMatch(color -> color.equals("GREEN"));
		boolean noneMatch = Arrays.stream(colors).noneMatch(color -> color.equals("GREEN"));
		
		
		System.out.println(allMatch);
		System.out.println(anyMatch);
		System.out.println(noneMatch);
		
		
		Optional<String> findAny = Arrays.stream(colors).findAny();
		Optional<String> findFirst = Arrays.stream(colors).findFirst();
		
		System.out.println(findAny.get());
		System.out.println(findFirst.get());

		
		findAny = Arrays.stream(colors)
				.filter(color -> color.charAt(0) == 'B')
				.findAny();
		
		System.out.println(findAny.get());
		
	}
	
}
