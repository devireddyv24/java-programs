package viveksirpractice;

import java.util.Scanner;

public class Maxodd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the size of array");
		int a=sc.nextInt();
		int []b=new int[a];
		System.out.println("enter the values of array");
		for(int i=0;i<a;i++)
		{
			b[i]=sc.nextInt();
		}
		maxodd(b);
		maxeven(b);

	}
	public static void maxodd(int a[]) {
		int max=0;int maxodd=0;
		for(int i=0;i<a.length;i++) {
			if(max<a[i]&&a[i]%2!=0) {
				max=a[i];
			
				
			}
			}
		System.out.println(max+"maxofodd num");
		}
	public static void maxeven(int a[]) {
		int max=0;int maxodd=0;
		for(int i=0;i<a.length;i++) {
			if(max<a[i]&&a[i]%2==0) {
				max=a[i];
		
	}
		}
		System.out.println("max even number in array"+max);
	}

		
	}


