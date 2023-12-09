import java.util.*;
class Testing 
{
	public static void main(String[] args) 
	{char c='a';
		System.out.println("Hello World!");
		Scanner sc=new Scanner(System.in);
		StringBuffer s=new StringBuffer("vamshi");
		String rev=" ";
		System.out.println(s.length());
		System.out.println(s.charAt(3));
		for(int i=s.length()-1;i>=0;i--)
		{
			rev=rev+s.charAt(i);
		s.replace("va","sv");
		System.out.println(rev);
		System.out.println(s);
		}
	}
}
