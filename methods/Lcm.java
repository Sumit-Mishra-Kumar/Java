import java.util.Scanner;
class Lcm 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the two numbers");
		int a=sc.nextInt();
		int b=sc.nextInt();
		int result=lcm(a,b);
		System.out.println("LCM is="+result);
	}
	public static int lcm(int a,int b)
	{
		int n=a>b?a:b;
		int i=n;
		while(true)
		{
			if(i%a==0 && i%b==0)
			{
				return i;
			}
			i+=n;
		}
	}
}
