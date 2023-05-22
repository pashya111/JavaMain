import java.util.Scanner;

public class SumOf{

	public static void main (String args[]){
	
		Scanner input = new Scanner(System.in);
		int n ;
		
		int sum = 0;
		
		do
		{
			System.out.println("Enter any number (Press 0 to exit) : ");
			n = input.nextInt();
			sum += n ;
			
		
		} while(n != 0);
		
		System.out.print("Total sum = "+sum);
		input.close();
		
	
	}
}