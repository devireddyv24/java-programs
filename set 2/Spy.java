/*wap to enter  a number and check whether its a spy number or not sum is equal to the product
*/
import java.util.*;
class Spy
{
	public static void main(String [] args)
	{
		Scanner s=new Scanner(System.in);
		System.out.println("enter the num");
		int num=s.nextInt();
		int digit=0;
		int sum=0;int pro=1;
		do
		{
			digit=num%10;
			sum=sum+digit;
		pro=pro*digit;
		num=num/10;

		}
		while (num!=0);
		System.out.println(sum);
		System.out.println(pro);
		System.out.println(pro-sum);
		if(sum==pro)
		{
			System.out.println("given number is spy number");
		}
		else
		{
			System.out.println("given number is not spy number");
		}

}
}