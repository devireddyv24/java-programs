package viveksirpractice;

import java.util.Scanner;

public class Maxnumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the size of array");
		int a=sc.nextInt();
		int []b=new int[a];
		int max=0;
		int max1=0;
		int max2=0;
		System.out.println("enter the values of array");
		for(int i=0;i<a;i++)
		{
			b[i]=sc.nextInt();
		}
		for(int i=0;i<a;i++) {
			if(max<b[i]) {
				max=b[i];
			}
		}
		System.out.println(max);
		for(int i=0;i<a;i++) {
			if(max!=b[i]&&max1<b[i])
			{
				max1=b[i];
			}
		}
		System.out.println(max1);
		for(int i=0;i<a;i++) {
			if(max!=b[i]&&max2<b[i]&&max1!=b[i])
			{
				max2=b[i];
			}
			

	}
		System.out.println(max2);

}
}
