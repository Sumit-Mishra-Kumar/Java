import java.util.Scanner;
class LeapYear
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter year");
		int a=sc.nextInt();
		if((a%4==0 && a%100!=0) || (a%400==0))
		{
			System.out.println(a+" is a leap year");
		}
		else
		{
			System.out.println(a+" is not a leap year");
		}
	}
}