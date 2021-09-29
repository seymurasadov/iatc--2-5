package main;

import java.util.Scanner;

public class Task2 {

	public static void main(String[] args) {
		//7.Massivin polindrom olub-olmadığını yoxlayın.
		
		//input -> 12345654321
		
		
		Scanner scanner = new Scanner(System.in);
		String input = scanner.next();
		
		int length = input.length();
		
		boolean polindrome = true;
		
		for(int i = 0; i < length/2; i++) {
			if(input.charAt(i) != input.charAt(length-1- i) ) {
				polindrome = false;
				break;
			}
		}
		
		System.out.println(input+" is polindrome -> "+polindrome);
		
	}
}
