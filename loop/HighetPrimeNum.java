import java.util.Scanner;
class HighetPrimeNum
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number:");
		int a=sc.nextInt();int result=0;
		while(a>0)
		{
			boolean flag=true;
			int reminder=a%10;
			if(reminder<=1)
			{
				flag=false;
			}
			for(int i=2;i<=reminder/2;i++)
			{
				if(reminder%i==0)
				{
					flag=false;
					break;
				}
			}	
			if(flag) 
			{
				if(reminder>result)
				{
					result=reminder;
				}
			}
			a/=10;
		}
		System.out.println(result);
	}
}
			
			