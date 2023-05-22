import java.util.Scanner;

public class Checkprime{

	public static void main (String args[]){
	
	Scanner input = new Scanner(System.in);
	
	System.out.print("Enter a number : ");
	int n = input.nextInt();
	int i;
	boolean isPrime=true;
	
	for( i = 2 ; i <= n/2 ; i++)
	{
		if(n % i == 0 )
		{
			
			isPrime=false;
			break;
			
		}
	}
		if(isPrime)
		{
			System.out.print(n+"  is a prime number");
		
		}
		else{
			System.out.print(n+"  is not a prime number");
		}
		input.close();
	
	
	
	}
}