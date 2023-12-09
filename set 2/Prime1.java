class Prime1 
{
	public static void main(String[] args) 
	{
		System.out.println("Hello World!");
		
		for(int i=10;i<=20;i++)
		{
			int count=0;
			for(int j=2;j<=i/2;j++)
			{
				if(i%j==0)
				{
					count++;
				}
			}
			if(count==0)
			{
				System.out.println(i);
			}
	}
}
}
