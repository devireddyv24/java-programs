package viveksirpractice;

import java.util.Scanner;

public class Closedvalues {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the size of array");
		int a=sc.nextInt();
		System.out.println("enter the target");
		int t=sc.nextInt();
		int []b=new int[a];
		int []c=new int[a-1];
		System.out.println("enter the values of array");
		for(int i=0;i<a;i++)
		{
			b[i]=sc.nextInt();
		}
		int j=0;for(int i=1;i<a;i++)
		{
			c[j]=b[i]+b[i-1];
			j++;
		}
		Closetarget.close(c,t);
		}
	}
