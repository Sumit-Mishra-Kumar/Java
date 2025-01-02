import java.util.Scanner;
class PerfectNum 
{
	public static int Perfect(int n,int i,int sum)
	{
		if(i==0) return sum;
		if(n%i==0) sum+=i;
		return Perfect(n,i-1,sum);
	}
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int n=sc.nextInt();
		int i=n/2;
		int sum=0;
		int a=Perfect(n,i,sum);
		if(n==a) System.out.println("Perfect Number");
		else System.out.println("Not a perfect number");
	}
}
