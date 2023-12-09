package ObjectEx;

import java.util.Scanner;

public class Stringtoint {
public static void main(String[] args) {
	
String rev="";
	Scanner s=new Scanner(System.in);
System.out.println("enter the string");
	String sc=s.next();
	for(int i=0;i<sc.length();i++)
	{
		if(sc.charAt(i)>='1'&&sc.charAt(i)<='9')
		{
			rev=rev+sc.charAt(i);
			System.out.println(sc.charAt(i));
		}
	}
	rev=rev.trim();
	int x=Integer.parseInt(rev);
	System.out.println(x);
	main(x);

}
public static void main(int n)
{
	int sum=0;int count=0;
	do {
		int digit=n%10;
			count++;
			sum=sum+digit;
			n=n/10;
	}
	while(n>0);
System.out.println(sum);
System.out.println(count);

		
	}
}

