import java.util.Scanner;
class P11
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number:");
		int size=sc.nextInt();
		for(int i=1;i<=size;i++)
		{
			if(i%2!=0)
			{
				int x=(i-1)*size;
				for(int j=1;j<=size;j++)
				{
					x++;
					System.out.print(x);
					System.out.print("\t");
				}
			}
			else
			{
				int x=i*size;
				for(int j=1;j<=size;j++)
				{
					System.out.print(x);
					System.out.print("\t");
					x--;
				}
			}
			System.out.println();
		}
	}
}