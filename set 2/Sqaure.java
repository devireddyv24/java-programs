import java.util.*;
class Sqaure 
{
	public static void main(String[] args) 
	{
		System.out.println("Hello World!");
		Scanner s=new Scanner(System.in);
		System.out.println("enter the number");

		int n=s.nextInt();
		System.out.println("enter the power ");
		int k=s.nextInt();
		int square=1;
		for(int i=1;i<=k;i++)
		{
			square=square*n;
		}
		System.out.println(square);
	}
	}

