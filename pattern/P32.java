import java.util.Scanner;
class P32
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number:");
		int n=sc.nextInt();
		int stars=n/2;
		for(int i=1;i<=n;i++)
		{
			for(int k=1;k<=stars+1;k++)
			{
				System.out.print("*");
			}
			System.out.println();
			if(i<=n/2)
			{
				stars--;
			}
			else if(i>n/2)
			{
				stars++;
			}
		}
	}
}