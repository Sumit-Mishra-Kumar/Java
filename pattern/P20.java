import java.util.Scanner;
class P20
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int size=sc.nextInt();
		for(int i=1;i<=size;i++)
		{
			for(int j=1;j<=i-1;j++)
			{
				System.out.print(" ");
			}
			for(int k=i*2-1;k<=size;k++)
			{	
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
	
