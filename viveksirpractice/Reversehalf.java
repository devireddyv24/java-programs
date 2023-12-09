package viveksirpractice;

import java.util.Scanner;

public class Reversehalf {

	public static void main(String[] args) {
			// TODO Auto-generated method stub
			Scanner sc=new Scanner(System.in);
			System.out.println("enter the size of array");
			int a=sc.nextInt();
			int []b=new int[a];
			int c[]=new int[a];
			int sum=0;
			System.out.println("enter the values of array");
			for(int i=0;i<a;i++)
			{
				b[i]=sc.nextInt();
			}

	
	int mid=a/2;
	for(int i=0;i<=mid;i++) {
		c[i]=b[i];
		
	}int j=a-1;
	for(int i=mid+1;i<a;i++)
	{
		c[i]=b[j];
	}
	for (int i : c) {
		System.out.println(i);
		
	}

}
}
