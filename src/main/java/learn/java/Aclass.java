package learn.java;

import java.sql.Ref;

class Aclass {	
	int a ; int  b ;
	Aclass()
	{
		a=10; b= 67;
		
			System.out.println(a+ " " +b);
	}
		
		Aclass(Aclass  ref)
		{
			a=ref.a;
			b=ref.b;
					
				System.out.println(a+ " " +b);
		}
	
		
		
				public static void main(String[]args) {
					Aclass r=new Aclass();
					Aclass r1 =new Aclass(r);

				}
			}
					
		
		
		
		
	
	
	


