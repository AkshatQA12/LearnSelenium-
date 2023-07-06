package learn.java;
interface Ac{
	abstract void show();
}
interface Bc{
	void show ();
}
class multiple implements Ac,Bc 
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

