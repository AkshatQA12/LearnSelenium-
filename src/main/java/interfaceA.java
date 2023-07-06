interface A {
	abstract void show();
}
interface B{
	void show ();
}
class multiple implements A,B
{
	public void show()
	{
		System.out.print("interface A & B");
	}
	public static void main (String[]args) {
		multiple m= new multiple();
		m.show();
	}
}

