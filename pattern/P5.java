import java.util.Scanner;
class P5
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number:");
		int size=sc.nextInt();
		for(int i=1;i<=size;i++)
		{
			for(int j=1;j<=size;j++)
			{
				if((i==j) || (i+j==size+1))
				{
					System.out.print("*");
				}
				else
				{
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
}