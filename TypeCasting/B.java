class B 
{
	public static void m1(double d)
	{
		System.out.println("M1() is called");
	}
	public static void main(String[] args) 
	{
		m1(10);
		m1(10.0);
		m1(9.5f);
	}
}
