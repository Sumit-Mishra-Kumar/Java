class B
{
	public static void main(String[] args)
	{
		int i=m1();
		System.out.println("i = "+i);
		int j=m1()*2;
		System.out.println("j = "+j);
		System.out.println(m1());
		m1();
	}
	static int m1()
	{
		System.out.println("M1 executes");
		return 10;
	}
}