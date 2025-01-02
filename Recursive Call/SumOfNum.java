import java.util.Scanner;
class SumOfNum
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number");
		//int result=0;
		int n=sc.nextInt();
		System.out.println(display(n));
	}
	public static int display(int n)
	{
		/*if(a>b) return result;
		result+=a;
		return display(a+1,b,result);*/
		if(n==1) return 1;
		return n+display(n-1);
	}
}
