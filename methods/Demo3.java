class Demo3
{
	public static void main()
	{
		System.out.println("Main()");
	}
	public static void main(int a)
	{
		System.out.println("Main(int a)");
	}
	public static void main(double d)
	{
		System.out.println("Main(double d)");
	}
	public static void main(String[] args)
	{
		main();
		main(10);
		main(10.5);
	}
}
	