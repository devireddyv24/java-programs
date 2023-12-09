import java.util.*;
class Twodi 
{
	public static void main(String[] args) 
	{
		System.out.println("Hello World!");
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number row");

		int row=sc.nextInt();
		System.out.println("enter the number col");
		int col=sc.nextInt();
		int a[][]=new int[row][col];
	
	for(int i=0;i<row;i++)
	{
		for(int j=0;j<col;j++)
		{
			a[i][j]=sc.nextInt();
		}
	}
	for(int i=0;i<row;i++)
		{
		for(int j=0;j<col;j++)
			{
			System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}
	}
}
