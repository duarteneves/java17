package pt.dneves.list;

import java.time.Duration;
import java.time.Instant;
import java.util.ArrayList;
import java.util.List;

public class ArrayListMain {

	
	private static final int MAX = 500000;
	

	private static void defaultCapacity() {
		
		List<String> array = new ArrayList<>();

		
		Instant start = Instant.now();
		
		for (int i = 0; i < MAX; i++) {
			array.add(String.valueOf(i));
		}
		
		Instant end = Instant.now();
		
        long stringTimeElapsed = Duration.between(start, end).toMillis();

        System.out.println(stringTimeElapsed);
        
	}
	
	
	private static void withCapacity() {
		
		List<String> array = new ArrayList<>(MAX);
		
		
		Instant start = Instant.now();
		
		for (int i = 0; i < MAX; i++) {
			array.add(String.valueOf(i));
		}
		
		Instant end = Instant.now();
		
		long stringTimeElapsed = Duration.between(start, end).toMillis();

        System.out.println(stringTimeElapsed);
        
	}
	
	
	public static void main(String[] args) {

		defaultCapacity();

		withCapacity();
		
	}
	
}
