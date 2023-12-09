//6.	Wap to reverse number
import java.util.*;
class  Reverse
{
	public static void main(String[] args) 
	{
		System.out.println("Hello World!");
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number");
		int n=sc.nextInt();
		int digit;int pro=0;
		do
		{
			digit=n%10;
			pro=pro*10+digit;
			System.out.println("every digit is "+digit);
			n=n/10;
			
		}
		while (n!=0);
		System.out.println("product of digits is "+pro);
	}
}