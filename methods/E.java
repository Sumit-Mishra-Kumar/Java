class E
{
	public static void main(String[] args) 
	{
		//m1(); complie time error
		m1(5);
		m1(6+7);
		int i=8;
		m1(i);
		//m1(9,10); compile time error
	}
	static void m1(int a)
	{
		System.out.println("a= "+a);
	}
}
