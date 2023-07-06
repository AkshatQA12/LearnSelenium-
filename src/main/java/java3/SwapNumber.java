package java3;

import java.util.Scanner;

public class SwapNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int number1;
		int number2;
		System.out.println("Enter ist no");
		number1 = sc.nextInt();
		System.out.println("Enter 2nd no");
		number2 = sc.nextInt();
		number1 = number1 + number2;
		number2 = number1 - number2;
		number1 = number1 - number2;
		System.out.println("1st number" + number1);
		System.out.println("2nd number" + number2);
	}

}
