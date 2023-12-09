package arrays;

import java.util.Scanner;

public class Decimaltobinary {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the value");
		int a=sc.nextInt();
		while(a>0) {
			int digit=a%2;
		System.out.print(digit);
			a=a/2;
		}

	}

}
