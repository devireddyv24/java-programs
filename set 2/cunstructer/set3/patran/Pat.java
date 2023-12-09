class Pat 
{
	public static void main(String[] args) 
	{
		System.out.println("Hello World!");
		int n=3;
		int k=0;
		for(int i=1;i<=4;i++)
		{
			
			for(int j=0;j<=k;j++)
			{
				System.out.print(" ");
			}
			k++;
			for(int j=0;j<=n;j++)
			{
				System.out.print("*");
			}
			n--;
			
			System.out.println();
		}
	}
}
