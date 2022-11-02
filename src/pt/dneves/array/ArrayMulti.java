package pt.dneves.array;

public class ArrayMulti {


	public static void declarationAndCreation() {
		
		int[][] matrix = new int[2][2];
		
		matrix[0][0] = 2;
		matrix[0][1] = 2;
		matrix[1][0] = 2;
		matrix[1][1] = 2;

		
		matrix = new int[2][3];
		
		matrix[0][0] = 2;
		matrix[0][1] = 2;
		matrix[0][2] = 2;
		matrix[1][0] = 2;
		matrix[1][1] = 2;
		matrix[1][2] = 2;
		
		
		int length = matrix.length;
		
		int i = matrix[1].length;
		
		
		System.out.println(matrix[0][0]);

	}
	
	
	public static void creationAndInitialization() {
		
		int[][] matrix;
		matrix = new int[][] {{2, 2}, {2, 2}};
		
	}
	
	
	public static void declarationAndCreationAndInitialization() {

		int[][] matrix = {{2, 2}, {2, 2}};
		
	}
	
	
	public static void main(String[] args) {
		
		declarationAndCreation();
		
		creationAndInitialization();
		
		declarationAndCreation();
		
	}
	
}
