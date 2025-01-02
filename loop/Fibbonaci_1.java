import java.util.Scanner;
class Fibbonaci_1
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the range:");
		int n=sc.nextInt();
		int n1=0,n2=1,result=0;
		System.out.print(n1+" "+n2+" ");
		for(int i=3;i<=n;i++)
		{
			result=n1+n2;	
			System.out.print(result+" ");
			n1=n2;
			n2=result;
		}
	}
}