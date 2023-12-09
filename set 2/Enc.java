class Enc
{
	private int x=20;
	public int sum()
	{
		System.out.println(x);
		return x;
	}
	public void sum1(int y)
	{
		
		x=y;
}
}
class B
{
	public static void me()
	{
		Enc a=new Enc();
		int y=35;
		a.sum1(y);
		a.sum();

		//System.out.println(y);
	}
	public static void main(String[] args)
	{
		me();
	}
}