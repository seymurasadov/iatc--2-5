package main;

import java.util.Scanner;

public class Task4 {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String firstText = scanner.nextLine();
		
		String secondText = scanner.nextLine();
		
		
		String word = "";
		
		String result = "";
		
		for(int i = 0; i < firstText.length(); i++) {
			
			if((""+firstText.charAt(i)).isBlank()) {
				boolean wordContains = secondText.contains(word);
				if(wordContains) {
					result += word+" ";
				}
				word = "";
			}else {
				word += firstText.charAt(i);
			}
		}
		
		System.out.println(result);
		
		
	}
}
