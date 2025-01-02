class B
{
	static int a;
	public static void main(String[] args)
	{	
		int a=10;
		System.out.println(B.a);
		B.a=20;
		System.out.println(B.a);
		System.out.println(a);		
	}
}