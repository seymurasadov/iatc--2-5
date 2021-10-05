package movie;

public class Raiting {

	public Double coefficient;
	
	public String getValue() {
		if(coefficient.doubleValue() > 5) {
			return "Good";
		}else {
			return "Worse";
		}
	}
}
