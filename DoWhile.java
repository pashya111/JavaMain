import java.util.Scanner;
public class DoWhile{

	public static void main(String args[]){
	Scanner input = new Scanner(System.in);
	
	int n1 = (int)	(Math.random()*10);
	int n2 = (int)	(Math.random()*10);
     
     int count = 0;
     int answer ;
     do
     {
     	System.out.print("What is "+n1+" + "+ n2 +"?  ");
     	answer = input.nextInt();
     	if(n1 + n2 != answer )
    	 {
          System.out.println("Your Answer is wrong , Please try again ");
    	 }
     	count = count + 1;
     }while(n1 + n2 != answer);
     
      System.out.print("Your answer is correct . Attempt taken :"+count);
      input.close();
     
     
     }
}