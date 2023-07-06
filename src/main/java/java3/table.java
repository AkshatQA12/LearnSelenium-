package java3;

import java.util.Scanner;

public class table {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("enter the value of the table in which you can write table");
		int n = sc.nextInt();
		for (int i = 0; i <= 20; i++) {
			System.out.println(n + "X" + i + "=" + n * i);
		}
	}
}