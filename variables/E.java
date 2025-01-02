class E
{
	static int a=5;
	int b;
	public static void main(String[] args)
	{
		System.out.println("Main method starts");
		System.out.println(E.a + " static variable");
		int c=10;
		System.out.println(c + " local variable");
		E s1=new E();
		s1.b=20;
		System.out.println(s1.b + " 1st value of non static variable");
		s1.m1();
		System.out.println("Main method ends");
	}
	public void m1()
	{
		System.out.println("Non static method starts");
		//this.b=15;
		//System.out.println(this.b + " 2nd value of 1st non static variable"); 
		E s2=new E();
		s2.b=30;
		System.out.println(s2.b + " value of 2nd object non static variable");
		System.out.println("Non static method ends");
	}
}