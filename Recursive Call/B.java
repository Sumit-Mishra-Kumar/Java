class B
{
	public static void main(String[] args) 
	{
		m1(1);
	}
	public static void m1(int a)
	{
		System.out.println(a);
		if(a>=3) return;
		//m1(a++); stack overflow
		m1(++a);
		System.out.println(a);
	}
}
