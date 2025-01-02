class I 
{
	public static void main(String[] args)
	{
		System.out.println("I main starts");
		J.main(null);
		System.out.println("I main starts");
	}
}
class J 
{
	public static void main(String[] args)
	{
		System.out.println("J main starts");
		System.out.println("J main starts");
	}
}