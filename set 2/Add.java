class Spy
{
	public static void main(String [] args)
	{
		int num=2989;
		int digit=0;
		int sum=0;int pro=1;
		do
		{
			digit=num%10;
			sum=sum+digit;
		pro=pro*digit;
		num=num/10;

		}
		while (num!=0);
		System.out.println(sum);
		System.out.println(pro);
		if(sum==pro)
		{
			System.out.println("given number is spy number");
		}
		else
		{
			System.out.println("given number is not spy number");
		}

}
}