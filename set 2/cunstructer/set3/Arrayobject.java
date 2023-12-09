
import java.util.Scanner;

public class Arrayobject {
	public static void main(String [] args) {
		Scanner c=new Scanner(System.in);
		System.out.println("enter the number of a");
		int a=c.nextInt();
		int[] b=new int[a];
		for(int i=0;i<a;i++)
		{
			b[i]=c.nextInt();
		}
		for(int i=0;i<a;i++)
		{
			int count=0;
			int count1=0;
			for(int j=0;j<a;j++)
			{
				if(b[i]==b[j]) {
					count++;
				}
			}
			for(int j=i;j>=0;j--)
			{
				if(b[i]==b[j])
				{
					count1++;	
				}
			}
			if(count1==1)
			{
				System.out.println(b[i]+"number of itarations is"+count);
			}
		}
	}
	

}
