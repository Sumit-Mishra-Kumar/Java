import java.util.Scanner;
class Fibbonaci_2
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number:");
		int n=sc.nextInt();
		int n1=0,n2=1,result=0;
		System.out.print(n1+" "+n2+" ");
		while(true)
		{
			result=n1+n2;
			if(result>=n) break;	
			System.out.print(result+" ");
			n1=n2;
			n2=result;
		}
	}
}