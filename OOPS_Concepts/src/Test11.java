import java.util.Scanner;

public class Test11 {

	public static void main(String[] args) {
		Scanner sc1=new Scanner(System.in);
		Scanner sc2=new Scanner(System.in);
		System.out.println("Enter the 1st Number:");
		int a=sc1.nextInt();
		System.out.println("Enter the 2nd Number:");
		int b=sc2.nextInt();	
		removeDuplicate(a,b);
	}
	public static void removeDuplicate(int a,int b)
	{
		String str1=""+a;
		String str2=""+b;
		String str3="";
		String str4="";
		char[] ch1=str1.toCharArray();
		char[] ch2=str2.toCharArray();
		for(int i=0;i<ch1.length;i++) {
			for(int j=0;j<ch2.length;j++) {
				if(ch1[i]==ch2[j])
				{
					ch1[i]='0';
					ch2[j]='0';
				}
			}
		}
		for(int k=0;k<ch1.length;k++)
		{
			str3+=ch1[k];
		}
		for(int j=0;j<ch2.length;j++)
		{
			str4+=ch2[j];
		}
		String str5=str3+str4;
		int num=Integer.parseInt(str5);
		int r=add(num);
		System.out.println(r);
	}
	public static int add(int a)
	{
		int result=0;
		while(true)
		{
			while(a!=0)
			{
				int reminder=a%10;
				result+=reminder;
				a/=10;
			}
			a=result;
			result=0;
			if(a<9)
				break;
			
		}
		return a;
	}
}
