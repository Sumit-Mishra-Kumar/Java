import java.util.Scanner;
class Factorial
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int a=sc.nextInt();
		int result=1;
		for(int i=1;i<=a;i++)
		{
			result*=i;
		}
		System.out.println("Factorial of "+a+" is "+result);
	}
}