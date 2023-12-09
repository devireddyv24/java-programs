class Maxm
{
	public static void main(String [] args)
	{
		int a[]={2,4,6,8,7};
		int max=a[0];
		int max2=a[0];
		int max3=0;
		for(int i=0;i<a.length;i++)
		{
			if(max<a[i])
			{
				max=a[i];
			}
		}
		System.out.println(max+"first max");
		for(int i=0;i<a.length;i++)
		{
			if(a[i]!=max)
			{
				if(max2<a[i])
				max2=a[i];
			}
		}
		System.out.println(max2+"second max");
		for(int i=0;i<a.length;i++)
		{
			if((a[i]!=max)&&(a[i]!=max2))
			{
				if(max3<a[i])
				max3=a[i];
			}
		}
		System.out.println(max3+"third max");
	}
}