package movie;

public class Employer {

	public String name;
	public String surname;
	public int age;
	public Movie movie;
	public Position position;
	
	public static int counter = 2;
	
	static{
		System.out.println(counter);
		counter++;
		System.out.println(counter);
	}
	
	{
		System.out.println(counter);
		counter++;
		System.out.println(counter);
	}
	
	public Employer() {
		System.out.println(counter);
		counter++;
		System.out.println(counter);
	}
	
	// calculate salary
	// method overloading
	public double calculateSalary(int limitAge) {
		if (age >= limitAge) {
			return 10000;
		} else {
			return 5000;
		}
	}
	
	public int incrementAge(int age) {
		return age + 7;
	}

	public double calculateSalary(int limitAge, Position position) {
		if (age >= limitAge && position.value.equals(this.position.value)) {
			return 10000;
		} else {
			return 5000;
		}
	}

	public String getFullname() {
		return this.name + " " + this.surname;
	}

	public String getFullname(int age) {
		return this.name + " " + this.surname + " " + age;
	}
	
	
	public static int getMaximalCarPrice() {
		return 5000000;
	}

}
