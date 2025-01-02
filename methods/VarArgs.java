class VarArgs 
{
	public static void m1(int... a)
	{
		for(int n:a)
		System.out.println(n);
		System.out.println("----------");
	}
	public static void main(String[] args) 
	{
		m1(10);
		m1(10,20);
		m1(10,20,30);
	}
}
