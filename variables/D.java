class D
{
	public static void main(String[] args)
	{
		System.out.println("Main method starts");
		D s1=new D();
		s1.m1();
		System.out.println("Main method ends");
	}
	public void m1()
	{
		System.out.println("Non static method starts");
		System.out.println("Non static method ends");
	}
}