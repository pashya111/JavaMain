import java.util.Scanner;
public class Emi{
	public static void main (String args[]){
	   Scanner myObj = new Scanner(System.in);
	   System.out.print("Enter Amount = ");
	   int a = myObj.nextInt();
	   System.out.print("Enter Interest Rate = ");
	   float i = myObj.nextFloat();
	   System.out.print("Enter Tenure Years = ");
	   int y = myObj.nextInt();
	   
	   float TotalInterest = ( a * i/100 * y);
	   
	   float TotalAmount = TotalInterest +	a ;
	   float emi = TotalAmount / (12 * y) ;
	   System.out.print("Emi Per Months = " + emi);
}
}