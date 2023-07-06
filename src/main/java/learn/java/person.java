package learn.java;

public class person {
	int age = 21;
	int weight = 56;
	String colour = "light";
	void eat ()
	{
		System.out.println("i am eating");
	}
		
			void Sleep()
			{
				System.out.println("i am sleeping");
			}
				public static void main(String[]args) {
					person P=new person();
					System.out.println(P.age);
					System.out.println(P.weight);
					System.out.println(P.colour);
					P.eat();P.Sleep();
					
					

			
		}
		
	}
		


