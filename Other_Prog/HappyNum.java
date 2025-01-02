import java.util.Scanner;
class HappyNum 
{
	public static int isHappy(int n)
	{
		int sq=0;
		while(n!=0)
		{
			int reminder=n%10;
			sq+=reminder*reminder;
			n/=10;
		}
		return sq;
	}
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number:");
		int n=sc.nextInt();
		int m=n;
		while(m!=4 && m!=1)
		{
			m=isHappy(m);
		}
		if(m==1) System.out.println(n+" is happy number");
		else System.out.println(n+" is not happy number");
	}
}
