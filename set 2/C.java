class  C
{
	public static void main(String[] args) 
	{
		int num=700;
		double sum=1;
		int count=0;
		double d=1;
		while(num>0)
		{
			double digit=num%10;
			if(digit==0)
			{
			count++;
			for(int i=1;i<=count;i++)
				d=d*10;
			}
			sum=digit/d;
			num=num/10;
			System.out.println(sum);
	}
	}
}
