import java.util.Scanner;
public class test10 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String:");
		String s1=sc.nextLine();
		char[] ch=s1.toCharArray();
		int count=0;
		for(int i=0;i<ch.length;i++)
		{
			for(int j=i+1;j<ch.length;j++) {	
				if(ch[i]=='(') {
					if(ch[j]==')'){
						count++;
						break;
					}
				}
				if(ch[i]=='{') {
					if(ch[j]=='}') {
						count++;
						break;
					}
				}
				if(ch[i]=='[') {
					if(ch[j]==']') {
						count++;
						break;
					}
				}
			}
		}
		System.out.println(count);
	}
}
