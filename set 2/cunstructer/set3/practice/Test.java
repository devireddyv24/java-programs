
import java.util.*;
public class Test {
	public static void main(String [] args)
	{
	Scanner sc= new Scanner(System.in);
	int a=sc.nextInt();
	Test1 s=new Test1();
	int  c=s.Test1(a);
	System.out.println(c);

	}
}
	class Test1
	{
	
	public int Test1(int a)
		{
	int count=0;
for(int i=2;i<=a/2;i++)
{
	if(a%i==0)
	{
		count++;
	}
}
if(count==0)
{
	return a;
}
else
{
	return a;
}
}
}

