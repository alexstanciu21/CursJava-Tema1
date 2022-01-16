package curs8;

public class Vehicul {

	private String brand;
	private int nivelPoluare;
	private int vitezaMedie;

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public int getNivelPoluare() {
		return nivelPoluare;
	}

	public void setNivelPoluare(int nivelPoluare) {
		this.nivelPoluare = nivelPoluare;
	}

	public int getVitezaMedie() {
		return vitezaMedie;
	}

	public void setVitezaMedie(int vitezaMedie) {
		this.vitezaMedie = vitezaMedie;
	}

	public String nume(String nume) {
		return nume;
	}

	public String motorizare(String motorizare) {
		return motorizare;
	}

	public void detaliiVehicul() {
		System.out.println("Nivelul de poluare pentru vehiculul " + getBrand() + " este: " + getNivelPoluare()
				+ " si viteza medie atinsa este de " + getVitezaMedie() + " km/h");
	}

}
