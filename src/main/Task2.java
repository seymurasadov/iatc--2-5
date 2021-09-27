package main;

import java.util.Scanner;

public class Task2 {

	public static void main(String[] args) {
		//input int ->
		// <- factorial !5
		// 5 * 4 * 3 * 2
		
		Scanner scanner = new Scanner(System.in);
		int input = scanner.nextInt();
		
		int result = 1;
		
		for(int i = input; i >= 2; i--) {
			result = result * i;
		
		}
		
		System.out.println(result);
		
		
	}
}
