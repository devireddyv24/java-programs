//2.	Wap to print every digit of a given number.
import java.util.*;
class  Digit
{
	public static void main(String[] args) 
	{
		System.out.println("Hello World!");
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number");
		int n=sc.nextInt();
		int digit;
		do
		{
			digit=n%10;
			System.out.println("every digit is "+digit);
			n=n/10;
			
		}
		while (n!=0);
	}
}
