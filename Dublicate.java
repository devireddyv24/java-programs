//find dublicate words in string and remove dublicate words in string".
import java.util.*;
class Dublicate 
{
	

	public static void main(String [] args)
		{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the String");
		String s=sc.next();
	 char a[]=new char[s.length()];
		for(int i=0;i<s.length();i++)
			{
			a[i]=s.charAt(i);
			}
			/*
			for(int i=0;i<s.length();i++)
			{
				//System.out.println(a[i]);
			}
			for(int i=0;i<a.length;i++)
			{int count=1;
			char c=' ';
				for(int j=i+1;j<a.length;j++)
				{
					if((a[i]==a[j])&&(a[i]!='1'))
					{
						c=a[i];
						count++;
						a[j]='1';
					}
				}
				if(count>=1)
				{
					System.out.println("repeted leter is :"+c+" number of times is"+count);

				}

			}
			int count=0;
			for(int i=0;i<a.length;i++)
			{
				if (a[i]!='1')
				{
					//System.out.println(a[i]);
					count++;
				}
			}
			char j[]=new char[count];
				int f=0;
			for(int i=0;i<a.length;i++){
				if(a[i]!='1')
				{
					j[f]=a[i];
					f++;
					}
				}
			

			System.out.println(count);
			String c=new String(j);
			System.out.println(c);*/

			for(int i=0;i<a.length;i++){
				int c=0;
				for(int j=i+1;j<a.length;j++){
					if(a[i]==a[j])
					{
						a[j]=1;

				}
			}


	}
}
