package Curs7;

public class Qualification extends Teacher {

	public Qualification() {	
		setCourse("Java");
		setExperienceYears(3);
		setSchedule("Afternoon");
	}

	public void verify() {
		if (getCourse().contentEquals("Java") && getExperienceYears() == 3
				&& getSchedule().contentEquals("Afternoon")) {
			System.out.println("You qualify to teach at this school!");
		} else {
			System.out.println("You do not qualify!");
		}
	}

}
