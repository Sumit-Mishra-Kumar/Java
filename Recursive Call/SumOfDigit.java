import java.util.Scanner;
class SumOfDigit
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number");
		//int result=0;
		int n=sc.nextInt();
		System.out.println(sum(n));
	}
	public static int sum(int n)
	{
		/*if(n<1) return result;
		int reminder=n%10;
		result+=reminder;
		n/=10;
		return sum(n,result);*/
		if(n<=9) return n;
		return sum(n/10)+sum(n%10);
	}
}
