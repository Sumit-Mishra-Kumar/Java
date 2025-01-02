import java.util.Scanner;
class BinToDec
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number:");
		int n=sc.nextInt();
		int result=0;
		//int i=0;
		int a=1;
		while(n>0)
		{
			int reminder=n%10;
			//result+=reminder*(int)Math.pow(2,i);
			result+=reminder*a;
			a*=	2;
			n=n/10;
		}
		System.out.println(result);
	}
}