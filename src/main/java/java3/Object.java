package java3;

public class Object {
public	void add() {
		int a = 10, b = 22;
		int c = a + b;
		System.out.println(c);
	}

	public void subtract() {
		int a = 23, b = 23, c = a - b;
		System.out.println(c);

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Object obj = new Object();
		obj.add();
		obj.subtract();
	}

}
