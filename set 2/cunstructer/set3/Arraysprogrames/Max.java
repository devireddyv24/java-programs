import java.util.*;
class Max
{
	
	public void array()
	{Scanner sc=new Scanner(System.in);
		System.out.println("enter the value of a");
int a=sc.nextInt();
int b[]=new int[a];
for(int i=0;i<a;i++)
		{
	b[i]=sc.nextInt();
		}
		for(int i=0;i<a;i++)
		{
			for(int j=++i;j<a;j++)
			{
				if(b[i]>b[j])
				{
					int c=b[i];
					b[i]=b[j];
					b[j]=c;
				}
			}
			System.out.println(b[i]);
			
		}
		for(int i=0;i<a;i++)
		{
			System.out.println(b[i]);
		}
	}
	public static void main(String [] ar)
	{
		Max m=new Max();
		m.array();
	}
	

	
}