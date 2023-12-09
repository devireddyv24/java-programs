class Add
{
	Add(int a,int b)
	{
		this(20,30,3);
		System.out.println(a+b);
	}
	Add(int a,int b,int c)
	{
		System.out.println(a+b+c);
	}
}
class main
{
	public static void main(String [] args)
	{
		Add a=new Add(12,20);
	}
}