class A 
{
	public static void main(String[] args) 
	{
		m1(1);
	}
	public static void m1(int a)
	{
		System.out.println(a);
		if(a>=3) return;
		m1(a+1);
		System.out.println("m1 ends");
		System.out.println(a);
	}
}