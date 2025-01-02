class Demo4
{
	public static void m1(int a,double d)
	{
		System.out.println(a+" "+d);
	}
	public static void m1(double d,int a)
	{
		System.out.println(d+" "+a);
	}
	public static void main(String[] args)
	{
		m1(10,10.5);
		m1(9.5,11);
		//m1(15,16);compile time error
	}
}
	