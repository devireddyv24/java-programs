class  Single
{
	public void m1()
	{
		System.out.println("Hello World!");
		System.out.println("print the 1st class ");

	}
}
class B extends Single
{
	public void m1()
	{
		System.out.println("print the m method");
	}
}
class Main
{
	public static void main(String[] args)
	{
		B b=new B();
	
		b.m1();
	}
}
