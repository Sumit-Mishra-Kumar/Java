import java.util.Scanner;
class P29
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number:");
		int size=sc.nextInt();
		int n=2;
		for(int i=1;i<=size;i++)
		{
			for(int j=1;j<=i;j++)
			{
				while(true)
				{
					boolean flag=true;
					for(int k=2;k<=n/2;k++)
					{
						if(n%k==0)
						{
							flag=false;	
							break;
						}
					}
					if(flag)
					{
						System.out.print(n+"\t");
						n++;
						break;	
					}
					n++;
				}
			}
			System.out.println();
		}
	}
}
				