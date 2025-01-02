import java.util.Scanner;
class Automorphic
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number :");
		int a=sc.nextInt();
		int b=a; 
		int sqr=a*a;
		boolean flag=true;
		while(a>0)
		{
			if(a%10 != sqr%10)
			{
				flag=false;
				break;

			}
			a/=10;
			sqr/=10;
		}
		if(flag==true)
		{
			System.out.println(b+" is an automorphic number");
		}
		else
		{
			System.out.println(b+" is not an automorphic number");
		}
	}
}