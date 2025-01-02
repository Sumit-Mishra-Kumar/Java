import java.util.Scanner;
class PositiveNegative
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number :");
		int a=sc.nextInt();
		if(a>0)
		{
			System.out.println(a+" is positive number");
		}
		else
		{
			System.out.println(a+" is negative number");
		}
	}
}