package main;

public class Task7 {

	public static void main(String[] args) {
		int input = 123456;
		//123456
		
		String inputString = String.valueOf(input);
		
		boolean sorted = true;
		
		for(int i = 0; i < inputString.length() - 1; i++) {
			
			int left = Integer.parseInt(""+inputString.charAt(i));
			int right = Integer.parseInt(""+inputString.charAt(i+1));
			
			if(left > right) {
				sorted = false;
				break;
			}
		}
		
		String message = "sirasizdir";
		if(sorted) {
			message = "siralidir";
		}
		
		System.out.println("Ededin reqemleri "+message);
		
	}
}
