package pt.dneves.stream;

import java.util.Arrays;
import java.util.Optional;
import java.util.OptionalDouble;

public class StreamPerformanceCount {

	
	public static void main(String[] args) {
		
		
		String[] colors = {"RED", "GREEN", "BLUE"};
		

		long count = Arrays.stream(colors)
			.filter(color -> color.indexOf('R') != -1)
			.count();
		
		System.out.println(count);
		
		
		int sum = Arrays.stream(colors)
			.mapToInt(color -> color.length())
			.sum();

		System.out.println(sum);
		
		
		OptionalDouble average = Arrays.stream(colors)
				.mapToInt(color -> color.length())
				.average();
		
		System.out.println(average.getAsDouble());
		
		
		
		Optional<String> max = Arrays.stream(colors)
			.max( (c1, c2) -> c1.compareTo(c2));

		System.out.println(max.get());

		
		Optional<String> min = Arrays.stream(colors)
				.min( (c1, c2) -> c1.compareTo(c2));
		
		System.out.println(min.get());
		
	}
	
}
