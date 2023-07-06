package learn.java;

 class Ak 
 {
	 void show()
	 {
		 System.out.print("hello viewer");
	 }
	 
	 
 }
class B extends Ak
{
	void show()
	{ 
		super.show();

		 System.out.print("hello learner");

	}
}
	class akshat
	{

		public static void main(String[]args) {

			B r=new B();
			r.show();
			
		}
	}
