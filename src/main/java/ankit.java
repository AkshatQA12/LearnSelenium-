
public class student {
int roll, marks;
String name ;
void input ()
{
	System.out.print("enter roll name and marks");
}
}
class ankit extends student
{
	void disp()
	{
roll = 1; name = "ankit" ; marks =89;
System.out.print(roll+ " " +name+ " " +marks);

}
public static void main(String[]args) {
	ankit r = new  ankit ();
	r. input(); r . disp();
}
}
