//�	Strong number.
//sum of digits of factorial is equal to orginal number.
import java.util.*;
class Strong1
{
	public static int fact(int n)
	{
		int fact=1;
		for(int i=1;i<=n;i++)
		{
			fact=fact*i;
		}
		return fact;
	}
	public static void sum(int num)
	{
		int digit;int temp=num;
		int sum=0;
		do
		{
			digit=num%10;
			digit=fact(digit);
              sum=sum+digit;

			num=num/10;
		}
		while (num!=0);
		System.out.println("sum of the digits of number:"+sum);
		if(sum==temp)
		{
			System.out.println("given number is strong");
		}
	}
	public static void main(String [] args)
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("enter the num value:");
		int n=sc.nextInt();
		sum(n);
		
	}
}