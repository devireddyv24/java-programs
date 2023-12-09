//•	Armstorng number.
//An Armstrong number is a n digit number, which is equal to the sum of the nth powers of its digits. All the 1 digit numbers (1-9) are Armstrong number because 1*1=1 which is equals to number (1) itself, 2*1=2 which is equals to number (2) itself so on for all the 1 digit numbers (1-9). There are no 2 digit Armstrong numbers.
import java.util.*;
class Armstorng
{
	public static int count=0;
	public static int digit;
	public static void main(String[] args) 
	{
		System.out.println("Hello World!");
		int digit;
		Scanner sc= new Scanner(System.in);
		System.out.println("enter the num value:");
		int n=sc.nextInt();
		count(n);
		power(n);
	}
	public static void count(int num)
	{
		do
		{
			digit=num%10;
			count++;
			num=num/10;
		}
		while (num!=0);
		System.out.println("count of the digits of number:"+count);
	}
	public static void power(int num)
	{
		int sq=1;int sum=0;
		int temp=num;
		do
		{
			digit=num%10;
			for(int i=1;i<=count;i++)
			{
				
				sq=sq*digit;
				System.out.println( "value of sq "+sq);
			}
             sum=sum+sq;
			 sq=1;


			num=num/10;
		}
		while (num!=0);
		System.out.println(sum);
		if(sum==temp)
		{
			System.out.println("given number is amstrong");
		}
		
	}
}
