class F 
{
	public static void main(String[] args) 
	{
		int a=5;
		m1(a);
		System.out.println("in main(),a="+a);
	}
	static void m1(int a)
	{
		a=10;
		System.out.println("in m1(),a="+a);
	}
}
