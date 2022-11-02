package pt.dneves.generic;

public class GenericType<T> {

	private T value;

	public T getValue() {
		return value;
	}

	public void setValue(T value) {
		this.value = value;
	}

	public static void main(String args[]) {
		
		GenericType<String> type1 = new GenericType<>();
		type1.setValue("Pankaj");
		
		String str = type1.getValue();
		
		System.out.println(str);

		
		GenericType<Integer> type2 = new GenericType<>();
		type2.setValue(Integer.valueOf(1));
		
		Integer integer = type2.getValue();
		
		System.out.println(integer);

		
//		GenericType<Integer> type3 = new GenericType<>();
//		type3.setValue(Integer.valueOf(1));
//		
//		str = type3.getValue();
//		
//		System.out.println(str);
		
	}

}
