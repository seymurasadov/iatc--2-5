package main;

public class Task9 {

	public static void main(String[] args) {
		//27   3 3 3
		//30  2 3 5
		
		int input = 33;
		String result = "";
		
		for(int bolen = 2; bolen <= input;) {
			if(input % bolen == 0) {
				result += bolen+" ";
				input = input / bolen;
				bolen = 2;
			}else {
				bolen++;
			}
			
		}
		
		System.out.println(result);
		
	}
}
