class A 
{
	int n=10;
	static int a=20;
	public void m1() 
	{
		int n=30;
		System.out.println(n);
		System.out.println(this.n+" "+a);
	}
	static void m2(A e)
	{
		System.out.println(a);
		System.out.println(e.n);
	}
}
class Test1
{
	public static void main(String[] args)
	{
		A obj=new A();
		obj.m1();
		A.m2(obj);
	}
}
