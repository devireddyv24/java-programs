//abstraction in non static helper method.
interface A
{
	public void test();
}
class B implements A
{
	public void test()
	{
		System.out.println("enter the value of a");
	}
}
class Help
{
	public A help()
	{
		A c=new B();
		return c;
	}
}
class Imp
{
	public static void main(String [] args)
	{

		Help h=new Help();
		A c=h.help();
		c.test();
	}
}