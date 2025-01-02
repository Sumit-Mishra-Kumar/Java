class A
{
	public static void main(String[] args) 
	{
		byte a=10;//1 byte
		int b=a;//4 byte(widening)
		System.out.println(a+" "+b);
		int c=20;//4 byte 
		double d=c;//8 byte(widening)
		System.out.println(c+" "+d);
	}
}
