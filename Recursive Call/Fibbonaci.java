import java.util.Scanner;
class Fibbonaci
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number");
		int n=sc.nextInt();
		display(0,1,n);
	}
	public static void display(int a,int b,int n)
	{
		if(n==0) return;
		System.out.println(a);
		display(b,a+b,n-1); 
	}
}
