class Demo 
{
	public static int m1()
	{
		int a=4;
		if(a%4==0)
		{
			a++;
			++a;
			return a;
		}
		a++;
		return a;
	}
	public static void main(String[] args) 
	{
		System.out.println(m1());
	}
}
