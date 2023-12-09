class Fibonacci
{
	public static void main(String[] args) 
	{
		int n=0;int n1=0;
		int n2=1;
		System.out.println(n1+" "+n2);
		for(int i=1;i<=10;i++)
		{
			n=n1+n2;
			System.out.println(n);
			n1=n2;
			n2=n;
	}
}
}
