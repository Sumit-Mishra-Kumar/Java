import java.util.Scanner;
class DecToOctal
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number:");
		int n=sc.nextInt();
		int result=0;
		int i=1;
		while(n>0)
		{
			int reminder=n%8;
			result+=reminder*i;
			i*=10;
			n/=8;
		}
		System.out.println(result);
	}
}