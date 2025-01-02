import java.util.Scanner;
class N
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number:");
		int n=sc.nextInt();
		int result=0;
		do
		{
			while(n>0)
			{
				int reminder=n%10;
				result+=reminder;
				n/=10;
			}
				n=result;
				result=0;
			//if(n==0 && result>9)
			//{
				//n=result;
				//result=0;
			//}		
		}while(n>9);
		//System.out.println(result);
		System.out.println(n);
	}
}