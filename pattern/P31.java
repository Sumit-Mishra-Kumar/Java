import java.util.Scanner;
class P31
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number:");
		int n=sc.nextInt();
		int space=n-1;
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=space;j++)
			{
				System.out.print(" ");
			}
			for(int k=i;k>=1;k--)
			{
				System.out.print(k);
			}
			for(int k=1;k<=i-1;k++)
			{
				System.out.print(k+1);
			}
			System.out.println();
			space--;
		}
	}
}