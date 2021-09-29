package main;

import java.util.Scanner;

public class Task3 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int input = scanner.nextInt();
		
		String value = String.valueOf(input);
		
		//9.Ədədin rəqəmlərinin hasilini tapan proqram yazın.
		
		// 156987
		
		int result = 1;
		
		for(int i = 0; i < value.length(); i++) {
			char c = value.charAt(i);
			String convertedValue = ""+c;
			int parsedInt = Integer.parseInt(convertedValue);
			result *= parsedInt;
		}
		
		System.err.println(result);
		
	}
}
