import java.util.Scanner;

public class AlphabatesDiamond{

	public static void main (String args[]){
	
	Scanner input = new Scanner(System.in);
	int n = input.nextInt();
	
	  //System.out.println();
  
        int i, j = 0;
  
        // for top half
        for (i = 1; i < n; i++) {
  
            // for left *
            for (j = i; j < n; j++)
                System.out.print((char)(j+64));
  
            // for middle " "
            for (j = 0; j < 2 * i ; j++)
                System.out.print(" ");
  
            // for right *
            for (j = i; j < n; j++)
                System.out.print((char)(j+64));
  
            System.out.println();
        }
	
	}

}