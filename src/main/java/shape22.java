
class shape
{
	void draw ()
	{
		System.out.print("cant say shape type");
	}
}
class square extends shape 
{
	void draw ()
	{
		System.out.print("square shape");
	}
}
class shape22{
	public static void main(String[]args) {
		shape r = new square();
		r.draw();
	}
}


