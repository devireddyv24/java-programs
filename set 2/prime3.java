class prime3
{
	static int count;
	public static void main(String[] args) 
	{
		System.out.println("Hello World!");
int n=100;int k=85;
		for(int i=--n;i>85;i--)
		{

prime(i);

			
		}
	}
	public static void prime(int i)
	{
		
			count=0;
//System.out.println(i);
			for(int a=2;a<=i/2;a++)
			{
				if(i%a==0)
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

