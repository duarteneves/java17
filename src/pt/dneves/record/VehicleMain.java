package pt.dneves.record;

public class VehicleMain {

	
	public static void main(String[] args) {
		
		
		VehicleRecord vehicle1 = new VehicleRecord("Mercedes", "32-RC-56");

		System.out.println(vehicle1.toString());

		System.out.println(vehicle1.brand());
		System.out.println(vehicle1.licensePlate());

		

		VehicleRecord vehicle2 = new VehicleRecord("BMW");
		
		System.out.println(vehicle2.toString());
		
		System.out.println(vehicle2.brand());
		System.out.println(vehicle2.licensePlate());

		System.out.println(vehicle2.brandAsLowerCase());

		System.out.println(VehicleRecord.brandAsUpperCase(vehicle2));
		
		
		// compact constructor
		// throw NPE
		
		VehicleRecord vehicle3 = new VehicleRecord(null);
		
		VehicleRecord vehicle4 = new VehicleRecord("Mercedes", null);
		
	}
	
}
