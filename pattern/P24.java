import java.util.Scanner;
class P24
{	
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int n=sc.nextInt();
		int spaces=n/2;
		int stars=1;
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=spaces+1;j++)
			{
				System.out.print(" ");
			}
			for(int k=1;k<=stars;k++)
			{
				System.out.print("*");
			}
			System.out.println(" ");
			if(i<=n/2)
			{
				spaces--;
				stars+=2;
			}
			else if(i>n/2)
			{
				spaces++;
				stars-=2;
			}
		}
	}
}
	