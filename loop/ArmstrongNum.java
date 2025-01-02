import java.util.Scanner;
class ArmstrongNum
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number: ");
		int n=sc.nextInt();
		int temp=n;
		int count=0;
		while(n>0)
		{
			n/=10;
			count++;
		}
		n=temp;
		int result=0;
		while(n>0)
		{
			int reminder=n%10;
			int mul=1;
			for(int i=1;i<=count;i++)
			{
				mul*=reminder;	
			}
			result+=mul;
			n/=10;
		}
		if(temp==result)
		{
			System.out.println(temp+" is an Armstrong number");
		}
		else
		{
			System.out.println(temp+" is not an Armstrong number");
		}
	}
}
	
	