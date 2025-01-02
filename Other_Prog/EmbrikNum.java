import java.util.Scanner;
class EmbrikNum 
{
	public static boolean isPrime(int n)
	{
		boolean flag=true;
		if(n<=1) flag=false;
		for(int i=2;i<=n/2;i++)
		{
			if(n%i==0)
			{
				flag=false;
			}
		}
		return flag;
	}
	public static int reverseNum(int n)
	{
		String str="";
		while(n!=0)
		{
			int reminder=n%10;
			str=str+reminder;
			n/=10;
		}
		int a=Integer.parseInt(str);
		return a;
	}
		
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number");
		int n=sc.nextInt();
		if(isPrime(n))
		{	
			int m=reverseNum(n);
			if(n!=m)
			{
				if(isPrime(m))
				{
					System.out.println(n+" is a embrik number");
				}
				else
				{
					System.out.println(n+" is not a embrik number");
				}
			}
			else
			{
				System.out.println(n+" is not a embrik number");
			}
		}
		else
		{
			System.out.println(n+" is not a embrik number");
		}
	}
}