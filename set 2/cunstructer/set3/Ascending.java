//wap to enter 5 elements in an array and display them after them in ascending order.
import java.util.*;
class Ascending 
{
	public static void main(String[] args) 
	{
		System.out.println("Hello World!");
		Scanner sc= new Scanner(System.in);
		int a;
		System.out.println("enter the value of a");
		a=sc.nextInt();
		int [] b=new int[a];
		for(int i=0;i<a;i++)
		{
			b[i]=sc.nextInt();
			System.out.println("value of "+b[i]);
		}
		for(int i=0;i<a;i++)
		{
			for(int j=i+1;j<a;j++)
			{
		if(b[i]<b[j])
		{
             int c=b[i];
			b[i]=b[j];
			b[j]=c;
		
	}
			}
			System.out.println(b[i]);
		}

}

}
