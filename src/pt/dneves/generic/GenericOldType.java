package pt.dneves.generic;

public class GenericOldType {

	private Object value;

	public Object getValue() {
		return value;
	}

	public void setValue(Object value) {
		this.value = value;
	}

	public static void main(String args[]) {
		
		GenericOldType type1 = new GenericOldType();
		type1.setValue("Pankaj");
		
		String str = (String) type1.getValue(); // type casting, error prone and can cause ClassCastException
		
		System.out.println(str);

		
		GenericOldType type2 = new GenericOldType();
		type2.setValue(Integer.valueOf(1));
		
		Integer integer = (Integer) type2.getValue(); // type casting, error prone and can cause ClassCastException
		
		System.out.println(integer);

		
		GenericOldType type3 = new GenericOldType();
		type3.setValue(Integer.valueOf(1));
		
		str = (String) type2.getValue(); // type casting, error prone and can cause ClassCastException
		
		
//		if(type2.getValue() instanceof Integer) {
//
//			integer = (Integer) type2.getValue();
//			System.out.println(integer);
//			
//		} else if(type2.getValue() instanceof String) {
//		
//			str = (String) type2.getValue();
//			System.out.println(str);
//			
//		}
		
	}

}
