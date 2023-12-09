import java.util.*;
class Evenplace
{
	public static void main(String [] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the digit");
		int a=sc.nextInt();
		int count=0;
		int b=a;
		do{
			int digit=a%10;
			count++;
			a=a/10;
		}
		while(a!=0);
		//f(count%2!=0)
	      //count++;
		a=b;
		do{
			int digit=a%10;
			count--;
			if(count%2!=0)
				System.out.println(digit);
			a=a/10;
		}
		while(a!=0);
		
	}
}