import java.util.Scanner;
class GCD
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter two numbers :");	
		int a=sc.nextInt();
		int b=sc.nextInt();
		int n=a<b?a:b;
		while(n!=1)
		{
			if(a%n==0 && b%n==0)
			{
				System.out.println("GCD is :"+n);
				break;
			} 
			n--;
		}
		if(n==1)
		{
			System.out.println("The given two number are not having any GCD");
		}
	}
}