package main;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Task3 {

	public static void main(String[] args) {

		// input -> String -> 9417826 94
		// result -> 1246789

		Scanner scanner = new Scanner(System.in);
		String input = scanner.nextLine();
		
		for (int i = 0; i < input.length() - 1; i++) {

			char left = input.charAt(i);
			char right = input.charAt(i + 1);

			int leftIntValue = Integer.parseInt(left + "");
			int rightIntValue = Integer.parseInt(right + "");

			if (leftIntValue > rightIntValue) {
				String part1 = "";
				String part2 = "";
				String part3 = "";
				if (i == 0) {
					// part1
					part1 = input.substring(0, i + 2);
					part1 = "" + part1.charAt(1) + part1.charAt(0);
					input = part1 + input.substring(2);

				} else if (i >= input.length() - 2) {
					part3 = input.substring(input.length() - 2);
					part3 = "" + part3.charAt(1) + part3.charAt(0);
					input = input.substring(0, input.length() - 2) + part3;

				} else {
					part2 = input.substring(i, i + 2);
					part2 = "" + part2.charAt(1) + part2.charAt(0);
					
					input = input.substring(0, i) + part2 + input.substring(i + 2);
				}

			}
		}
		
		System.out.println(input);

	}
}
