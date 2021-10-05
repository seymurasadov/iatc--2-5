package movie;

import java.lang.*;

public class Employer {

	public String name;
	public String surname;
	public int age;
	public Movie movie;
	public Position position;

	public Employer(String name, String surname, int age) {
		this.name = name;
		this.surname = surname;
		this.age = age;
	}

	// calculate salary
	//method overloading
	public double calculateSalary(int limitAge) {
		if(age >= limitAge) {
			return 10000;
		}else {
			return 5000;
		}
	}

	public double calculateSalary(int limitAge, Position position) {
		if(age >= limitAge 
				&& position.value.equals(this.position.value)) {
			return 10000;
		}else {
			return 5000;
		}
	}
	

	public String getFullname() {
		return this.name +" "+ this.surname;
	}
	
	public String getFullname(int age) {
		return this.name +" "+ this.surname+ " "+age;
	}

}
