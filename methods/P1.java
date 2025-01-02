import java.util.Scanner;
class P1 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the line number");
		int a=sc.nextInt();
		int num=1;
		for(int i=1;i<=a;i++)
		{
			for(int j=1;j<=i;j++)
			{
				num=getNextPrime(num);
				System.out.print(num+"\t");
			}
			System.out.println();
		}
	}
	public static int getNextPrime(int a)
	{
		int num=a+1;
		while(true)
		{
			if(PrimeNum.isPrime(num)) 
			{ 
				return num;
			}
			num++;
		}
	}
}
