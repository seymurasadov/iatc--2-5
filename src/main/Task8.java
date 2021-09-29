package main;

public class Task8 {

	public static void main(String[] args) {
		
//17.Ədədin ikilik yazılışındakı sıfırların sayını tapan  proqramı yazın.
		int input = 356;
		String binaryString = Integer.toBinaryString(input);
		
		int counter = 0;
		
		for(int i = 0; i < binaryString.length(); i++) {
			if(Integer.parseInt(""+binaryString.charAt(i)) == 0) {
				counter++;
			}
		}
		
		System.out.println(binaryString);
		System.out.println(counter);
		
		
	}
}
