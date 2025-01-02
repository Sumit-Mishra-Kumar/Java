import java.util.Scanner;
class LCM
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter two number : ");
		int a=sc.nextInt();
		int b=sc.nextInt();
		int i=a>b?a:b;
		int n=i;
		while(true)
		{
			if(i%a==0 && i%b==0)
			{
				System.out.println("LCM is :"+i);
				break;
			}
			i+=n;
		}
	}
}