package curs8;

public class TestVehicul {
	
	public static void main(String[] args) {
		
		Vehicul bicicleta = new Bicicleta();
		Vehicul masina = new Masina(); 
	
		TestVehicul testVehicul= new TestVehicul();
		testVehicul.verificaMotorizarea(bicicleta, "manuala", "Pegas");
		testVehicul.verificaMotorizarea(masina, "benzina", "Citroen");
		
		bicicleta.detaliiVehicul();
		masina.detaliiVehicul();

	}
	
	public void verificaMotorizarea(Vehicul vehicul, String motorizare, String nume) {
		System.out.println("Numele vehiculului este: " + vehicul.nume(nume));
		System.out.println("Motorizarea este de tipul: " + vehicul.motorizare(motorizare));
	}

}
