package curs3;

import java.util.Scanner;

public class VerificaVarsta {
	
	int varsta; 
	int varstaMinima = 18; 
	int varstaMaxima = 65; 
	
	public void introducereVarsta() {
		System.out.println("Introduceti varsta dumneavoastra: ");
		Scanner scan = new Scanner(System.in); 
		varsta = scan.nextInt(); 
		scan.close();
	}
	
	public void calculareVarsta() {
		if (varsta < varstaMinima) {
			System.out.println("Esti minor");
		} 
		else if(varsta >= varstaMinima && varsta <= varstaMaxima) {
			System.out.println("Esti adult");
		} 
		else {
			System.out.println("Esti batran");
		}
	}
	
	
	

}
