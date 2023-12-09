class Maxm
{
	public static void main(String [] args)
	{
		int a[]={2,4,6,8,7}
		int max=a[0];
		int max2=0;
		for(int i=0;i<a.length;i++)
		{
			if(max<a[i])
			{
				max=a[i];
			}
		}
		for(int i=0;i<a.length;i++)
		{
			if(max2<a[i] && max2>max)
			{
				max2=a[i];
			}
		}
		System.out.println(max2);
	}
}