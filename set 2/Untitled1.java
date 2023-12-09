//amstrong  number
import java.util.*;
class Amstrong
{ static int count=0;
	public static void count(int n)
	{
		
		while(n>0)
		{
			count++;
			n=n/10;
		}
	}
		public static int amsteong(int n)
		{int sum=0;int prod=1;
			while(n>0)
			{
				int digit=n%10;
				for(int i=1;i<=count;i++)
				{
					prod=prod*digit;
				}
				sum=sum+prod;
			}
			return sum;
		}
		public static void main(String [] args)
		{
			Scanner sc=new Scanner(System.in);
			System.out.println("enter the value");
			int num=sc.nextInt();
			count(num);
			if(num==amsteong(num))
				System.out.println("given number is amstrong");
			else
				System.out.println("given number is not amstrong);
		}

}