package Curs7;

import java.util.Scanner;

public class TestTema7 {

	public static void main(String[] args) {
		
		Qualification qualification = new Qualification(); 
		
		Scanner scan = new Scanner(System.in); 
		
		System.out.println("Please enter your experience years: ");
		int requiredYears = scan.nextInt(); 
		
		System.out.println("Please enter your course specialisation: ");
		String requiredCourse = scan.next(); 
		
		System.out.println("Please enter your prefered teaching schedule: ");
		String requiredSchedule = scan.next(); 
		
		qualification.setExperienceYears(requiredYears);
		qualification.setCourse(requiredCourse);
		qualification.setSchedule(requiredSchedule);
		
		qualification.verify();	
				
	}
	
}
