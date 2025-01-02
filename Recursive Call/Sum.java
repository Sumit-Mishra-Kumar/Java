import java.util.Scanner;
class Sum
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number");
		int n=sc.nextInt();
		display(1,n);
	}
	public static void display(int a,int b)
	{
		if(a>b) return;
		System.out.println(a);
		display(a+1,b);
	}
}
