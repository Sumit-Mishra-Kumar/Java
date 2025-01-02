import java.util.Scanner;
class GuessNum
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Guess number in between (1 to 9):");
		int result=0;
		int n=(int)(Math.random()*9)+1;
		for(int i=1;i<=3;i++)
		{
			System.out.println("You have "+(4-i)+" chance left");
			int a=sc.nextInt();
			if(n==a)
			{	
				result+=10;
				if(i<3)
				{
					System.out.println("Your guess is right and guess next number");
					n=(int)(Math.random()*9)+1;
				}
			}
			else
			{
				System.out.println("Your guess is wrong");
			}
		}
		System.out.println("You do not have any chance");
		System.out.println("Your total score is:"+result);
	}
}
