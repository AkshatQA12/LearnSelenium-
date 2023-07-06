package learn.java;

public class classA {
int a; double b; String c;
private classA()
{
	a=10;b=30.56;c="akshat";
	System.out.println(a+ " " +b+ " " +c);
}
public static void main(String[]args) {
	classA r =new classA();
}
}