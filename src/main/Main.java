package main;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.math.RoundingMode;
import java.util.Random;

import movie.*;

public class Main {
	
	public static void main(String[] args) {
		
		//TODO create movie
		
//		Genre genre = new Genre();
//		genre.value = "Dram";
//		
//		Employer employer = new Employer("Lionardo", "Di Caprio", 51);
//		
//		Position pos = new Position();
//		pos.value = "Acter";
//		employer.position = pos;
//		
//		Raiting raiting = new Raiting();
//		raiting.coefficient = new Double(7.2);
//		
//		Movie titanicMovie = new Movie("Titanic", (short) 112, "ADMIN_ABBAS", 
//				employer, genre, raiting);
//
//		Position inputPos = new Position();
//		inputPos.value = "Acter";
//		
//		double salary = titanicMovie.employer.calculateSalary(50);		
//		System.out.println(salary);
		
		int count = Employer.counter;
		System.out.println(count);
		
		// byte -> Byte
		// short -> Short
		// int -> Integer
		// long -> Long
		// float -> Float
		// double -> Double
		// char -> Character
		// boolean -> Boolean
		
	
		//autobox   autounbox
		
		Integer a = Integer.valueOf(-129);
		Integer b = Integer.valueOf(-129);
		
		System.out.println(a == b);
		
		String name = String.valueOf("");
		String name2 = new String();
		
		System.out.println(a.equals(b));
		
		
	}

}
