import java.util.Scanner;
class M
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int a=sc.nextInt();
		int result1=0;
		int result2=0;
		while(a>0)
		{
			int reminder=a%10;
			if(reminder%2==0)
			{
				result1+=reminder;
			}
			else
			{
				result2+=reminder;
			}
			a/=10;
		}
		System.out.println("Addition of even digit: "+result1);
		System.out.println("Addition of odd digit: "+result2);
	}
}