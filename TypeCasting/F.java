class F 
{
	public static int m1(char ch)
	{
		return ch;//widening
	}
	public static void main(String[] args) 
	{
		System.out.println(m1('b'));
		System.out.println(m2(65));
		int n=(int)Math.pow(5,3);
		System.out.println(n);
		int n1=(int)(Math.random()*9)+1;
		System.out.println(n1);
	}
	public static char m2(int n)
	{
		return (char)n;//narrowing
	}
}
