package main;

import java.util.Scanner;

public class Task1 {

	public static void main(String[] args) {
		//Verilmiş  ədəddə  1 və 3 rəqəmləri  
		//istisna  olmaqla  ədədi çıxışa verən proqram yazin.
		
		Scanner scanner = new Scanner(System.in);
		int input = scanner.nextInt();
		
		String inputString = String.valueOf(input);
		
		inputString = inputString.replace("3", "");
		inputString = inputString.replace("1", "");
		
		System.out.println(inputString);
		
//		String result = "";
//		
//		for(int i = 0; i < inputString.length(); i++) {
//			
//			char c = inputString.charAt(i);
//			if(!(""+c).equals("1") && !(""+c).equals("3")) {
//				result += ""+c;
//			}
//		}
//		
//		System.out.println("Result -> "+result);
	}
}
