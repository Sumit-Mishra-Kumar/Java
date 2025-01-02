import java.util.Scanner;
class PrimeNum 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the  number");
		int a=sc.nextInt();
		if(isPrime(a)) System.out.println("Prime number");
		else System.out.println("Not a prime number");
	}
	public static boolean isPrime(int n)
	{
		if(n<=1)
		{
			return false;
		}
		for(int i=2;i<=n/2;i++)
		{
			if(n%i==0) return false;
		}
		return true;
	}
}
