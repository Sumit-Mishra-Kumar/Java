import java.util.Scanner;
class AgeVerification
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the age :");
		int age=sc.nextInt();
		if(age>=18)
		{
			if(age<=35)
			{
				System.out.println("You are young");
			}
			else
			{
				System.out.println("You are old");
			}
		}
		else
		{
			System.out.println("You are minor");
		}
	}
}