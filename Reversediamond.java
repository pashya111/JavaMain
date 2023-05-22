import java.util.Scanner;

public class Reversediamond{

	public static void main (String args[]){
	
	Scanner input = new Scanner(System.in);
	int n = input.nextInt();
	int j;
	for( int i = 0; i < n; i ++)
	{
		for (int k = 1 ; k < (n-i); k ++)
		{
			System.out.print("  ");
		}
		
		for ( j = n;j >= n-i;j--)
		{
			System.out.print(j+" ");
		}
		
		for (int l = j+2 ; l <= n; l ++)
		{
			System.out.print(l+" ");
		}
		
		
		System.out.println();
	
	}
	
	for( int i = n-2; i >= 1; i --)
	{
		for (int k = 1 ; k < (n-i); k ++)
		{
			System.out.print("  ");
		}
		
		for ( j = n;j >= n-i;j--)
		{
			System.out.print(j+" ");
		}
		
		for (int l = j + 2 ; l <= n; l ++)
		{
			System.out.print(l+" ");
		}
		
		
		System.out.println();
	
	}
	
	

	
	}

}