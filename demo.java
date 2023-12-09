class dem
{
	public static void main(String[] args) 
	{
		System.out.println("hello");
		dem a1=new dem(2);
	}
	public dem(int a)
	{
	this(2,4);
	System.out.println(a);
	}
	public dem(int a,int b)
	{this(2,4,6);
		System.out.println(a+b);
	}
	public dem(int a,int b,int c)
	{
		System.out.println(a+b*c);
	}
}
