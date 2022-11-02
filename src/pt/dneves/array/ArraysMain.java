package pt.dneves.array;

import java.util.Arrays;

public class ArraysMain {

	public static void main(String[] args) {
		
		// fill and search
		
		String[] values = new String[5];
		
		Arrays.fill(values, 2, 4, "aaa");
		
		int pos = Arrays.binarySearch(values, "aaa");
		
		System.out.println(pos);
		
		
		// equals
		
		String[] names1 = {"Mary", "Ann", "Jane", "Tom"};
		String[] names2 = {"Mary", "Ann", "John", "Tom"};
		
		boolean equals = Arrays.equals(names1, names2);
		
		System.out.println(equals);

		String[] names3 = {"Mary", "Ann", "John", "Tom"};
		String[] names4 = {"Mary", "Ann", "John", "Tom"};
		
		equals = Arrays.equals(names3, names4);
		
		System.out.println(equals);
		
		
		// sort
		
		Arrays.sort(names2);
		System.out.println(names2[0]);
		System.out.println(names2[3]);
		
		Arrays.sort(names2, new LengthCompare());
		System.out.println(names2[0]);
		System.out.println(names2[3]);
		
		
	}
	
}
