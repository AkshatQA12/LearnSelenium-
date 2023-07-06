package learn.java;

public class hello {
public static void main (String[]args) {
	System.out.print("main method started");
	int a=10;
	int b=0;
	try {
		int c=a/b;
		System.out.print(c);
	}
	catch (ArithmeticException e) {
		System.out.print("cant divide by 0");
	}
	System.out.print("main method ended");
}
}
