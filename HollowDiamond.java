import java.util.Scanner;

public class HollowDiamond{

	public static void main (String args[]){
	
	Scanner input = new Scanner(System.in);
	int n = input.nextInt();
	
	for( int i = 1 ; i <= n ; i ++)
	{
		for (int k = 1 ; k <= (n-i); k ++)
		{
			System.out.print("  ");
		}
		
		for (int j = 1; j <= i; j ++)
		{
			if(j == 1)
			{
				System.out.print("# ");
			}
			else{
				System.out.print("  ");
			}
			
		}
		
		for (int l = i - 1; l >= 1; l --)
		{
			if ( l ==1 ){
				System.out.print("# ");
			}
			else{
				System.out.print("  ");
			}
			
		}
		
		System.out.println();
	
	}
	
	for( int i = n - 1 ; i >= 1 ; i --)
	{
		for (int k = 1 ; k <= (n-i); k ++)
		{
			System.out.print("  ");
		}
		
		for (int j = 1; j <= i; j ++)
		{
			if(j == 1)
			{
				System.out.print("# ");
			}
			else{
				System.out.print("  ");
			}
		}
		
		for (int l = i - 1; l >= 1; l --)
		{
			if(l == 1)
			{
				System.out.print("# ");
			}
			else{
				System.out.print("  ");
			}
		}
		
		System.out.println();
	
	}
	
	
	}

}