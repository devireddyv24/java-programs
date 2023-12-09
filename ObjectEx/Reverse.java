package ObjectEx;

import java.util.Scanner;

public class Reverse {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the name");
		String s=sc.next();
		String v="";
		for(int i=0;i<s.length();i++)
		{
			v=s.charAt(i)+v;
		}
		System.out.println(v);
		if(v.equals(s))
		{
			System.out.println("give name is palindram");
		}
		else {
			System.out.println("enter the name is not palindram");
		}
		System.out.println(s.indexOf('a', 4));
	}

}
