package main;

public class Task6 {
	public static void main(String[] args) {
		String val = "53619";
		
		int max = 0;
		int secondMax = 0;
		
		for(int i = 0; i < val.length(); i++) {
			
			int j = Integer.parseInt(""+val.charAt(i));
			
			if(j > max) {
				secondMax = max;
				max = j;
			}else if(j > secondMax) {
				secondMax = j;
			}
		}
		
		System.out.println(secondMax +" "+max);
	}
}
