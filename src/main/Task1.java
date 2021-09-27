package main;

import java.util.Scanner;

public class Task1 {

	public static void main(String[] args) {
		// Kalkulyator
		// input double firstValue
		// input double secondValue
		// input String operator
		// result + - / *
		
		System.out.print("Ilk ededi daxil edin ->");
		
		Scanner scanner = new Scanner(System.in);
		int firstValue = scanner.nextInt();
		
		System.out.print("Ikinci ededi daxil edin -> ");
		int secondValue = scanner.nextInt();
		
		System.out.print("Operator daxil edin -> ");
		String operator = scanner.next();
		
		switch (operator) {
		case "/":
			System.out.println(firstValue/secondValue);
			break;
		case "*":
			System.out.println(firstValue*secondValue);
			break;
		default:
			System.out.println("operator sehvdir");
			break;
		}
		
		
	}
}
