import java.util.Scanner;
class P13
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size:");
		int size=sc.nextInt();	
		for(int i=1;i<=size;i++)
		{
			for(int j=1;j<=size;j++)
			{
				if(i>=j)
				{	
					System.out.print(i);
				}
				else
				{	
					System.out.print(i+1);
				}		
			}
			System.out.println(); 
		}
	}
}