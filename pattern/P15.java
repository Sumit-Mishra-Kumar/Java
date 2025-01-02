import java.util.Scanner;
class P15
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size:");
		int size=sc.nextInt();	
		int x=1;
		for(int i=1;i<=size;i++)
		{
			if(i%2!=0)
			{
				for(int j=1;j<=i;j++)
				{	
					System.out.print(x);
					System.out.print("\t");
					x++;
				}
			}
			else
			{
				int temp=x+i-1;
				for(int j=1;j<=i;j++)
				{
					System.out.print(temp);
					System.out.print("\t");
					x++;
					temp--;
				}		
			}
			System.out.println(); 
		}
	}
}
