/*Strong number is sum of digites of factorial is equal to the given number*/
import java.util.*;
class Strong 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the num value");
	int num,sum=0;
	num=sc.nextInt();
	int temp=num,r;
	int fact=1;
	while(temp!=0)
		{
		r=temp%10;
		fact=1;
		for(int i=1;i<=r;i++)
			{
			fact*=i;
			}
			sum+=fact;
			temp/=10;
		}
		if(num==sum)
		{
			System.out.println(num+"is Strong number");
		}
		else
		{
			System.out.println(num+"is not a strong number");
		}

	}
}
