package arrays;
import java.util.*;

public class Hexadecimal {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("enter the binary values");
String s=scan.next();
int a=s.length();
char[]c= {'0','1','2','3','4','5','6','7','8','9','A','B','C','D','E','F'};
int sum,p;
String sc="";
while(a%4!=0)
{
	s="0"+s;
	a++;
}
System.out.println(s);
while(a>0)
{
	sum=0;
	p=1;
	for(int i=1;i<=4;i++)
	{
		int k=Integer.parseInt(s.charAt(a-1)+"");
		if(k!=0)
		{
			p=p*k;
			sum=sum+p;
		}
		p=p*2;
		a--;
	}
	//System.out.println(sum);
	sc=c[sum]+sc;
	
}
System.out.println("hexadecimal value is: "+sc);
	}
}
