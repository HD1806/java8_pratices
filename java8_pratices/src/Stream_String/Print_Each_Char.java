package Stream_String;

import java.util.Arrays;
import java.util.Scanner;

public class Print_Each_Char {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("enter string that you want to stream : ");
		
		String input = sc.nextLine();
		
		System.out.print(Arrays.toString(input.chars().mapToObj(c -> (char)c).toArray(Character[]::new)));
	}

}
