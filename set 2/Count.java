/*1.	Wap to count the digits of a number.*/
import java.util.*;
interface Count 
{
	public static void main(String[] args) 
	{
		System.out.println("Hello World!");
		int digit;int count=0;
		Scanner sc= new Scanner(System.in);
		System.out.println("enter the num value:");
		int num=sc.nextInt();
		do
		{
			digit=num%10;
			count++;
			num=num/10;
		}
		while (num!=0);
		System.out.println("count of the digits of number:"+count);
	}
}
