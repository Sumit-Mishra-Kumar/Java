class Demo2
{
	public static void m1()
	{
		System.out.println("M1-No-Arg");
	}
	public static int m1(int a)
	{
		System.out.println("M1-int-Arg");
		return a;
	}
	public void m1(double d)
	{
		System.out.println("M1-double-Arg");
	}
	public static void main(String[] args)
	{
		m1();
		m1(10);
		Demo2 d=new Demo2();
		d.m1(5);
		d.m1(10.5);
	}
}
	