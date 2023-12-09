//4.	Wap to print the digital product of number.
import java.util.*;
class  Pro
{
	public static void main(String[] args) 
	{
		System.out.println("Hello World!");
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number");
		int n=sc.nextInt();
		int digit;int pro=1;
		do
		{
			digit=n%10;
			pro=pro*digit;
			System.out.println("every digit is "+digit);
			n=n/10;
			
		}
		while (n!=0);
		System.out.println("product of digits is "+pro);
	}
}
