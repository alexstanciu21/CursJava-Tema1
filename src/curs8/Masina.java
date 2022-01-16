package curs8;

public class Masina extends Vehicul{
	
	public Masina() {
		setBrand("Kia");
		setNivelPoluare(3); 
		setVitezaMedie(80); 
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
