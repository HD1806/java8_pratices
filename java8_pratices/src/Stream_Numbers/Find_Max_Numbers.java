package Stream_Numbers;

import java.util.Arrays;
import java.util.Scanner;

public class Find_Max_Numbers {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("enter array length : ");
		int size = sc.nextInt();

		int[] numbers = new int[size];

		for (int i = 0; i < size; i++) {
			numbers[i] = sc.nextInt();
		}

		System.out.println(Arrays.stream(numbers).max().getAsInt());
	}

}
