import java.util.*;
class Factofarray 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the value of a");
		int a=sc.nextInt();
		int b[]=new int[a];
		for(int i=0;i<a;i++)
		{
			System.out.println("enter value of array");
			b[i]=sc.nextInt();
		}
		for(int i=0;i<a;i++)
		{
			int fact=1;
			for(int j=1;j<=b[i];j++)
			{
				fact=fact*j;
			}
			System.out.println(b[i]+" factrorial is : "+fact);
		}
	}
}
