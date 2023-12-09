//FIND THE AVERAGE OF ARRAY OF ELEMENT
import java.util.*;
class Arr
{
	static int sum=0;
	static int max=0;
	public static void main(String[] args) 
	{
		System.out.println("Hello World!");
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the value of s");
		int s=sc.nextInt();
		int a[]=new int[s];
		for(int i=0;i<a.length;i++)
		{
			System.out.println("value of i");
			a[i]=sc.nextInt();
			sum=sum+a[i];
			max=a[0];
		}
		for(int i=0;i<s;i++)
		{if(a[i]<max)
			max=a[i];
		}
	
			System.out.println(max+"min value of given array");
		double set=sum/a.length;
		System.out.println(set);
		System.out.println(a[]);
	
	}
}
