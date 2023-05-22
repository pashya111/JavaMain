import java.util.Scanner;
public class Day{
	public static void main(String args[]){
		Scanner myObj = new Scanner(System.in);
		System.out.print("a = ");
		int a=myObj.nextInt();
		//Scanner myObj = new Scanner(System.in);
		System.out.print("b = ");
		int b = myObj.nextInt();
		
		String arr[] = {"Sunday","Monday","Tuesday","Wednesday","Thursday","Friday","Saturday"};
		
		int day = (a + b) % 7 ;
		
		System.out.println(arr[day]);
		
	}
}