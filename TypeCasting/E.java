class E 
{
	public static void main(String[] args) 
	{
		int a=10;//4 byte
		byte b=(byte)a;//1 byte(narrowing)
		System.out.println(a+" "+b);

		double d=9.5;//8 byte
		int n=(int)d;//4 byte(narrowing)
		System.out.println(d+" "+n);

		int n1=97;//4 byte 
		char ch=(char)n1;//2 byte(narrowing)
		System.out.println(n1+" "+ch);

		int n2=129;
		byte b1=(byte)n2;
		System.out.println(n2+" "+b1);

		byte b2=10;//2 byte
		int n3=(int)b2;//4 byte(widening)
		System.out.println(b2+" "+n3);
		
		float f1=10.5f;//4 byte
		long l1=(long)f1;//8 byte(narrowing)
		System.out.println(f1+" "+l1);
		
		long l2=15;//8 byte
		float f2=l2;//4 byte(widening)
		System.out.println(l2+" "+f2);
	}
}
