class A
{
	public static void main(String[] args)
	{
		int a=10;//local variable
		System.out.println("Main method starts");
		System.out.println(a);
		A.m1();
		System.out.println(a);
		System.out.println("Main method ends");
	}
	public static void m1()
	{
		int a=20;//local variable
		System.out.println("M1 method starts");
		System.out.println(a);
		System.out.println("M1 method ends");
	}
}