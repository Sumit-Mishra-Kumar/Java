import java.util.Scanner;
class P3
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number:");
		int size=sc.nextInt();
		for(int i=1;i<=size;i++)
		{
			for(int j=i;j<=size;j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
	}
}