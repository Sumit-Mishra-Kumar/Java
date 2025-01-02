import java.util.Scanner;
class P17
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int size=sc.nextInt();
		for(int i=1;i<=size;i++)
		{
			for(int j=i;j<=size-1;j++)
			{
				System.out.print(" ");
			}
			for(int k=1;k<=i;k++)
			{
				if(i==size || k==1 || k==i)
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
	
