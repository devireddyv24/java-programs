package ObjectEx;

public class Reversing {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="java html sql";
		String rev="";
		String []arg=s.split(" ");
for(int i=0;i<arg.length;i++)
{
	rev=rev+" "+main(arg[i]);
}
System.out.print(rev.trim());
	}
	public static String main(String s) {
		String rev="";
		for(int i=0;i<s.length();i++)
		{
			rev=s.charAt(i)+rev;
		}
		return rev;
		
	}

}
