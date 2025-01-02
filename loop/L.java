import java.util.Scanner;
class L
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number :");
		int a=sc.nextInt();
		int result=0;
		while(a>0)
		{
			int reminder=a%10;
			result+=reminder;
			a/=10;
		}
		System.out.println(result);
	}
}