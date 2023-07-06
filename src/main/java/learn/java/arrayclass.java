package learn.java;
import java.util.Scanner ;

public class arrayclass {

	public static void main(String[] args) {
		int a[]= new int [6];
	System.out.print("enter array elements ");
     Scanner S = new Scanner (System. in);
for (int i = 0; i<=5; i++) {
	a[i]= S.nextInt ();
}
System.out.println("\n  array elements ");
	
for (int b:a) {
	System.out.print(b+ " ");

}

	}		

	}


