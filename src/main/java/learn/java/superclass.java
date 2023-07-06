package learn.java;

public class superclass {
	int a=10;
}
class B extends A{
	int a=20;
	void show()
	{
		System.out.print(a);
		System.out.print(super.a);

	}
}
class text {
	public static void main(String[] args) {
		B r=new B();
				r.show();
	}

}

