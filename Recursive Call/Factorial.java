import java.util.Scanner;
class Factorial
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number");
		int n=sc.nextInt();
		System.out.println(display(n));
	}
	public static int display(int n)
	{
		if(n==1) return 1;
		return n*display(n-1);
	}
}
