class B
{
	public static void main(String[] args)
	{
		int a=10;
		//System.out.println(a++);
		int b=15;
		//System.out.println(++b);
		int c=a++ + ++b;
		System.out.println(c);
		System.out.println(a);
		System.out.println(b);
	}	
}