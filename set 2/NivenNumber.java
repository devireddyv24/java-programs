class NivenNumber 
{
	public static void main(String[] args) 
	{
		int num=126;
		int copyNum=num;
		int sum=0;
		int digit;
		do
		{
			digit=num%10;
			sum=sum+digit;
			num=num/10;

		}
		while (num!=0);
		//System.out.println("the sum of digits of given number is "+sum);
		if (copyNum%sum==0)
		{
			System.out.println("the given number is niven number");
		}
		else 
		{
			System.out.println("the given number is not niven number");
		}
	}
}
