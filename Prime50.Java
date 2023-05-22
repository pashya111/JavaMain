import java.util.Scanner;

public class Prime50{

	public static void main(String args[]){
			
	  
      int isPrime = 1; 
      int num = 3; 
      int count=0;     
      Scanner scanner = new Scanner(System.in); 
      System.out.println("Enter the value of Prime no's required:"); 
      int n = scanner.nextInt(); 
      for ( int i = 1 ; i <=n ;  ) 
      {       
         for ( int j = 2 ; j <= num/2 ; j++ ) 
         { 
            if ( num % j == 0 ) 
            { 
               isPrime = 0; 
               break; 
            } 
         } 
            if ( isPrime != 0 ) 
            { 
           		System.out.printf(" %4d ",num); 
            	i++; 
            	count++;           
            } 
         isPrime = 1; 
         num++; 
         if(count % 10 == 0)
         {
      	 	System.out.println();
      	 }
      
      }          
}
}

