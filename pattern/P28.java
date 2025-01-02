import java.util.Scanner;
class P28
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number:");
		int n=sc.nextInt();
		int spaces=0;
		int stars=n;
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=spaces;j++)
			{
				System.out.print(" ");
			}
			for(int j=1;j<=stars;j++)
			{
				System.out.print("*");
			}
			System.out.println();
			if(i<=n/2)
			{
				spaces++;
				stars-=2;
			}
			else if(i>n/2)
			{
				spaces--;
				stars+=2;
			}
		}
	}
}
			
	