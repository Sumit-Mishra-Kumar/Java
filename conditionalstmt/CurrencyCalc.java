import java.util.Scanner;
class CurrencyCalc
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the money: ");
		int a=sc.nextInt();
		if(a>=2000)
		{
			System.out.println("2000Rs X "+(a/2000));
			a%=2000;
		}
		if(a>=500)
		{
			System.out.println("500Rs X "+(a/500));
			a%=500;
		}
		if(a>=200)
		{
			System.out.println("200Rs X "+(a/200));
			a%=200;
		}
		if(a>=100)
		{
			System.out.println("100Rs X "+(a/100));
			a%=100;
		}
		if(a>=50)
		{
			System.out.println("50Rs X "+(a/50));
			a%=50;
		}
		if(a>=20)
		{
			System.out.println("20Rs X "+(a/20));
			a%=20;
		}
		if(a>=10)
		{
			System.out.println("10Rs X "+(a/10));
			a%=10;
		}
		if(a>=5)
		{
			System.out.println("5Rs X "+(a/5));
			a%=5;
		}
		if(a>=2)
		{
			System.out.println("2Rs X "+(a/2));
			a%=2;
		}
		if(a>=1)
		{
			System.out.println("1Rs X "+(a/1));
		}
	}
}	