package viveksirpractice;

import java.util.Scanner;

public class Accurence {

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
		for(int i=0;i<a;i++) {
			int count=0;
			int count1=0;
			for(int j=0;j<a;j++) {
				if(b[i]==b[j])
				count++;
			}
			for(int j=i;j>=0;j--) {
				if(b[i]==b[j])
				count1++;
			}
			if(count1==1) {
				System.out.println(b[i]+"number of accurence is: "+count);
				
			}
		}

	}

}
