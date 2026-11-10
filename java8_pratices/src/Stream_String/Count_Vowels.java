package Stream_String;

import java.util.Scanner;

public class Count_Vowels {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("enter string : ");
		
		String input = sc.nextLine();
		
		System.out.print(input.chars().filter(c -> "aeiou".indexOf(c) != -1).count());
	}

}
