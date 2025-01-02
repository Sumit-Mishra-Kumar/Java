import java.util.Scanner;
class P10
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number:");
		int size=sc.nextInt();
		for(int i=1;i<=size;i++)
		{
			int k=size;
			for(int j=1;j<=size;j++)
			{
				if(i%2!=0)
				{
					System.out.print(j);
				}
				else
				{
					System.out.print(k);
					k--;
				}
			}
			System.out.println();
		}
	}
}