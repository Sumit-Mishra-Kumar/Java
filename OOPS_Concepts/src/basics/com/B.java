package basics.com;
class A{
	static {
		System.out.println("A-static block");
	}
	A(){
		System.out.println("A-cons");
	}
	{
		System.out.println("A-non-static");
	}
	
}
public class B extends A{
	static {
		new A();
		System.out.println("B-static block");
		new B();
	}
	B(){
		System.out.println("B-cons");
	}
	{
		System.out.println("B-non-static");
	}
	public static void main(String[] args) {
		System.out.println("Main Executes");
	}

}
