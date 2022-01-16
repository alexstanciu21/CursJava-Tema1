package curs8;

public class Bicicleta extends Vehicul{
	
	public Bicicleta() {
		setBrand("Cube");
		setNivelPoluare(0); 
		setVitezaMedie(20); 
	}
	
	@Override
	public String nume(String nume) {
		return nume;
	}
	
	@Override
	public String motorizare(String motorizare) {
		return motorizare;
	}

}
