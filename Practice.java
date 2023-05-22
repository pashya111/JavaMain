import java.util.Scanner;

public class Practice{
	public static void main (String args[]){
	
	Scanner input = new Scanner(System.in);
		System.out.print("b = ");

	    int b = input.nextInt();
	    
		System.out.print("c = ");

	    int c = input.nextInt();

		int a=b % c;
		
	    System.out.println("remainder = "+a);
	}
}