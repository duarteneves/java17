package pt.dneves.record;

public record VehicleRecord(String brand, String licensePlate) {

	public static String UNKNOWN_LICENSE_PLATE = "  -  -  ";
	
    public VehicleRecord {
    	java.util.Objects.requireNonNull(brand);
    	java.util.Objects.requireNonNull(licensePlate);
    }

    public VehicleRecord(String brand) {
    	this(brand, UNKNOWN_LICENSE_PLATE);
    }

//    public VehicleRecord(String brand, String licensePlate) {
//    	this.brand = brand;
//    	this.licensePlate = licensePlate;
//    }
 
    public String brandAsLowerCase() {
        return brand().toLowerCase();
    }
	
    public static String brandAsUpperCase(VehicleRecord vehicle) {
        return vehicle.brand.toUpperCase();
    }
    
    @Override
    public String toString() {
    	return brand + " [ " + licensePlate + " ] ";
    }
    
}
