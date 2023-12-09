//9.	Wap to print the product of digits in odd places.
//
import java.util.*;
class  Oplace
{
	public static void main(String[] args) 
	{
		System.out.println("Hello World!");
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number");
		int n=sc.nextInt();
		digit(n);

	}
public static void orginal(int n)
	{
		int count=0;
		int digit;
		do
		{
			digit=n%10;
			count++;
			if(count%2!=0)
			{
			System.out.println("every digit is "+digit);
			}
			n=n/10;
			
		}
		while (n!=0);
	}
	public static void digit(int k)
	{
		int sum=0;
		int digit;
		do
		{
			digit=k%10;
			sum=sum*10+digit;
			
			k=k/10;
			
		}
		while (k!=0);
		orginal(sum);

}
}
