class Demo1
{
	public static void m1()
	{
		System.out.println("M1-No-Arg");
	}
	public static void m1(int a)
	{
		System.out.println("M1-int-Arg");
	}
	public static void m1(int a,int b)
	{
		System.out.println("M1-int,int-Arg");
	}
	public static void main(String[] args)
	{
		m1();
		m1(10);
		m1(5,3);
	}
}
	