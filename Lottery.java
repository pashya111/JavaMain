import java.util.Scanner;
public class Lottery
{
	public static void main(String args[])
	{
		int random;
        
		int a;
		
		random=(int)(Math.random()*(99-10+1)+10);
		
		
		Scanner s = new Scanner(System.in);
		System.out.println("Hello Welcome to Lottery ");
		System.out.println("Enter your Number "+" Lottery no is :"+random ); 
		a=s.nextInt();
		
		if(random == a)
		{
           System.out.println("Congratulations !! You Are Rewarded $ 10000");
	    }

		
		else if((random % 10)==(a % 10) || (random % 10) == (a / 10))	
		    {
			    System.out.println("Woh !! You are Close to match And Rewarded $ 1000");

		    }
		
		else if((random / 10)==(a % 10) || (random / 10) == (a / 10))	
			 {
				 System.out.println("Woh !! You are Close to match And Rewarded $ 1000");
			 }
		 
			else
			 {
				 System.out.println("Oops !! Fail Better Luck Next time");
			 }
			 
			 System.out.println(" Lottery Number is : " +random+ " And Your number is : "+a);
				 
		 }	
}