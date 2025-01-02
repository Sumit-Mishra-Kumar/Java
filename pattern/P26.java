import java.util.Scanner;
class P26
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number:");
		int n=sc.nextInt();
		int stars=1;
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=stars;j++)
			{
				System.out.print("*");
			}
			System.out.println();
			if(i<=n/2)
			{
				stars++;
			}
			else if(i>n/2)
			{
				stars--;
			}
		}
	}
}
			
	