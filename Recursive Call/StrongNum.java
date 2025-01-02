import java.util.Scanner;
class StrongNum 
{
	public static int Strong(int n)
	{
		if(n==0) return 0;
		return Fact(n%10)+Strong(n/10);
	}
	public static int Fact(int n)
	{
		if(n==1) return 1;
		return n*Fact(n-1);
	}
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int n=sc.nextInt();
		int a=Strong(n);
		if(n==a) System.out.println("Strong Num");
		else System.out.println("Not a Strong num");
	}
}
