package java3;

// testing in which two same name of methods but having different parameters is called overloading testing 
public class Overloading {
	public void add(int a, int b) {
		System.out.println(a + b);
	}

	public void add(int a, int b, int c) {
		System.out.println(a + b + c);
	}

	public static void main(String[] args) {
		Overloading ol = new Overloading();
		ol.add(45, 66);
		ol.add(66, 66, 88);
	}

}
