package pt.dneves.ciclo;

public class Ciclo {

	
	public void cicloWhile() {
		
		// declaration of the iterator
		int i = 0;
		
		
		while (i < 0) { // termination condition
			
			// body
			
			// iterator
			i++;
			
		}
		
	}

	
	public void cicloDoWhile() {
		
		// declaration of the iterator
		int i = 0;
		
		
		do {
			
			// body

			// iterator
			i++;
			
		} while (i < 0); // termination condition
		
	}

	
	public void cicloFor() {

		// declaration of the iterator; termination condition; iterator
		for (int i = 0; i < 10; i++) {
			
			// body
			
		}
		
		
//		int i = 0;
//		
//		for ( ; i < 10; ) {
//			
//			i++;
//			
//		}
		
	}

	
	public void cicloForEach() {
		
		
		int[] array = new int[10];

		
		// forEach
		
		for (int value : array) {
			System.out.println(value);
		}
		
		
		
		for (int i = 0; i < array.length; i++) {
			
			int value = array[i];
			
			System.out.println(value);
			
		}
		
	}
	
	
	public void cicloComplexFor() {
		
		
		int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9};
		
		int sum = 0;
		
		for (int i = 0; i < array.length; sum += i++);

		
		System.out.println(sum); // sum is 36
		
		
		int[][] matrix = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
		
		for (int i = 0, j = 2; !(i == 3 || j == -1); i++, j--) {
			int value = matrix[i][j];
			System.out.println(value); // 3 5 7
		}
		
	}

	
	
	public void cicloEmbedded() {
		
		
		int[][] matrix = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
		
		
		for (int i = 0; i < matrix.length; i++) {
			
			for (int j = 0; j < matrix[i].length; j++) {
				
				int value = matrix[i][j];
				System.out.println(value);				
				
			}
			
		}

		
		
		for (int i = 0; i < matrix.length; i++) {
			
			for (int value : matrix[i]) {
				
				System.out.println(value);
				
			}
			
		}
		
	}
	
	
	public void cicloWithBreak(int[] array, int element) {
		
		boolean found = false;
		
		
		// without break
		
		for (int i = 0; i < array.length; i++) {

			System.out.println(i);
			
			if(array[i] == element) {
				found = true;
			}
			
		}
		
		System.out.println(found);

		
		// with break
		
		for (int i = 0; i < array.length; i++) {

			System.out.println(i);
			
			if(array[i] == element) {
				found = true;
				break;
			}

		}
		
		System.out.println(found);
		
	}

	
	public void cicloWithBreakLabel(int[][] matrix) {
		
		label:
		for (int i = 0; i < matrix.length; i++) {
			
			for (int j = 0; j < matrix[i].length; j++) {
				
				int value = matrix[i][j];
				
				if(value == 1) {
					break;
				}

				if(value == 4) {
					break label;
				}
				
			}
			
			System.out.println(i);
			
		}			
		
	}
	
	public void cicloWithContinue(int[] array, int element) {
		
		for (int i = 0; i < array.length; i++) {

			
			if(array[i] == element) {
				continue;
			}
			
			System.out.println(array[i]);
			
		}
		
	}

	public void cicloWithContinueLabel(int[][] matrix) {
		
		label:
		for (int i = 0; i < matrix.length; i++) {
			
			for (int j = 0; j < matrix[i].length; j++) {
				
				int value = matrix[i][j];
				
				if(value == 1) {
					continue;
				}

				if(value == 4) {
					continue label;
				}
				
				System.out.println(value);
				
			}
			
		}			
		
	}
	
	
}
