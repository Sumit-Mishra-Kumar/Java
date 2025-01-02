import java.util.Scanner;
class DectoBin
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the num:");
		int n=sc.nextInt();
		//String str="";
		int i=1;
		int binary=0;
		while(n>0)
		{
			int reminder=n%2;
			//str=reminder+str;
			binary=reminder*i+binary;
			i*=10;
			n/=2;
		}
		System.out.println(binary);
	}
}
			 