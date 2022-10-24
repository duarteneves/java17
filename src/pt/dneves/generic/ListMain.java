package pt.dneves.generic;

import java.util.ArrayList;
import java.util.List;

public class ListMain {

	public static void main(String[] args) {
		
		// without generic
		
		List list1 = new ArrayList();
		
		
		list1.add("string");
		
		String string = (String) list1.get(0);
		
		System.out.println(string);

		
		list1.add(Integer.valueOf(1));
		
		string = (String) list1.get(1);
		
		System.out.println(string);


		// with generic
		
		List<String> list2 = new ArrayList<>();
		
		
		list2.add("string");
		
		string = list2.get(0);
		
		System.out.println(string);
		
		
//		list2.add(Integer.valueOf(1));
		
	}
	
}
