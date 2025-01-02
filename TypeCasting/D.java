class D 
{
	public static void m1(double d)
	{
		System.out.println(d);
	}
	public static void main(String[] args) 
	{
		m1(10);
		m1(10.5);
		m1(9.5f);
		m1('A');
		m1('a'+1);
	}
}
