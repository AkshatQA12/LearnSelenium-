class a
{
int a,b,c ;
void add()
{
	a=10;b=20; 
	c=a+b;
	System.out.print("sum of two numbers" +c);
}
void sub()
{
	a=200; b= 100;
	c= a-b;
	System.out.print("sub of two numbers" +c);
}
   }


class b extends a
{
	void multiply ()
	{
		a=10;b=20; 
		c=a*b;
		System.out.print("multiply of two numbers" +c);
	}

	void div()
	{
		a=10;b=2; 
		c=a/b;
		System.out.print("div of two numbers" +c);
	}
}


class c extends b 
{
	void rem()
	{
		a=10;b=3; 
		c=a%b;
		System.out.print("rem of two numbers" +c);
	}
}


class test 
{
	public static void main (String[]args) {
		
		C r = new C();
		r.add(); r.sub(); r.multiply();r.div();r.rem();
	}
}


