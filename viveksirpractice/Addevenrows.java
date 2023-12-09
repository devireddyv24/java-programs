package viveksirpractice;

import java.util.Scanner;

public class Addevenrows {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int sum=0;
		System.out.println("enter the row length");
		int rowl=sc.nextInt();
		System.out.println("enter the colum length");
		int coll=sc.nextInt();
		int a[][]=new int[rowl][coll];
		for(int i=0;i<rowl;i++) {
			for(int j=0;j<coll;j++) {
				a[i][j]=sc.nextInt();
			}
		}
			for(int i=0;i<rowl;i++) {
				for(int j=0;j<coll;j++) {
					if((i+1)%2==0) {
						sum=sum+a[i][j];
					}
				}
					if(sum!=0) {
						System.out.println(sum +"sum of roe is");
					}
					sum=0;
					
				}
			
		
			for(int i=0;i<rowl;i++) {
				for(int j=0;j<coll;j++) {
					System.out.print(a[i][j]+" ");
				}
				System.out.println();
			
	}
			System.out.println(sum+"sum of all even rows");
	}

}
