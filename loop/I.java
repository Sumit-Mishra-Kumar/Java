import java.util.Scanner;
class I
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number :");
		int a=sc.nextInt();
		int result=1;
		String str="";
		for(int i=1;i<=a;i++)
		{
			result*=i;
			str+=i;
			if(i<a) str+="*";
		}
		System.out.println(str+"="+result);
	}
}