import java.util.Scanner;
class ArmstrongNum 
{
	public static int Armstrong(int n)
	{
		if(n==0) return 0;
		return (int)Math.pow(n%10,3)+Armstrong(n/10);
	}
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int n=sc.nextInt();
		int a=Armstrong(n);
		if(n==a) System.out.println("Armstrong Num");
		else System.out.println("Not a Armstrong num");
	}
}