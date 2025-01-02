import java.util.Scanner;
class P14
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size:");
		int size=sc.nextInt();	
		for(int i=1;i<=size;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print(j);		
			}
			for(int j=i-1;j>=1;j--)
			{
				System.out.print(j);
			}
			System.out.println(); 
		}
	}
}
