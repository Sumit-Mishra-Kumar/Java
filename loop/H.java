import java.util.Scanner;
class H
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number : ");
		int a=sc.nextInt();
		int sum=0;
		String s="";
		for(int i=1;i<=a;i++)
		{
			sum+=i;
			s+=i;
			if(i<a) s+="+";
		}
		System.out.println(s+"="+sum);
	}
}
		