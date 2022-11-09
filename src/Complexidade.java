import java.util.ArrayList;
import java.util.List;

public class Complexidade {

	
	public static void main(String[] args) {
		
		
		List<String> strings = new ArrayList<>();
		
		// n = strings.size();
		
		// O(n)
		for (String string : strings) {
			System.out.println(string);
		}
		
		
		// O(n^2)
		for (String string : strings) {
			
			for (String string2 : strings) {
				
				// algoritmo
				System.out.println(string);
				
			}
			
		}
		
		
	}
	
	
}
