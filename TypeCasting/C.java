class C 
{
	public static void main(String[] args) 
	{
		char ch='A';//2 byte 
		int a=ch;//4 byte(widening)
		System.out.println(a);
	}
}
