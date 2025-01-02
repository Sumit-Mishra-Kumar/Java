import java.util.Scanner;
class NeonNum
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number:");
		int n=sc.nextInt();
		int result=0;
		int sq=n*n;
		while(sq>0)
		{
			int reminder=sq%10;
			result+=reminder;
			sq/=10;
		}
		if(n==result) System.out.println(n+" is a neon number");
		else System.out.println(n+" is not a neon number");
	}
}
				