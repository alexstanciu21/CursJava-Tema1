package curs3;

public class Car {
	
	public static String brand; 
	public static String type = "SUV"; 
	public static double engine; 
	
	public Car(String brand, double engine) {
		setBrand(brand);
		setEngine(engine);
	}
	
	public static String carDetails() {
		return  "All " + brand + " cars are "+ engine + " and are of type " + type;
	}
	
	public static String getBrand() {
		return brand;
	}

	public static void setBrand(String brand) {
		Car.brand = brand;
	}

	public static double getEngine() {
		return engine;
	}

	public static void setEngine(double engine) {
		Car.engine = engine;
	}

}
