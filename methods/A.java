class A
{
	public static void main(String[] args)
	{
		System.out.println("Main executes");
		m1();
		System.out.println("Main ends");
	}
	static void m1()
	{
		System.out.println("M1 executes");
		//return;
	}
}