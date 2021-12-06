package curs3;

public class TestCar {
	
	public static void main(String[] args) {
		
		Car obiect = new Car("Kia", 2.0); 
		
		System.out.println(obiect.carDetails()); 
		
		Car obiect2 = new Car("Renault", 1.9); 
		obiect2.type = "sedan"; 
		
		System.out.println(obiect2.carDetails()); 
		System.out.println(obiect.carDetails());		
		
	}

}
