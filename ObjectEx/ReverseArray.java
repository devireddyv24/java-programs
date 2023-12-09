package ObjectEx;

import java.util.Scanner;

public class ReverseArray {

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
		reverse(b);
		

	}
	public static void reverse(int []a) {
		int b[]=new int[a.length];
		int j=a.length-1;
		for(int i=0;i<a.length;i++) {
			b[i]=a[j];
			j--;
		}
		for(int k:b) {
			System.out.println(k);
		}
	}

}
