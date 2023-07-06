package learn.java;

abstract  class  abs  {
	void legs ()
	{
		System.out.print("all animal have four legs");
	}
abstract void sound()
abstract void eat()
{
	class  dog extends abs 
	{
		void sound() 
		{
			System.out.print("bow bow.....");
		}
		void eat()
		{
			System.out.print("meat eating ");
		}
		
	}
	class cow extentds abs 
	{
		void sound ()
		{
			System.out.print("ooo-oooo ");
		}
		
			void eat()
			{
				System.out.print("grass eating ");
			}
		}
	}
}
class abs

	public static void main(String[] args) {
	Dog d = new dog ();
	cow c = new cow();
	d.sound();d.eat();d.legs();
	c.sound();c.eat();c.legs();
	// TODO Auto-generated method stub

	}

}
