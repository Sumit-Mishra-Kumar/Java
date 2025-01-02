import java.util.Scanner;
class ElectricityBill
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the unit : ");
		int a=sc.nextInt();
		System.out.println("Enter your pending bill amount : ");
		int b=sc.nextInt();
	        if(a<=20)
		{ 	
			if(b==0)
			{
				System.out.println("Your total bill is : 0Rs");
			}
			else
			{
				double c=b*0.1;
				double d=0+c+b;
				System.out.println("Your electric bill is : 0Rs");
				System.out.println("Your Pending bill is: "+b+"Rs");
				System.out.println("Penalty is: "+c+"Rs");
				System.out.println("Total Bill is :"+d+"Rs");
			}
		}
		else if(a>20 && a<=70)
		{
			int c=a-20;
			int d=c*2;
			if(b==0)
			{
				double g=d*0.05;
				double h=d-g;
				System.out.println("Your electric bill is : "+d+"Rs");
				System.out.println("Discount money is :"+g+"Rs");
				System.out.println("Total Bill is :"+h+"Rs");
			}
			else
			{	
				double e=b*0.1;
				double f=d+e+b;
				System.out.println("Your electric bill is : "+d+"Rs");
				System.out.println("Your Pending bill is: "+b+"Rs");
				System.out.println("Penalty is: "+e+"Rs");
				System.out.println("Total Bill is :"+f+"Rs");
			}
			
		}
		else if(a>70 && a<=100)
		{
			int c=a-70;
			int d=100+(c*4);
			if(b==0)
			{
				double g=d*0.05;
				double h=d-g;
				System.out.println("Your electric bill is : "+d+"Rs");
				System.out.println("Discount money is :"+g+"Rs");
				System.out.println("Total Bill is :"+h+"Rs");
			}
			else
			{
				double e=b*0.1;
				double f=d+e+b;
				System.out.println("Your electric bill is : "+d+"Rs");
				System.out.println("Your Pending bill is: "+b+"Rs");
				System.out.println("Penalty is: "+e+"Rs");
				System.out.println("Total Bill is :"+f+"Rs");
			}
		}
		else if(a>100 && a<=130)
		{
			int c=a-100;
			int d=220+(c*7);
			if(b==0)
			{
				double g=d*0.05;
				double h=d-g;
				System.out.println("Your electric bill is : "+d+"Rs");
				System.out.println("Discount money is :"+g+"Rs");
				System.out.println("Total Bill is :"+h+"Rs");
			}
			else
			{
				double e=b*0.1;
				double f=d+e+b;
				System.out.println("Your electric bill is : "+d+"Rs");
				System.out.println("Your Pending bill is: "+b+"Rs");
				System.out.println("Penalty is: "+e+"Rs");
				System.out.println("Total Bill is :"+f+"Rs");
			}
		}
		else
		{
			int c=a-130;
			int d=430+(c*15);
			if(b==0)
			{
				double g=d*0.05;
				double h=d-g;
				System.out.println("Your electric bill is : "+d+"Rs");
				System.out.println("Discount money is :"+g+"Rs");
				System.out.println("Total Bill is :"+h+"Rs");
			}
			else
			{
				double e=b*0.1;
				double f=d+e+b;
				System.out.println("Your electric bill is : "+d+"Rs");
				System.out.println("Your Pending bill is: "+b+"Rs");
				System.out.println("Penalty is: "+e+"Rs");
				System.out.println("Total Bill is :"+f+"Rs");
			}
		}
	}
}