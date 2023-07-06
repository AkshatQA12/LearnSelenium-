

class Ak 
 {
	 Ak(int a)
	 {
		 System.out.println("hello viewer\n" +a);
	 }
 }
class B extends Ak
{
	B()
	{
		super(100);
		 System.out.println("hello learner");
	}
}
	class akshat2
	{
		public static void main(String[]args) {

			B r=new B();
			
		}
	}
