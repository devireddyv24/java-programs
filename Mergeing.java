// merge of two two arrays i.e combine two arrays.
import java.util.*;
class  Mergeing
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the value of a");
		int a=sc.nextInt();
		int b[]=new int[a];
		System.out.println("enter the value of k");
		int k=sc.nextInt();
		int c[]=new int[k];
		int res[]=new int[(b.length/2)+(c.length/2)];
		for(int i=0;i<a;i++)
		{
			System.out.println("enter the values of array b");
			b[i]=sc.nextInt();
		}
		for(int i=0;i<k;i++)
		{
			System.out.println("enter the values of array c");
          c[i]=sc.nextInt();
		}
		for(int i=0;i<a/2;i++)
		{
			res[i]=b[i];
		}
		int j=0;
		for(int i=(a/2);i<res.length;i++)
		{
			res[i]=c[j];
			j++;
		}
		for(int i=0;i<res.length;i++)
		{
			System.out.println(res[i]);
		}


	}
}
