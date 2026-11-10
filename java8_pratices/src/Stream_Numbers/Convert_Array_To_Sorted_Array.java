package Stream_Numbers;

import java.util.Arrays;
import java.util.Scanner;

public class Convert_Array_To_Sorted_Array {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("enter array length : ");

		int size = sc.nextInt();

		int[] numbers = new int[size];

		for (int i = 0; i < size; i++) {
			numbers[i] = sc.nextInt();
		}

		System.out.println(Arrays.toString(Arrays.stream(numbers).sorted().distinct().toArray()));
	}

}
