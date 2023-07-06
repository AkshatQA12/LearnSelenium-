package java3;

import java.util.Scanner;

public class OddEven {

	public static void main(String[] args) {
		System.out.println("Enter any number");
		Scanner sc = new Scanner(System.in);
		float number;
		number = sc.nextFloat();
		if (number % 2 == 0) {
			System.out.print("Number is even");
		} else {
			System.out.print("Number is odd");

		}
	}

}
