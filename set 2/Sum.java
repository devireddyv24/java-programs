import java.util.*;
class Sum
{
	public static void main(String [] args)
	{
		int count=0;int num;
		int j=0;
		int n=0;int s=1;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number");
		num=sc.nextInt();
		int k=num;
		while(num!=0)
			{
			n=num%10;
			count++;
			num=num/10;
		}
		System.out.println(count);
		while(k!=0)
			{
			j=k%10;
			for(int i=0;i<=count;i++)
				{
				s=s*j;
				}

			k=k/10;
			}
			System.out.println(s);
	}


}
