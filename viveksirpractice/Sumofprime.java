package viveksirpractice;

import java.util.Scanner;

public class Sumofprime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the size of array");
		int a=sc.nextInt();
		int []b=new int[a];
		int sum=0;
		System.out.println("enter the values of array");
		for(int i=0;i<a;i++)
		{
			b[i]=sc.nextInt();
		}
		for (int i : b) {
			sum=sum+prime(i);
		}

	}
	public static int prime(int i)
	{
		int b = 0;
			int count=0;
			for(int a=2;a<=i/2;a++)
			{
				if(i%a==0)
				{
					count++;
				}
			}
			if(count==0)
			{
				b=i;
				System.out.println(i);
			}
			return b;
			
		}


}
