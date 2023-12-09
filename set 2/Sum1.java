//3.	Wap to print the digital sum of a number.
import java.util.*;
class  Sum1
{
	public static void main(String[] args) 
	{
		System.out.println("Hello World!");
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number");
		int n=sc.nextInt();
		int digit;int sum=0;
		do
		{
			digit=n%10;
			sum=sum+digit;
			System.out.println("every digit is "+digit);
			n=n/10;
			
		}
		while (n!=0);
		System.out.println("sum of digits is "+sum);
	}
}
