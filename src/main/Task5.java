package main;

import java.util.Scanner;

public class Task5 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String input = scanner.nextLine();
		
		//5632147895
		
		int max = 0;
		int min = Integer.MAX_VALUE;
		
		for(int i = 0; i < input.length(); i++) {
			
			int val = Integer.parseInt(""+input.charAt(i));
			
			if(val > max) {
				max = val;
			}
			
			if(val < min) {
				min = val;
			}
		}
		
		System.out.println(max);
		System.out.println(min);

	}
}
