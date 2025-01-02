import java.util.Scanner;
class CountDay
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the month number :");
		int a=sc.nextInt();
		System.out.println("Enter the year :");
		int b=sc.nextInt();
		switch(a)
		{
			case 1:
			case 3:
			case 5:
			case 7:
			case 8:	
			case 10:
			case 12:
				System.out.println("31 Days");
				break;
			case 4:
			case 6:
			case 9:
			case 11:
				System.out.println("30 Days");
				break;
			case 2:
				if((b%4==0 && b%100!=0) || (b%400==0))
				{
					System.out.println("29 Days");
				}
				else
				{
					System.out.println("28 Days");
				}
				break;
			default:
				System.out.println("Invalid Input");
		}
	}
}