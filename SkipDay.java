import java.util.Scanner;
class SkipDay
{
	public static void main(String args[])
	{
		Scanner input = new Scanner(System.in);
		System.out.print("Enter any Year : ");
		int y = input.nextInt();
		int skipDays = (y - 1) * 365 + (y - 1) / 4 - (y - 1) /100 + (y - 1) / 400 + 1;
		int theDay = skipDays % 7;
		if(theDay == 0)
			System.out.println("Sunday");
		if(theDay == 1)
			System.out.println("Monday");
		if(theDay == 2)
			System.out.println("Tuesday");
		if(theDay == 3)
			System.out.println("Wednesday");
		if(theDay == 4)
			System.out.println("Thursday");
		if(theDay == 5)
			System.out.println("Friday");
		if(theDay == 6)
			System.out.println("Saturday");
	}
}