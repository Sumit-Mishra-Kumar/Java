import java.util.Scanner;
class P33
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int n=sc.nextInt();
		int stars=1,stars1=1,space=n-2;
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=stars;j++)
			{
				System.out.print("*");
			}
			for(int j=1;j<=space;j++)
			{
				System.out.print(" ");
			}
			for(int j=1;j<=stars1;j++)
			{
				System.out.print("*");
			}
			System.out.println();
			if(i<=n/2)
			{
				stars++;
				space-=2;
				if(i<n/2)
				stars1++;
			}
			else if(i>n/2)
			{
				stars--;
				space+=2;
				if(i>n/2+1)
				stars1--;
			}
		}
	}
}