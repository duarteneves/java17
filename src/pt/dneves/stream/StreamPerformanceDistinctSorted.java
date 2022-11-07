package pt.dneves.stream;

import java.util.stream.Stream;

public class StreamPerformanceDistinctSorted {

	
	public static void main(String[] args) {
		
		
		Stream<String> letters = Stream.of("A", "C", "B", "D", "B", "D");
		
		letters.distinct() 	// A, C, B, D
			.sorted()		// A, B, C, D
			.skip(2)		// C, D
			.forEach(s -> {
				
				s = s.toLowerCase();
				System.out.println(s);
				
			});

		
		letters = Stream.of("B", "C", "A", "E", "D", "F");
		
		letters.distinct() // B, C, A, E, D, F
			.takeWhile(l -> !l.equals("D"))	// B, C, A, E
			.dropWhile(l -> !l.equals("C"))	// C, A, E
			.limit(2)	// C, A
			.forEach(s -> {
				
				s = s.toLowerCase();
				System.out.println(s);
				
			});
		
	}
	
}
