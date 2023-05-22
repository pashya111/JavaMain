import java.util.Scanner;
public class RepeatAddition{

	public static void main(String args[]){
	Scanner input = new Scanner(System.in);
	
	int n1 = (int)	(Math.random()*10);
	int n2 = (int)	(Math.random()*10);
     
     int count = 1;
     System.out.print("What is "+n1+" + "+ n2 +"?");
     int answer = input.nextInt();
     while(n1+n2 != answer){
     System.out.println("Your Answer is wrong , Please try again ");
     
     
     System.out.print("What is "+n1+" + "+ n2 +"?");
     answer = input.nextInt();
     
     count++;
     
     
     }
     
     System.out.print("Your answer is correct . Attempt taken :"+count);
     input.colse();
	
	}
}