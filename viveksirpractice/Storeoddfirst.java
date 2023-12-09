package viveksirpractice;

import java.util.Scanner;

public class Storeoddfirst {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the size of array");
		int a=sc.nextInt();
		int []b=new int[a];
		int c[]=new int[a];
		int k=0;int l=a-1;
		System.out.println("enter the values of array");
		for(int i=0;i<a;i++)
		{
			b[i]=sc.nextInt();
		}
		for(int i=0;i<b.length;i++)
		{
			if(b[i]%2!=0) {
				c[k]=b[i];
				k++;
			}
			if(b[i]%2==0) {
				c[l]=b[i];
				l--;
			}
			}
		for (int i : c) {
			System.out.println(i);
		}
			
		}
		}