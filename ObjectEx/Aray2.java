package ObjectEx;

import java.util.Scanner;

public class Aray2 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the name");
		String s=sc.next();
		String v="";
	
		for(int i=0;i<s.length();i++)
		{
			int count=0;
			int count1=0;
			for(int j=0;j<s.length();j++)
			{
				if(s.charAt(i)==s.charAt(j))
					count++;
			}
			for(int j=i;j>=0;j--) {
				if(s.charAt(i)==s.charAt(j))
					count1++;
			}
			if(count1==1) {
			v=v+s.charAt(i);
			}
		}
		System.out.println(v);
	}
	

}
