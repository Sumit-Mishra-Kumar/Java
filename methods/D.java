class D
{
	public static void main(String[] args)
	{
		System.out.println("hello");
	}
	static int m1()
	{
		int sum=10+20;
		int prod=10*20;
		return sum;
		//return prod;//unreachable stmt
	}
}