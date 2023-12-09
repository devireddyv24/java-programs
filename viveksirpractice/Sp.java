package viveksirpractice;

import java.util.Scanner;

public class Sp {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the size of array");
		int size=sc.nextInt();
		int[] a=new int[size];
		for(int i=0;i<size;i++){
			a[i]=sc.nextInt();
		}
		int sum=0;
		for(int i=0;i<size;i++){
		sum=sum+primeNumber(a[i]);
		}
		System.out.println(sum);
	}

	private static int primeNumber(int a) {
		int count=0,b=0;
		for(int i=2;i<=a;i++){
		if(a%i==0)
			count++;
		if(count==2)
			b=a;
		else
			b=0;
		}
		return b;
	}

}
