import java.util.Scanner;
class CountLength 
{
	public static int count(int n)
	{
		if(n==0) return 0;
		return 1+count(n/10);
	}
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);		
		System.out.println("enter the number");
		int n=sc.nextInt();
		int a=count(n);
		System.out.println(a);
	}
}
