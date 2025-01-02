import java.util.Scanner;
class MagicNum
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number: ");
		int n=sc.nextInt();
		int result=0;
		while(n>0)
		{	
			int reminder=n%10;
			result+=reminder;
			n/=10;
			if(n==0 && result>9)
			{
				n=result;
				result=0;
			}
		}
		if(result==1)
		{
			System.out.println("It ia a magic number");
		}
		else
		{
			System.out.println("It is not a magic number");
		}
	}
}
	
