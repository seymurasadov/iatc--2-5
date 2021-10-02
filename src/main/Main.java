package main;

import model.*;

public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		

		Teacher teacher = new Teacher();
		teacher.st = new Student();
		teacher.st.name = "Abbas";
		teacher.adress = new Adress();
		
		teacher.st.adress = new Adress();
		
		teacher.name = new String("Seymur");
		
	}
}
