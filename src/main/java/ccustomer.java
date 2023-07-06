interface vehicle 
{
	String name =" TVS";//public + static + final
	int speed = 100;
	void start();
	void stop();
}
class ccustomer implements vehicle 
{
public void start ()
{
	System.out.println("start():insert key&press start button");
}
public void stop()
{
	System.out.print("stop():exit key");
}
public static void main (String[]args) {
	ccustomer c = new ccustomer();
	c.start(); c.stop();
	System.out.println(" \n" +speed);
}
}